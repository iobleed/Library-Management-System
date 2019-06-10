package com.casper.LibraryManagementSystem.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Member extends Account {

    private int totalBooksCheckedout;

    public int getTotalBooksCheckedout() {
        return totalBooksCheckedout;
    }

    public void setTotalBooksCheckedout(int totalBooksCheckedout) {
        this.totalBooksCheckedout = totalBooksCheckedout;
    }
}
