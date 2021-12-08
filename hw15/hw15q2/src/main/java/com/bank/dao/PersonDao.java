package com.bank.dao;

import com.bank.base.BaseDao;
import com.bank.entity.Person;

import javax.persistence.EntityManager;

public class PersonDao extends BaseDao<Person, Integer> {
    public PersonDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Person> getEntityClass() {
        return Person.class;
    }
}
