package com.casper.LibraryManagementSystem;

import com.casper.LibraryManagementSystem.data.data_structure.Address;

public class UnitTest {
    public static void main(String[] args){
        Address add = new Address();
        System.out.println(add.getCity());
        add.setCity("Lucknow");
        System.out.println(add.getCity());
    }
}
