package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.CustomerDao;
import com.bank.entity.Customer;

public class CustomerService extends BaseService<Customer,Integer> {
    public CustomerService() {
        setBaseDao(new CustomerDao(getEntityManager()));
    }

    public CustomerDao getBaseDao() {
        return (CustomerDao) super.getBaseDao();
    }
}
