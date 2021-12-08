package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Account;

import javax.persistence.EntityManager;
public class AccountDao extends BaseDao<Account,Integer> {
    public AccountDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Account> getEntityClass() {
        return Account.class;
    }
}
