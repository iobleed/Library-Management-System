package com.casper.LibraryManagementSystem.business.service;

import com.casper.LibraryManagementSystem.business.domain.UserAccount;
import com.casper.LibraryManagementSystem.data.dataStructure.Enums;
import com.casper.LibraryManagementSystem.data.entity.Librarian;
import com.casper.LibraryManagementSystem.data.entity.Member;
import com.casper.LibraryManagementSystem.data.repository.LibrarianRepository;
import com.casper.LibraryManagementSystem.data.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private final MemberRepository memberRepository;
    @Autowired
    private final LibrarianRepository librarianRepository;

    public AccountService(MemberRepository memberRepository, LibrarianRepository librarianRepository) {
        this.memberRepository = memberRepository;
        this.librarianRepository = librarianRepository;
    }

    public List<UserAccount> retrieveAllUserAccounts() {

        List<UserAccount> userAccountList = new ArrayList<>();

        Iterable<Member> members = this.memberRepository.findAll();
        if(null!=members){
            members.forEach(
                    member -> {
                        UserAccount userAccount = new UserAccount();
                        userAccount.setUserId(member.getUserId());
                        userAccount.setPassword(member.getPassword());
                        userAccount.setAccountType(Enums.ACCOUNT_TYPE.MEMBER);
                        userAccountList.add(userAccount);
                    }
            );
        } else {
            System.out.println("No Member in ACCOUNT table");
        }


        Iterable<Librarian> librarians = this.librarianRepository.findAll();
        if(null!=librarians){
            librarians.forEach(
                    librarian -> {
                        UserAccount userAccount = new UserAccount();
                        userAccount.setUserId(librarian.getUserId());
                        userAccount.setPassword(librarian.getPassword());
                        userAccount.setAccountType(Enums.ACCOUNT_TYPE.LIBRARIAN);
                        userAccountList.add(userAccount);
                    }
            );
        } else {
            System.out.println("No Librarian in ACCOUNT table");
        }
        return userAccountList;
    }

    public UserAccount addNewUserAccount(UserAccount userAccount) {

        if(userAccount.getAccountType() == Enums.ACCOUNT_TYPE.MEMBER){

            Member member = new Member();
            member.setUserId(userAccount.getUserId());
            member.setPassword(userAccount.getPassword());
            member.setTotalBooksCheckedout(1);
            this.memberRepository.save(member);
            userAccount.setId(member.getId());

        } else if(userAccount.getAccountType() == Enums.ACCOUNT_TYPE.LIBRARIAN) {
            Librarian librarian = new Librarian();
            librarian.setUserId(userAccount.getUserId());
            librarian.setPassword(userAccount.getPassword());
            this.librarianRepository.save(librarian);
            userAccount.setId(librarian.getId());

        } else {
            System.out.println("Unknown User Account Type");
        }
        return userAccount;
    }

}
