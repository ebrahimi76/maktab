package com.bank.base;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class BaseDao<T extends BaseEntity,ID extends Number>  {
    private EntityManager entityManager;

    public BaseDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void save(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }


    public void update(ID id, T newEntity) {
        entityManager.getTransaction().begin();
        entityManager.merge(newEntity);
        entityManager.getTransaction().commit();
    }


    public void delete(ID id) {
        entityManager.getTransaction().begin();
        T entity = loadById(id);
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }


    public T loadById(ID id) {
        return entityManager.find(getEntityClass(), id);
    }


    public List<T> loadAll() {
        return entityManager.createQuery("From " +
                getEntityClass().getSimpleName()).getResultList();
    }


    public abstract Class<T> getEntityClass() ;
}

