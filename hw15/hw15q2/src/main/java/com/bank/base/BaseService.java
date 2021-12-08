package com.bank.base;

import com.mysql.cj.exceptions.DataReadException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class BaseService<T extends BaseEntity, ID extends Number> {
    private static final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpa-ebrahimi");
    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    private BaseDao<T, ID> baseDao;

    public void setBaseDao(BaseDao<T, ID> baseDao) {
        this.baseDao = baseDao;
    }

    public BaseDao<T, ID> getBaseDao() {
        return baseDao;
    }

    public void saveOrUpdate(T entity) {
        if (entity.getId() == null) {
            baseDao.save(entity);
        } else {
            baseDao.update((ID) entity.getId(), entity);
        }
    }

    public void delete(ID id) {
        if (id == null) {
            throw new DataReadException("This entity NOT exist!");
        } else {
            baseDao.delete(id);
        }
    }

    public T loadById(ID id) {
        if (id == null) {
            throw new DataReadException("This entity NOT exist!");
        } else {
            return baseDao.loadById(id);
        }
    }

    public List<T> loadAll() {
        return baseDao.loadAll();
    }



}
