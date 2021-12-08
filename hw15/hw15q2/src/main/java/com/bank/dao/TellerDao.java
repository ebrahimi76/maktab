package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Teller;

import javax.persistence.EntityManager;

public class TellerDao extends BaseDao<Teller,Integer> {
    public TellerDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Teller> getEntityClass() {
        return Teller.class;
    }
}
