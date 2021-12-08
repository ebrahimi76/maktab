package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Branch;

import javax.persistence.EntityManager;

public class BranchDao extends BaseDao<Branch,Integer> {
    public BranchDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Branch> getEntityClass() {
        return Branch.class;
    }
}
