package com.bank.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Teller extends Employee {

    @ManyToOne
    private Branch branch;

    @ManyToMany
    private List<Transaction>transactions;

    public Teller() {
        super();
    }
}
