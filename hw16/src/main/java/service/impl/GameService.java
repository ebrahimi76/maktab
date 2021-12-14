package service.impl;

import dao.GameDao;
import entity.games.Game;
import service.core.BaseService;

public class GameService extends BaseService<Game> {

    public GameService() {
        setBaseDao(new GameDao(getEntityManager()));
    }

    public GameDao getBaseDao() {
        return (GameDao) super.getBaseDao();
    }
}
