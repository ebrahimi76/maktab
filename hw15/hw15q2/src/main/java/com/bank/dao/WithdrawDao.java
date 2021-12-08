package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Withdraw;

import javax.persistence.EntityManager;

public class WithdrawDao extends BaseDao<Withdraw,Integer> {
    public WithdrawDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Withdraw> getEntityClass() {
        return Withdraw.class;
    }
}
