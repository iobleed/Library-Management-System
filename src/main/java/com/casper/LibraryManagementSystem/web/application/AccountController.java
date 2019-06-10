package com.casper.LibraryManagementSystem.web.application;

import com.casper.LibraryManagementSystem.business.domain.UserAccount;
import com.casper.LibraryManagementSystem.business.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping( method = RequestMethod.GET)
    public String getMemberAccounts(Model model){
        List<UserAccount> userAccountList =  this.accountService.retrieveAllUserAccounts();
        model.addAttribute("userAccounts", userAccountList);
        return "accountsView";
    }

    //@RequestMapping(path="member", method = RequestMethod.POST)

}
