package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.DebitCard;

import javax.persistence.EntityManager;

public class DebitCardDao extends BaseDao<DebitCard,Integer> {
    public DebitCardDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<DebitCard> getEntityClass() {
        return DebitCard.class;
    }
}
