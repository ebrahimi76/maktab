package drugstore.service;

import drugstore.entity.Person;

import java.util.Scanner;

public class PersonScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static Person getPersonInfo() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter username: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
        return new Person(name, username, password);
    }
}
