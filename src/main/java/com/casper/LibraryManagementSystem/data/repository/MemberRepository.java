package com.casper.LibraryManagementSystem.data.repository;

import com.casper.LibraryManagementSystem.data.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository <Member, Long> {
}
