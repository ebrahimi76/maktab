package service.impl;

import dao.PlayerDao;
import entity.people.Player;
import service.core.BaseService;

import java.util.List;

public class PlayerService extends BaseService<Player> {


    public PlayerService() {
        setBaseDao(new PlayerDao(getEntityManager()));
    }

    public PlayerDao getBaseDao() {
        return (PlayerDao) super.getBaseDao();
    }

    public List<Player> getExpensivePlayers(){
        return new PlayerDao(getEntityManager()).getExpensivePlayers();
    }

}
