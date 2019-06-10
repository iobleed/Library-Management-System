package com.casper.LibraryManagementSystem.business.service;

import com.casper.LibraryManagementSystem.business.domain.LibrarianAccount;
import com.casper.LibraryManagementSystem.business.domain.MemberAccount;
import com.casper.LibraryManagementSystem.business.domain.UserAccount;
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

    public List<MemberAccount> retrieveAllMember() {

        Iterable<Member> members= this.memberRepository.findAll();
        List<MemberAccount> memberAccountList = new ArrayList<>();
        if(null!=members){
            members.forEach(
                    member -> {
                        MemberAccount memberAccount = new MemberAccount();
                        memberAccount.setUserId(member.getUserId());
                        memberAccount.setPassword(member.getPassword());
                        memberAccount.setTotalBooksCheckedout(member.getTotalBooksCheckedout());
                        memberAccountList.add(memberAccount);
                    }
            );
        } else {
            System.out.println("No Member in ACCOUNT table");
        }
        return memberAccountList;
    }

    public List<LibrarianAccount> retrieveAllLibrarian() {
        Iterable<Librarian> librarians= this.librarianRepository.findAll();
        List<LibrarianAccount> librarianAccountArrayList = new ArrayList<>();
        if(null!=librarians){
            librarians.forEach(
                    librarian -> {
                        LibrarianAccount librarianAccount = new LibrarianAccount();
                        librarianAccount.setUserId(librarian.getUserId());
                        librarianAccount.setPassword(librarian.getPassword());
                        librarianAccountArrayList.add(librarianAccount);
                    }
            );
        } else {
            System.out.println("No Librarian in ACCOUNT table");
        }
        return librarianAccountArrayList;
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
                        userAccountList.add(userAccount);
                    }
            );
        } else {
            System.out.println("No Librarian in ACCOUNT table");
        }
        return userAccountList;
    }


}
