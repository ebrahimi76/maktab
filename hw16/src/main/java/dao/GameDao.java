package dao;

import dao.core.BaseDao;
import entity.games.Game;

import javax.persistence.EntityManager;

public class GameDao extends BaseDao<Game> {
    public GameDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Game> getEntityClass() {
        return Game.class;
    }
}
