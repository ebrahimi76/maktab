package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Transfer;

import javax.persistence.EntityManager;

public class TransferDao extends BaseDao<Transfer,Integer> {
    public TransferDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Transfer> getEntityClass() {
        return Transfer.class;
    }
}
