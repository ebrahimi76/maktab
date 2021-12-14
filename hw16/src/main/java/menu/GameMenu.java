package menu;

import entity.games.Game;
import entity.soccerInfo.Team;
import menu.base.CrudMenu;
import menu.base.Menu;

import java.sql.Date;

public class GameMenu extends Menu implements CrudMenu {
    public void menu() throws IllegalAccessException {
        selected = 0;
        while (selected != 6) {
            System.out.println("""
                    1) Add
                    2) Update
                    3) Delete
                    4) Load by id
                    5) Load all
                    6) Back""");
            selected = scanner.nextInt();
            scanner.nextLine();
            switch (selected) {
                case 1:
                    add();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    loadById();
                    break;
                case 5:
                    loadAll();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Try again!");
            }
        }
    }

    @Override
    public void add() throws IllegalAccessException {
        System.out.println("Enter match date:");
        Date date = Date.valueOf(scanner.nextLine());
        System.out.println("Enter team (home) id:");
        Team teamHome = (Team) teamService.loadById(scanner.nextInt());
        System.out.println("Enter team (away) id:");
        Team teamAway = (Team) teamService.loadById(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter team [home - away] goals:");
        String goals = scanner.nextLine();
        String[] goal = goals.split(" - ");
        int teamHomeGoal = Integer.parseInt(goal[0]);
        int teamAwayGoal = Integer.parseInt(goal[1]);
        int teamHomePoint;
        int teamAwayPoint;
        if (teamHomeGoal - teamAwayGoal > 0) {
            teamHomePoint = 3;
            teamAwayPoint = 0;
        } else if (teamHomeGoal - teamAwayGoal < 0) {
            teamHomePoint = 0;
            teamAwayPoint = 3;
        } else {
            teamHomePoint = 1;
            teamAwayPoint = 1;
        }
        Game game = Game.gameBuilder()
                .setMatchDate(date)
                .setHome(teamHome)
                .setAway(teamAway)
                .setHomeGoals(teamHomeGoal)
                .setAwayGoals(teamAwayGoal)
                .setHomePoints(teamHomePoint)
                .setAwayPoints(teamAwayPoint)
                .build();
        gameService.saveOrUpdate(game);
        teamHome.setScore(teamHome.getScore() + teamHomePoint);
        teamAway.setScore(teamAway.getScore() + teamAwayPoint);
        teamService.saveOrUpdate(teamHome);
        teamService.saveOrUpdate(teamAway);
    }

    @Override
    public void update() throws IllegalAccessException {
        System.out.println("Enter match id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        Game previousGame = (Game) gameService.loadById(id);
        backToPrevious(previousGame);
        System.out.println("Enter new match date:");
        Date date = Date.valueOf(scanner.nextLine());
        System.out.println("Enter new team (home) id:");
        Team teamHome = (Team) teamService.loadById(scanner.nextInt());
        System.out.println("Enter new team (away) id:");
        Team teamAway = (Team) teamService.loadById(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter new team [home - away] goals:");
        String goals = scanner.nextLine();
        String[] goal = goals.split(" - ");
        int teamHomeGoal = Integer.parseInt(goal[0]);
        int teamAwayGoal = Integer.parseInt(goal[1]);
        int teamHomePoint;
        int teamAwayPoint;
        if (teamHomeGoal - teamAwayGoal > 0) {
            teamHomePoint = 3;
            teamAwayPoint = 0;
        } else if (teamHomeGoal - teamAwayGoal < 0) {
            teamHomePoint = 0;
            teamAwayPoint = 3;
        } else {
            teamHomePoint = 1;
            teamAwayPoint = 1;
        }
        Game game = Game.gameBuilder()
                .setId(id)
                .setMatchDate(date)
                .setHome(teamHome)
                .setAway(teamAway)
                .setHomeGoals(teamHomeGoal)
                .setAwayGoals(teamAwayGoal)
                .setHomePoints(teamHomePoint)
                .setAwayPoints(teamAwayPoint)
                .build();
        gameService.saveOrUpdate(game);
        teamHome.setScore(teamHome.getScore() + teamHomePoint);
        teamAway.setScore(teamAway.getScore() + teamAwayPoint);
        teamService.saveOrUpdate(teamHome);
        teamService.saveOrUpdate(teamAway);
    }

    @Override
    public void delete() throws IllegalAccessException {
        System.out.println("Enter match id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        Game game = (Game) gameService.loadById(id);
        backToPrevious(game);
        gameService.delete(id);
    }

    @Override
    public void loadById() throws IllegalAccessException {
        System.out.println("Enter match id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(gameService.loadById(id));
    }

    @Override
    public void loadAll() {
        System.out.println(gameService.loadAll());
    }

    private void backToPrevious(Game game) {
        Team home = game.getHome();
        int homePoints = game.getHomePoints();
        Team away = game.getAway();
        int awayPoints = game.getAwayPoints();
        home.setScore(home.getScore() - homePoints);
        away.setScore(away.getScore() - awayPoints);
        teamService.saveOrUpdate(home);
        teamService.saveOrUpdate(away);
    }
}
