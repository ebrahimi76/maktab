package com.bank.entity;

import com.bank.base.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Bank extends BaseEntity {

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    List<Branch> branches;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    List<Customer> customers;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    List<Account> accounts;

    @Column(name = "name")
    private String name;

    public Bank() {
        super();
    }

    public Bank(String name) {
        this.name = name;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "name=" + name;
    }
}
