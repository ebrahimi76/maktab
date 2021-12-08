package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Withdraw extends Transaction {

    @Column(name = "amount")
    private Long amount;

    public Withdraw() {
        super();
    }
}
