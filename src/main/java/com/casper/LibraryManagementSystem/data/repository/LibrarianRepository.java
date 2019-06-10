package com.casper.LibraryManagementSystem.data.repository;

import com.casper.LibraryManagementSystem.data.entity.Librarian;
import org.springframework.data.repository.CrudRepository;

public interface LibrarianRepository extends CrudRepository <Librarian, Long> {
}
