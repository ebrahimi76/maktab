package user;

import java.util.Scanner;

public class Address {

    private String state;
    private String city;
    private String street;
    private String zipCode;

    public void setAddress() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the state: ");
        state = input.next();
        System.out.print("Enter the name of the city: ");
        city = input.next();
        System.out.println("Enter the street name: ");
        street = input.next();
        System.out.println("Enter the zip code: ");
        zipCode = String.valueOf(input.nextInt());
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
