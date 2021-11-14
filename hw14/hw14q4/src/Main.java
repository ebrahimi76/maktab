import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Amir"),
                new Student("Hatef"), new Student("Mehran"),
                new Student("Mojtaba"), new Student("Mohammad"),
                new Student("Ali"), new Student("Davood"),
                new Student("Reza"), new Student("Mohsen"));
        // Part A
        System.out.println("PartA");
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(s -> System.out.println(s.getName()));
        // Part B
        System.out.println("PartB");
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.groupingBy(student -> student.getName().chars().count()))
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }

    static class Student implements Comparable {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}