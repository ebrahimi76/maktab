package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Customer;

import javax.persistence.EntityManager;

public class CustomerDao extends BaseDao<Customer,Integer> {
    public CustomerDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Customer> getEntityClass() {
        return Customer.class;
    }
}
