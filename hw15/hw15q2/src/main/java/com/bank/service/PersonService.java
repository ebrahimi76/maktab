package com.bank.service;

import com.bank.base.BaseService;
import com.bank.dao.PersonDao;
import com.bank.entity.Person;

public class PersonService extends BaseService<Person,Integer> {
    public PersonService() {
        setBaseDao(new PersonDao(getEntityManager()));
    }

    public PersonDao getBaseDao() {
        return (PersonDao) super.getBaseDao();
    }
}
