package user;
import site.Basket;

import java.util.Scanner;

public class User {
    private Scanner scanner = new Scanner(System.in);
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int mobileNumber;
    private String emailAddress;
    private Address address = new Address();
    private Basket basket;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void setUser() {
        System.out.println("Enter Username :");
        this.setUsername(scanner.next());
        System.out.println("Enter Password :");
        this.setPassword(scanner.next());
        System.out.println("Enter first name :");
        this.setFirstName(scanner.next());
        System.out.println("Enter last name :");
        this.setLastName(scanner.next());
        System.out.println("Enter Phone :");
        this.setMobileNumber(scanner.nextInt());
        scanner.next();
        System.out.println("Enter Email :");
        this.setEmailAddress(scanner.next());
        address.setAddress();
    }
}