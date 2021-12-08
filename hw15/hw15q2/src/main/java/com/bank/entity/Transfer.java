package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Transfer extends Transaction {

    @Column(name = "amount")
    private Long amount;

    @Column(name = "account_serial")
    private Integer accountId ;

    @Column(name = "target_account_serial")
    private Integer targetAccountId;

    public Transfer() {
        super();
    }
}
