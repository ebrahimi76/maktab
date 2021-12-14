package service.impl;

import dao.StadiumDao;
import entity.soccerInfo.Stadium;
import service.core.BaseService;

public class StadiumService extends BaseService<Stadium> {


    public StadiumService() {
        setBaseDao(new StadiumDao(getEntityManager()));
    }

    public StadiumDao getBaseDao() {
        return (StadiumDao) super.getBaseDao();
    }
}
