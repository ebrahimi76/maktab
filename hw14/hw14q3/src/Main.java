import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(); // []
        nums.add(3);                                 // [3]
        nums.add(5);                                 // [3, 5]
        nums.add(1);                                 // [3, 5, 1]
        nums.stream()
                .filter(val -> val > 1)              // [3, 5]
                .forEach(val -> System.out.println(val));
    }
}