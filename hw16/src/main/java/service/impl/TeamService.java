package service.impl;

import dao.TeamDao;
import entity.soccerInfo.Team;
import service.core.BaseService;

import java.util.List;


public class TeamService extends BaseService<Team> {

    public TeamService() {
        setBaseDao(new TeamDao(getEntityManager()));
    }

    public TeamDao getBaseDao() {
        return (TeamDao) super.getBaseDao();
    }

    public List<Object[]> getCitiesTeams(){
        return new TeamDao(getEntityManager()).getCitiesTeams();
    }

    public List<Object[]> getTeamsPoints(){
        return new TeamDao(getEntityManager()).getTeamsPoints();
    }

    public Team getChampion(){
        return new TeamDao(getEntityManager()).getChampionTeam();
    }
}
