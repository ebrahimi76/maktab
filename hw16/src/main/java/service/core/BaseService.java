package service.core;

import dao.core.BaseDao;
import entity.core.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class BaseService<T extends BaseEntity> {
    public enum Type {
        COACH, PLAYER, GAME, STADIUM, TEAM
    }

    private static final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("jpa-ebrahimi");
    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    private BaseDao<T> baseDao;

    public void setBaseDao(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    public BaseDao<T> getBaseDao() {
        return baseDao;
    }

    public void saveOrUpdate(T entity) {
        if (entity.getId() == null) {
            baseDao.save(entity);
        } else {
            baseDao.update(entity.getId(), entity);
        }
    }

    public void delete(Integer id) throws IllegalAccessException {
        if (id == null) {
            throw new IllegalAccessException("This entity NOT exist!");
        } else {
            baseDao.delete(id);
        }
    }

    public T loadById(Integer id) throws IllegalAccessException {
        if (id == null) {
            throw new IllegalAccessException("This entity NOT exist!");
        } else {
            return baseDao.loadById(id);
        }
    }

    public List<T> loadAll() {
        return baseDao.loadAll();
    }
}
