package drugstore.service;

import drugstore.entity.Drug;

import java.util.Scanner;

public class DrugScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static Drug getPersonInfo() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return new Drug(name, price, number);
    }
}
