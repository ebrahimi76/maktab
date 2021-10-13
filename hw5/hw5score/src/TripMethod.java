import java.util.Random;

public class TripMethod {
    private double[][] methods;

    public double[][] getMethods() {
        return methods;
    }

    public void makeMethod() {
        Random random = new Random();
        int numOfModes = random.nextInt(4) + 1;
        methods = new double[numOfModes][4];
        for (int i = 0; i < numOfModes; i++) {
            int maxCost = 99999;
            int minCost = 1000;
            int rangeCost = maxCost - minCost + 1;
            double randCost = (Math.random() * (double) rangeCost) + minCost;
            methods[i][0] = Math.round(randCost / 1000) * 1000;
            methods[i][1] = Double.parseDouble(String.format("%.2f", (random.nextDouble() * 5 + random.nextDouble() * 3 + 0.01)));
            methods[i][2] = Double.parseDouble(String.format("%.2f", (random.nextDouble() * 3 + 0.01)));
            methods[i][3] = Double.parseDouble(String.format("%.2f", (random.nextDouble() * 5 + 0.01)));
        }
    }

    public void print() {
        System.out.println("\t\t==TRIP METHOD==\nMethod X\tBase\t1)T+R\t2)Tra\t3)Rai");
        for (int i = 0; i < methods.length; i++) {
            System.out.print("Type " + (i + 1) + "th: ");
            for (int j = 0; j < methods[i].length; j++)
                if (j == 0)
                    System.out.print("\t" + (int) methods[i][j]);
                else
                    System.out.print("\t" + methods[i][j] + " ");
            System.out.print("\n");
        }
    }
}
