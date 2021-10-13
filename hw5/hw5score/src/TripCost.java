import java.util.Random;

public class TripCost {
    private int[][] costs;

    public int[][] getCosts() {
        return costs;
    }

    public void makeCost() {
        Random random = new Random();
        int numOfTown = random.nextInt(5) + 2;
        costs = new int[numOfTown][numOfTown];
        for (int i = 0; i < numOfTown; i++) {
            for (int j = i; j < numOfTown; j++)
                if (i == j)
                    costs[i][j] = 1;
                else {
                    costs[i][j] = random.nextInt(5) + 1;
                    costs[j][i] = costs[i][j];
                }
        }
    }

    public void print() {
        System.out.println("\t\t===TRIP COST===");
        System.out.print("Town Xth");
        for (int i = 0; i < costs.length; i++)
            System.out.print("\tTown " + (i + 1));
        System.out.print("\n");
        for (int i = 0; i < costs.length; i++) {
            System.out.print("Town " + (i + 1) + "th: ");
            for (int j = 0; j < costs[i].length; j++)
                System.out.print("\t   " + costs[i][j]);
            System.out.print("\n");
        }
    }
}
