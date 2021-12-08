package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.ManagerDao;
import com.bank.entity.Manager;

public class ManagerService extends BaseService<Manager,Integer> {
    public ManagerService() {
        setBaseDao(new ManagerDao(getEntityManager()));
    }

    public ManagerDao getBaseDao() {
        return (ManagerDao) super.getBaseDao();
    }
}
