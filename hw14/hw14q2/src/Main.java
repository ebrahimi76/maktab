import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        String text = "iran is big country. we live in iran";
        Predicate<String> startText = str -> str.startsWith("iran");
        Predicate<String> endText = str -> str.endsWith("iran");
        System.out.println(startText.and(endText).test(text));
    }
}