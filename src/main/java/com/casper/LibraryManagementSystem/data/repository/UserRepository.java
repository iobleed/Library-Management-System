package com.casper.LibraryManagementSystem.data.repository;

import com.casper.LibraryManagementSystem.data.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository <User, Long> {

}
