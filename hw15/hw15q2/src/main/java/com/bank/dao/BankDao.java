package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Bank;

import javax.persistence.EntityManager;

public class BankDao extends BaseDao<Bank,Integer> {
    public BankDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Bank> getEntityClass() {
        return Bank.class;
    }
}
