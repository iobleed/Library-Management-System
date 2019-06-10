package com.casper.LibraryManagementSystem;

import com.casper.LibraryManagementSystem.data.dataStructure.Address;

public class UnitTest {
    public static void main(String[] args){
        Address add = new Address();
        System.out.println(add.getCity());
        add.setCity("Lucknow");
        System.out.println(add.getCity());
    }
}
