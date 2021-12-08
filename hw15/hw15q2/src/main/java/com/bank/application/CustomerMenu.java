package com.bank.application;

import com.bank.entity.Customer;
import com.bank.entity.Person;
import com.bank.service.CustomerService;

public class CustomerMenu extends Run{
    public static void run() {
        System.out.println("Welcome to customer menu :)");
        selected=0;
        while (selected !=7) {
            System.out.println("""
                    1) Add customer
                    2) Update customer
                    3) Load customer by id
                    4) Load all customers
                    5) Delete customer
                    6) Start transaction
                    7) Back""");
            selected= scanner.nextInt();
            scanner.nextLine();
            if (selected == 1) {
                addCustomer();
            }else if (selected == 2) {

            }else if (selected == 3) {

            }else if (selected == 4) {

            }else if (selected == 5) {

            }else if (selected == 6) {

            }else if (selected <1||selected>7) {
                System.out.println("Try again :/");
            }
        }
        System.out.println("***********************");
    }

    private static void addCustomer() {
        System.out.println("Enter customer name:");
        String name=scanner.nextLine();
        System.out.println("Enter customer family:");
        String family=scanner.nextLine();
        System.out.println("Enter customer age:");
        Integer age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter customer national code:");
        Long nationalCode= scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter customer address:");
        String address=scanner.nextLine();
        System.out.println("Enter customer phone number:");
        Long phoneNumber=scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter customer email:");
        String email=scanner.nextLine();
        Person customer = new Customer();
        customer.setName(name);
        customer.setFamily(family);
        customer.setAge(age);
        customer.setNationalCode(nationalCode);
        customer.setAddress(address);
        customer.setPhoneNumber(phoneNumber);
        customer.setEmail(email);
        new CustomerService().saveOrUpdate((Customer) customer);
    }
}
