package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.DepositDao;
import com.bank.entity.Deposit;

public class DepositService extends BaseService<Deposit,Integer> {
    public DepositService() {
        setBaseDao(new DepositDao(getEntityManager()));
    }

    public DepositDao getBaseDao() {
        return (DepositDao) super.getBaseDao();
    }
}
