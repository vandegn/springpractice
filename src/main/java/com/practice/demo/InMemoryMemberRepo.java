package com.practice.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryMemberRepo implements MemberRepo {
    private final Map<Long, Member> map = new HashMap<>();
    private Long nextId = 1L;
    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    @Override
    public Member save(Member member) {
        if (member.getId() == null) {
            member.setId(nextId);
            map.put(nextId, member);
            ++nextId;
        } else {
            map.put(member.getId(), member);
        }
        return member;
    }

    @Override
    public List<Member> findAll() {
        return List.copyOf(map.values());
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }
}
