package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.BranchDao;
import com.bank.entity.Branch;

public class BranchService extends BaseService <Branch,Integer>{
    public BranchService() {
        setBaseDao(new BranchDao(getEntityManager()));
    }

    public BranchDao getBaseDao() {
        return (BranchDao) super.getBaseDao();
    }
}
