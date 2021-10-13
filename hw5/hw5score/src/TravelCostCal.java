import java.util.Scanner;

public class TravelCostCal {

    private final TripCost cost = new TripCost();
    private final TripMethod mode = new TripMethod();

    public void travelCostCal() {
        mode.makeMethod();
        mode.print();
        cost.makeCost();
        cost.print();
        int select, i, j;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("******************************\n[1]Calculate [0]Exit\nSELECT>>> ");
            select = input.nextInt();
            if (select == 0)
                break;
            else if (select == 1) {
                System.out.print("Enter the type of travel modes: ");
                i = input.nextInt() - 1;
                System.out.print("Enter the type of traffic and weather conditions: ");
                j = input.nextInt();
                double baseCost = mode.getMethods()[i][0];
                double typeModes = mode.getMethods()[i][j];
                System.out.print("Enter the origin of the trip: ");
                i = input.nextInt() - 1;
                System.out.print("Enter the destination of the trip: ");
                j = input.nextInt() - 1;
                double tripCost = cost.getCosts()[i][j];
                System.out.println("The amount of taxi fare: " + (int) (baseCost * typeModes * tripCost));
            } else
                System.out.println("Enter the correct number!");
        }
    }
}
