package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.BankDao;
import com.bank.entity.Bank;

public class BankService extends BaseService <Bank,Integer>{
    public BankService() {
        setBaseDao(new BankDao(getEntityManager()));
    }

    public BankDao getBaseDao() {
        return (BankDao) super.getBaseDao();
    }
}
