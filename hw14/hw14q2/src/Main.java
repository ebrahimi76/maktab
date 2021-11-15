import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        String text = "iran is a big country. we live in iran";
        Predicate<String> startCheck = str -> str.startsWith("iran");
        Predicate<String> endCheck = str -> str.endsWith("iran");
        System.out.println(startCheck.and(endCheck).test(text));
    }
}