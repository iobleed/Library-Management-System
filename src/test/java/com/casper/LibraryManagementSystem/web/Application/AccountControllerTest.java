package com.casper.LibraryManagementSystem.web.Application;

import com.casper.LibraryManagementSystem.business.domain.LibrarianAccount;
import com.casper.LibraryManagementSystem.business.domain.MemberAccount;
import com.casper.LibraryManagementSystem.business.domain.UserAccount;
import com.casper.LibraryManagementSystem.business.service.AccountService;
import com.casper.LibraryManagementSystem.web.application.AccountController;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(AccountController.class)
public class AccountControllerTest {

    @MockBean
    private AccountService accountService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAccounts() throws Exception{
//        List<UserAccount> userAccountList = new ArrayList<>();
//
//        List<MemberAccount> mockMemberAccountList = new ArrayList<>();
//        MemberAccount mockMemberAccount = new MemberAccount();
//        mockMemberAccount.setUserId("singhs7");
//        mockMemberAccount.setPassword("123");
//        mockMemberAccount.setTotalBooksCheckedout(5);
//
//        LibrarianAccount mockLibrarianAccount = new LibrarianAccount();
//        mockLibrarianAccount.setUserId("librarianId1");
//        mockLibrarianAccount.setPassword("pas123");
//
//        given(accountService.retrieveAllMember().willReturn(mockMemberAccountList));
//        this.mockMvc.perform(get("/account"))
    }
}
