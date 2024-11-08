package com.lms.starter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lms.starter.models.LibraryMember;
import com.lms.starter.services.LibraryMemberService;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private LibraryMemberService memberService;

    @GetMapping
    public List<LibraryMember> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{id}")
    public LibraryMember getMemberById(@PathVariable Long id) {
        return memberService.getMemberById(id);
    }

    @PostMapping
    public LibraryMember addMember(@RequestBody LibraryMember member) {
        return memberService.addMember(member);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
    }
}
