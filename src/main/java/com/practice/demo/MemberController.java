package com.practice.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/{id}")
    public Optional<Member> findById(@PathVariable Long id) {
        return memberService.findById(id);
    }

    @GetMapping("/members")
    public List<Member> findAll() {
        return memberService.findAll();
    }

    @DeleteMapping("/members/{id}")
    public void deleteById(@PathVariable Long id) {
        memberService.deleteById(id);
    }

    @PostMapping("/members")
    public Member save(@RequestBody Member member) {
        return memberService.save(member);
    }

    @PutMapping("/members/{id}")
    public void setId(@PathVariable Long id, @RequestBody Member member) {
        member.setId(id);
    }
}
