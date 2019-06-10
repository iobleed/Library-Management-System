package com.casper.LibraryManagementSystem.business.domain;

public class MemberAccount {

    private String userId;
    private String password;
    private int totalBooksCheckedout;

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

    public int getTotalBooksCheckedout() {
        return totalBooksCheckedout;
    }

    public void setTotalBooksCheckedout(int totalBooksCheckedout) {
        this.totalBooksCheckedout = totalBooksCheckedout;
    }
}
