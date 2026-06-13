package com.practice.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
// telling spring to map this java class to a db table
@Entity
public class Member {
    // telling spring to use this ID as the primary key for jpa
    @Id
    // this will assign id's automatically similar to the ++nextId used in the
    // hashmap implementation.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate hireDate;
    private BigDecimal salary;
    private BigDecimal contributionRate;


    Member() {}

    public Member(Long id, String name, LocalDate hireDate, BigDecimal salary, BigDecimal contributionRate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.contributionRate = contributionRate;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public BigDecimal getContributionRate() {
        return this.contributionRate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setContributionRate(BigDecimal contributionRate) {
        this.contributionRate = contributionRate;
    }
}

