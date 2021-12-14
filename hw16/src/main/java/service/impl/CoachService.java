package service.impl;

import dao.CoachDao;
import entity.people.Coach;
import service.core.BaseService;

public class CoachService extends BaseService<Coach> {

    public CoachService() {
        setBaseDao(new CoachDao(getEntityManager()));
    }

    public CoachDao getBaseDao() {
        return (CoachDao) super.getBaseDao();
    }

    public Coach getExpensiveCoach(){
        return new CoachDao(getEntityManager()).getMostExpensive();
    }
}
