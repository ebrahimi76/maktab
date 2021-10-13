package site;

import product.Product;

import java.util.Arrays;
import java.util.Scanner;

public class Basket {
    private Products products = new Products();
    private final Scanner input = new Scanner(System.in);
    private Product[] basketList;

    public void makeBasket() {
        products.setProducts();
        basketList = new Product[1];
        basketList[0]=find();
    }

    public void add() {
        System.out.print("Enter number of data: ");
        int num = input.nextInt();
        Product[] newData = new Product[basketList.length + num];
        System.arraycopy(basketList, 0, newData, 0, basketList.length);
        for (int i = basketList.length; i < basketList.length + num; i++) {
            newData[i] = find();
        }
        basketList = newData;
    }

    public void del() {
        System.out.print("Enter index of number: ");
        int index = input.nextInt();
        if (index >= 0 && index <= basketList.length) {
            index--;
            Product[] newData = new Product[basketList.length - 1];
            if (index >= 0) System.arraycopy(basketList, 0, newData, 0, index);
            if (basketList.length - (index + 1) >= 0)
                System.arraycopy(basketList, index + 1, newData, index , basketList.length - (index + 1));
            basketList = newData;
        } else
            System.out.println("Enter the correct number!");
    }

    public Product find() {
        Product dataFind;
        int subject;
        int type;
        System.out.println("SELECT: 1.Book, 2.Electronic, 3.Shoe");
        subject = input.nextInt();
        if (subject == 1) {
            System.out.println("SELECT: 1.books, 2.magazines");
            type = input.nextInt();
            if (type == 1) {
                System.out.println("Enter the desired product number:");
                dataFind = products.getBooks()[input.nextInt()];
            } else {
                System.out.println("Enter the desired product number:");
                dataFind = products.getMagazines()[input.nextInt()];
            }
        } else if (subject == 2) {
            System.out.println("SELECT: 1.televisions, 2.radios");
            type = input.nextInt();
            if (type == 1) {
                System.out.println("Enter the desired product number:");
                dataFind = products.getTelevisions()[input.nextInt()];
            } else {
                System.out.println("Enter the desired product number:");
                dataFind = products.getRadios()[input.nextInt()];
            }
        } else if (subject == 3) {
            System.out.println("SELECT: 1.sports, 2.formals");
            type = input.nextInt();
            if (type == 1) {
                System.out.println("Enter the desired product number:");
                dataFind = products.getSports()[input.nextInt()];
            } else {
                System.out.println("Enter the desired product number:");
                dataFind = products.getFormals()[input.nextInt()];
            }
        } else {
            dataFind = null;
        }

        return dataFind;
    }

    public int basketPrice(){
        int price = 0;
        for (Product product:basketList) {
            price += product.getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketList=" + Arrays.toString(basketList) +
                '}';
    }
}
