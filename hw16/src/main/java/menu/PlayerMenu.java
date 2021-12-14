package menu;

import entity.people.Player;
import entity.soccerInfo.Team;
import menu.base.CrudMenu;
import menu.base.Menu;

import java.sql.Date;

public class PlayerMenu extends Menu implements CrudMenu {
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
        System.out.println("Enter player name:");
        String name = scanner.nextLine();
        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter hire date");
        Date hireDate = Date.valueOf(scanner.nextLine());
        System.out.println("Enter hire expiry date");
        Date hireExpiryDate = Date.valueOf(scanner.nextLine());
        System.out.println("Enter team id");
        int teamId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter player shirt number:");
        int shirtNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("""
                Enter position:
                1)GK
                2)XB
                3)XM
                4)XW""");
        Player.Position position = getPositionByNumber(scanner.nextInt());
        scanner.nextLine();
        Player player = Player.playerBuilder()
                .setName(name)
                .setSalary(salary)
                .setHireDate(hireDate)
                .setHireExpiryDate(hireExpiryDate)
                .setTeam((Team) teamService.loadById(teamId))
                .setShirtNumber(shirtNumber)
                .setPosition(position)
                .build();
        playerService.saveOrUpdate(player);
    }

    @Override
    public void update() throws IllegalAccessException {
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new name:");
        String name = scanner.nextLine();
        System.out.println("Enter new salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter hire date");
        Date hireDate = Date.valueOf(scanner.nextLine());
        System.out.println("Enter hire expiry date");
        Date hireExpiryDate = Date.valueOf(scanner.nextLine());
        System.out.println("Enter new team id");
        int teamId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new player shirt number:");
        int shirtNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("""
                Enter new position:
                1)GK
                2)XB
                3)XM
                4)XW""");
        Player.Position position = getPositionByNumber(scanner.nextInt());
        scanner.nextLine();
        Player player = Player.playerBuilder()
                .setId(id)
                .setName(name)
                .setSalary(salary)
                .setHireDate(hireDate)
                .setHireExpiryDate(hireExpiryDate)
                .setTeam((Team) teamService.loadById(teamId))
                .setShirtNumber(shirtNumber)
                .setPosition(position)
                .build();
        playerService.saveOrUpdate(player);
    }

    @Override
    public void delete() throws IllegalAccessException {
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        playerService.delete(id);
    }

    @Override
    public void loadById() throws IllegalAccessException {
        System.out.println("Enter player id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(playerService.loadById(id));
    }

    @Override
    public void loadAll() {
        System.out.println(playerService.loadAll());
    }

    private Player.Position getPositionByNumber(int number) {
        Player.Position position = switch (number) {
            case 1 -> Player.Position.GK;
            case 2 -> Player.Position.XB;
            case 3 -> Player.Position.XM;
            case 4 -> Player.Position.XW;
            default -> null;
        };
        return position;
    }
}
