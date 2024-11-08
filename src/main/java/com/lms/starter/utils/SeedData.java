package com.lms.starter.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lms.starter.models.Book;
import com.lms.starter.models.LibraryMember;
import com.lms.starter.services.BookService;
import com.lms.starter.services.LibraryMemberService;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    LibraryMemberService memberService;

    @Autowired
    BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        LibraryMember m1 = new LibraryMember();
        LibraryMember m2 = new LibraryMember();

        m1.setName("member one");
        m1.setEmail("member@one.com");
        m1.setPassword("memberOnePassword");

        m2.setName("member two");
        m2.setEmail("member@two.com");
        m2.setPassword("memberTwoPassword");

        Book b1 = new Book();
        Book b2 = new Book();

        b1.setTitle("Shrimad Bhagvatgita");
        b1.setAuthor("Lord Krishna");
        b1.setIsbn("108108108");

        b2.setTitle("Shrimad Ramayan");
        b2.setAuthor("Rishi Valmiki");
        b2.setIsbn("1110811108");

        memberService.addMember(m1);
        memberService.addMember(m2);

        bookService.addBook(b1);
        bookService.addBook(b2);

    }

}
