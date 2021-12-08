package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.TellerDao;
import com.bank.entity.Teller;

public class TellerService extends BaseService<Teller,Integer> {
    public TellerService() {
        setBaseDao(new TellerDao(getEntityManager()));
    }

    public TellerDao getBaseDao() {
        return (TellerDao) super.getBaseDao();
    }
}
