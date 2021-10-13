import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        String result = " is prime!";
        if (!isPrime(number))
            result = " is NOT prime!";
        System.out.print("Result: " + number + result);
    }

    public static boolean isPrime(int number) {
        return isPrime(number, 2);
    }

    public static boolean isPrime(int number, int i) {
        if (number <= 2)
            return number == 2;
        if (number % i == 0)
            return false;
        if (i * i > number)
            return true;
        return isPrime(number, i + 1);
    }
}
