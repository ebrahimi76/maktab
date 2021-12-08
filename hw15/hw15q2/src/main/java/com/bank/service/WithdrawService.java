package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.WithdrawDao;
import com.bank.entity.Withdraw;

public class WithdrawService extends BaseService<Withdraw,Integer> {
    public WithdrawService() {
        setBaseDao(new WithdrawDao(getEntityManager()));
    }

    public WithdrawDao getBaseDao() {
        return (WithdrawDao) super.getBaseDao();
    }
}
