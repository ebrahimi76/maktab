package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.TransferDao;
import com.bank.entity.Transfer;

public class TransferService extends BaseService<Transfer,Integer> {
    public TransferService() {
        setBaseDao(new TransferDao(getEntityManager()));
    }

    public TransferDao getBaseDao() {
        return (TransferDao) super.getBaseDao();
    }
}
