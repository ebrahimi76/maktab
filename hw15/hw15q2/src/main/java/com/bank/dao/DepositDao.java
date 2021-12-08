package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Deposit;

import javax.persistence.EntityManager;

public class DepositDao extends BaseDao<Deposit,Integer> {
    public DepositDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Deposit> getEntityClass() {
        return Deposit.class;
    }
}
