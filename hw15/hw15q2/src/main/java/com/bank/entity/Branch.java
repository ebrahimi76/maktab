package com.bank.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Branch extends Bank {

    @ManyToOne
    private Bank bank;

    @OneToOne(mappedBy = "branch", cascade = CascadeType.ALL)
    private Manager manager;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Teller> tellers;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Account> accounts;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    public Branch() {
        super();
    }

    public Branch(String name, String city, String address) {
        super(name);
        this.city = city;
        this.address = address;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Teller> getTellers() {
        return tellers;
    }

    public void setTellers(List<Teller> tellers) {
        this.tellers = tellers;
    }

    @Override
    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Branch branch = (Branch) o;
        return Objects.equals(city, branch.city) && Objects.equals(address, branch.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), city, address);
    }

    @Override
    public String toString() {
        return "city=" + city +
                ", address='" + address;
    }
}
