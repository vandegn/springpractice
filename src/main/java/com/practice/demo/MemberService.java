package com.practice.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepo repo;
    // spring gives
    public MemberService(MemberRepo repo) {
        this.repo = repo;
    }

    public List<Member> findAll() {
        return repo.findAll();
    }

    public Member save(Member member) {
        return repo.save(member);
    }

    public Optional<Member> findById(Long id) {
        return repo.findById(id);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
