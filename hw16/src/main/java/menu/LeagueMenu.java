package menu;

import menu.base.Menu;
import service.impl.CoachService;
import service.impl.PlayerService;
import service.impl.TeamService;

import java.util.List;

public class LeagueMenu extends Menu {
    public void menu() {
        selected = 0;
        while (selected != 6) {
            System.out.println("""
                    1) Expensive Coach
                    2) Expensive players
                    3) Cities and their teams
                    4) Points of teams
                    5) Champion
                    6) Back""");
            selected = scanner.nextInt();
            scanner.nextLine();
            switch (selected) {
                case 1:
                    System.out.println(((CoachService) coachService).getExpensiveCoach());
                    break;
                case 2:
                    System.out.println(((PlayerService) playerService).getExpensivePlayers());
                    break;
                case 3:
                    List<Object[]> citiesTeams = ((TeamService) teamService).getCitiesTeams();
                    System.out.println("city : number of teams -> ");
                    for (Object[] obj : citiesTeams) {
                        System.out.println(obj[0] + " : " + obj[1].toString());
                    }
                    System.out.println("***************************");
                    break;
                case 4:
                    List<Object[]> teamsPoints = ((TeamService) teamService).getTeamsPoints();
                    System.out.println("team : points -> ");
                    for (Object[] obj : teamsPoints) {
                        System.out.println(obj[0].toString() + " : " + obj[1].toString());
                    }
                    System.out.println("***************************");
                    break;
                case 5:
                    System.out.println(((TeamService) teamService).getChampion());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Try again!");
            }
        }
    }
}
