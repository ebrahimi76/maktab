package com.bank.entity;

import com.bank.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class DebitCard extends BaseEntity {

    @Column(name = "ccv2")
    private Short cvv2;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "password")
    private String password;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Account account;

    public DebitCard() {
        super();
    }
}
