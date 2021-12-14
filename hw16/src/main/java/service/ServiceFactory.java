package service;

import service.core.BaseService;
import service.impl.*;

public class ServiceFactory {
    public static BaseService getInstance(BaseService.Type type) {
        return switch (type) {
            case COACH -> new CoachService();
            case PLAYER -> new PlayerService();
            case GAME -> new GameService();
            case STADIUM -> new StadiumService();
            case TEAM -> new TeamService();
            default -> throw new IllegalArgumentException();
        };
    }
}
