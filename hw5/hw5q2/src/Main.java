import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContainerData data = new ContainerData();
        int select;
        while (true) {
            System.out.print("*[1]add [2]del [3]find [4]sort [5]print [0]EXIT*\nSELECT>>> ");
            select = input.nextInt();
            if (select == 0)
                break;
            else if (select == 1)
                data.add();
            else if (select == 2)
                data.del();
            else if (select == 3)
                data.find();
            else if (select == 4)
                data.sort();
            else if (select == 5)
                data.print();
            else
                System.out.println("Enter the correct number!");
        }
    }
}
