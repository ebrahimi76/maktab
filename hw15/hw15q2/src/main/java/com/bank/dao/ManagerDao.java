package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Manager;

import javax.persistence.EntityManager;

public class ManagerDao extends BaseDao<Manager,Integer> {
    public ManagerDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Manager> getEntityClass() {
        return Manager.class;
    }
}
