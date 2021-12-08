package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.TransactionDao;
import com.bank.entity.Transaction;

public class TransactionService extends BaseService<Transaction,Integer> {
    public TransactionService() {
        setBaseDao(new TransactionDao(getEntityManager()));
    }

    public TransactionDao getBaseDao() {
        return (TransactionDao) super.getBaseDao();
    }
}
