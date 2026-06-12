package com.practice.demo;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class Member {
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

