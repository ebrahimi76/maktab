package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.EmployeeDao;
import com.bank.entity.Employee;

public class EmployeeService extends BaseService<Employee,Integer> {
    public EmployeeService() {
        setBaseDao(new EmployeeDao(getEntityManager()));
    }

    public EmployeeDao getBaseDao() {
        return (EmployeeDao) super.getBaseDao();
    }
}
