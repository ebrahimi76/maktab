import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int number = input.nextInt();

        Set<Integer> list = new TreeSet<>();
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0)
                evens.add(i);
            else
                odds.add(i);
        }

        Thread threadEven = new Thread(new ThreadEven(list, evens));
        Thread threadOdd = new Thread(new ThreadOdd(list, odds));

        threadEven.start();
        threadOdd.start();

        try {
            threadEven.join();
            threadOdd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list);

    }
}
