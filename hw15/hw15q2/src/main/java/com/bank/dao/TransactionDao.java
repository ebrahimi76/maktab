package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Transaction;

import javax.persistence.EntityManager;

public class TransactionDao extends BaseDao<Transaction,Integer> {
    public TransactionDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Transaction> getEntityClass() {
        return Transaction.class;
    }
}
