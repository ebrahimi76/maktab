package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Employee;

import javax.persistence.EntityManager;

public class EmployeeDao extends BaseDao<Employee,Integer> {
    public EmployeeDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Employee> getEntityClass() {
        return Employee.class;
    }
}
