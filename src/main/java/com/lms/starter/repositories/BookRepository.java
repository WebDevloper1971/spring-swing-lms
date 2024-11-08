package com.lms.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.starter.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
