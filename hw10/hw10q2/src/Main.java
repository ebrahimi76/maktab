import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Upper Bounded Wildcard
        /*List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        System.out.println("Total sum is:" + (int) sum(list1));
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
        System.out.print("Total sum is:" + sum(list2));*/

        //Lower Bounded Wildcard
        /*List<Integer> list1= Arrays.asList(4,5,6,7);
        print(list1);
        List<Number> list2= Arrays.asList(4,5,6,7);
        print(list2);*/

        //Unbounded Wildcard
        /*List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
        printList(list1);
        printList(list2);*/
    }

    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }

    public static void print(List<? super Integer> list) {
        System.out.println(list);
    }

    private static void printList(List<?> list) {
        System.out.println(list);
    }
}
