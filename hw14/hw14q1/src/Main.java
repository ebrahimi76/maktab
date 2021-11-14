import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15);
        System.out.println(average(numbers));
    }

    public static Double average(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }
}