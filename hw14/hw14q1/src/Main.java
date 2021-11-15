public class Main {
    public static void main(String[] args) {
        int a = 13, b = 14;
        Average average = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(average.avg(a, b));
    }

    @FunctionalInterface
    interface Average {
        double avg(double number1, double number2);
    }
}