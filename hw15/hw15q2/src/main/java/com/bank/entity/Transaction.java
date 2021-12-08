package com.bank.entity;

import com.bank.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Transaction extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @ManyToOne
    private Account account;

    @ManyToMany
    private List<Teller>tellers;

    public Transaction() {
        super();
    }

    public Account getAccount() {
        return account;
    }
}
