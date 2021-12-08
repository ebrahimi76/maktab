package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.DebitCardDao;
import com.bank.entity.DebitCard;

public class DebitCardService extends BaseService<DebitCard,Integer> {
    public DebitCardService() {
        setBaseDao(new DebitCardDao(getEntityManager()));
    }

    public DebitCardDao getBaseDao() {
        return (DebitCardDao) super.getBaseDao();
    }
}
