package com.lms.starter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.starter.models.LibraryMember;
import com.lms.starter.repositories.LibraryMemberRepository;

import java.util.List;

@Service
public class LibraryMemberService {
    @Autowired
    private LibraryMemberRepository memberRepository;

    public List<LibraryMember> getAllMembers() {
        return memberRepository.findAll();
    }

    public LibraryMember getMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    public LibraryMember addMember(LibraryMember member) {
        return memberRepository.save(member);
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
