package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Employee extends Person {

    @Column(name = "education_rate")
    private Education educationRate;

    public Employee() {
        super();
    }
}
