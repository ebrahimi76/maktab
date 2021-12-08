package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.AccountDao;
import com.bank.entity.Account;

public class AccountService extends BaseService <Account,Integer>{
    public AccountService() {
        setBaseDao(new AccountDao(getEntityManager()));
    }

    public AccountDao getBaseDao() {
        return (AccountDao) super.getBaseDao();
    }
}
