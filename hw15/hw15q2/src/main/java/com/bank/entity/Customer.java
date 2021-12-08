package com.bank.entity;

import javax.persistence.*;

@Entity
public class Customer extends Person {

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private DebitCard card;

    @ManyToOne
    private Bank bank;

    @Column(name = "account_type")
    private AccountNo accountNo;

    @Column(name = "account_id")
    private Integer accountId;

    public Customer() {
        super();
    }

    public Customer(String name, String family, Integer age, Long nationalCode, String address,
                    Long phoneNumber, String email) {
        super(name, family, age, nationalCode, address, phoneNumber, email);
        accountNo = account.getAccountNo();
        accountId = account.getId();
    }

    public static class CustomerBuilder extends PersonBuilder {
        public Customer build() {
            return new Customer();
        }
    }
    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }
}
