package com.casper.LibraryManagementSystem.business.domain;

enum ACCOUNT_TYPE {
    MEMBER,
    LIBRARIAN
}

public class UserAccount {
    private long id;
    private String userId;
    private String password;
    private ACCOUNT_TYPE accountType;

    public ACCOUNT_TYPE getAccountType() {
        return accountType;
    }

    public void setAccountType(ACCOUNT_TYPE accountType) {
        this.accountType = accountType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
