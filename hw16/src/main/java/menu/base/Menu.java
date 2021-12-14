package menu.base;

import menu.*;
import service.ServiceFactory;
import service.core.BaseService;

import java.util.Scanner;

public class Menu {
    protected static Scanner scanner = new Scanner(System.in);
    protected static int selected = 0;
    protected static final BaseService coachService = ServiceFactory.getInstance(BaseService.Type.COACH);
    protected static final BaseService playerService = ServiceFactory.getInstance(BaseService.Type.PLAYER);
    protected static final BaseService gameService = ServiceFactory.getInstance(BaseService.Type.GAME);
    protected static final BaseService stadiumService = ServiceFactory.getInstance(BaseService.Type.STADIUM);
    protected static final BaseService teamService = ServiceFactory.getInstance(BaseService.Type.TEAM);

    public static void runMenu() throws IllegalAccessException {
        System.out.println("Welcome to league :)");
        while (selected != 7) {
            System.out.println("""
                    1) Stadium
                    2) Team
                    3) Coach
                    4) Player
                    5) Game
                    6) League Info
                    7) EXIT""");
            selected = scanner.nextInt();
            scanner.nextLine();
            switch (selected) {
                case 1:
                    new StadiumMenu().menu();
                    break;
                case 2:
                    new TeamMenu().menu();
                    break;
                case 3:
                    new CoachMenu().menu();
                    break;
                case 4:
                    new PlayerMenu().menu();
                    break;
                case 5:
                    new GameMenu().menu();
                    break;
                case 6:
                    new LeagueMenu().menu();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Try again!");
            }
        }
    }
}
