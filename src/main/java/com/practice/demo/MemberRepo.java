package com.practice.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public interface MemberRepo extends JpaRepository<Member, Long> {
//    Optional<Member> findById(Long id);
//    Member save(Member member);
//    List<Member> findAll();
//    void deleteById(Long id);
    // now letting jpa handle this
}
