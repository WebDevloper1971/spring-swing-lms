package com.lms.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.starter.models.LibraryMember;

public interface LibraryMemberRepository extends JpaRepository<LibraryMember, Long> {

}
