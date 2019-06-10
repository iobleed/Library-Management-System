package com.casper.LibraryManagementSystem.web.service;

import com.casper.LibraryManagementSystem.business.domain.UserAccount;
import com.casper.LibraryManagementSystem.business.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class AccountServiceController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET, path = "/accounts")
    public List<UserAccount> getAllUserAccounts() {
        return accountService.retrieveAllUserAccounts();
    }


    @PostMapping(path = "/accounts")
    public UserAccount newUserAccount(@RequestBody UserAccount userAccount){
        return accountService.addNewUserAccount(userAccount);
    }
}
