package com.bank.application;

import java.util.Scanner;

public class Run {
    protected static Scanner scanner=new Scanner(System.in);
    protected static int selected=0;
    public static void runMain(){
        System.out.println("Welcome to ATM :)");
        while (selected !=3) {
            System.out.println("""
                    1) Customer menu
                    2) Employee menu
                    3) EXIT""");
            selected =scanner.nextInt();
            if (selected == 1) {
                CustomerMenu.run();
            }else if (selected == 2) {
                //EmployeeMenu.run();
            }else if (selected <1||selected>3){
                System.out.println("Try again :/");
            }
        }
        System.out.println("***********************");
    }
}
