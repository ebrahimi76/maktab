package com.bank.entity;

import com.bank.base.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class Account extends BaseEntity {

    @ManyToOne
    private Branch branch;

    @ManyToOne
    private Bank bank;

    @OneToOne
    private Customer customer;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private DebitCard card;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    @Column(name = "value")
    private Long value;

    @Column(name = "type")
    private AccountNo accountNo;

    @Column(name = "branch_location")
    private String branchLocation;

    @Column(name = "date_of_opening")
    private LocalDate dateOfOpening;

    public Account() {
        super();
    }

    public Account(Long value, AccountNo accountNo) {
        this.value = value;
        this.accountNo = accountNo;
        branchLocation = branch.getAddress();
        dateOfOpening = LocalDate.now();
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DebitCard getCard() {
        return card;
    }

    public void setCard(DebitCard card) {
        this.card = card;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public AccountNo getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(AccountNo accountNo) {
        this.accountNo = accountNo;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public LocalDate getDateOfOpening() {
        return dateOfOpening;
    }

    public void setDateOfOpening(LocalDate dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
    }

    @Override
    public String toString() {
        return "value=" + value +
                ", accountNo=" + accountNo +
                ", branchLocation=" + branchLocation +
                ", dateOfOpening=" + dateOfOpening;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Account account = (Account) o;
        return Objects.equals(value, account.value) && accountNo == account.accountNo &&
                Objects.equals(branchLocation, account.branchLocation) &&
                Objects.equals(dateOfOpening, account.dateOfOpening);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), value, accountNo, branchLocation, dateOfOpening);
    }

    public static class AccountBuilder {
        private Long value;
        private AccountNo accountNo;

        public AccountBuilder value(Long value) {
            this.value = value;
            return this;
        }

        public AccountBuilder accountNo(AccountNo accountNo) {
            this.accountNo = accountNo;
            return this;
        }

        public Account build() {
            return new Account(value, accountNo);
        }
    }

    public static AccountBuilder builder() {
        return new AccountBuilder();
    }
}
