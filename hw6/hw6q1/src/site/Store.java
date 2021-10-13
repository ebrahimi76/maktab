package site;

import user.User;

import java.util.Scanner;

public class Store {
    private Scanner scanner=new Scanner(System.in);
    Products products = new Products();
    User user = new User();
    Basket basket = new Basket();
    public void run() {
        products.setProducts();
        user.setUser();
        /*int select;
        do{
            select = menu(user,products);
        }while(select!=4);*/
    }

    public Products getProducts() {
        return products;
    }

    /*public int menu(User customer, Products store) {
        System.out.println("\n================\n1)add\n2)remove\n3)final\n4)EXIT\n================\n");
        int select = scanner.nextInt();
        scanner.nextLine();
        if (select == 1) {
            add(customer, store);
        } else if (select == 2) {
            remove(customer);
        } else if (select == 3) {
            buy(customer, store);
        } else {
            System.out.println("invalid input");
        }
        return select;
    }*/

    @Override
    public String toString() {
        return "Store{" +
                "products=" + products +
                '}';
    }
}
