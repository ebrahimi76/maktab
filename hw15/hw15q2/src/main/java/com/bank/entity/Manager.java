package com.bank.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Manager extends Employee {

    @OneToOne
    private Branch branch;

    public Manager() {
        super();
    }
}
