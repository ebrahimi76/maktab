package menu;

import student.Student;
import teacher.Teacher;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner input = new Scanner(System.in);
    private final Teacher teacher = new Teacher();
    private final Student student = new Student();

    public Menu() throws SQLException {
    }

    public void menu() throws SQLException {
        while (true) {
            System.out.println("SELECT: 1.add 2.del 3.edit 4.print 5.EXIT");
            int select = input.nextInt();
            input.nextLine();
            if (select == 5)
                break;
            else if (select == 1) {
                if (select() == 1) {
                    teacher.insert();
                } else {
                    student.insert();
                }
            } else if (select == 2) {
                if (select() == 1)
                    teacher.delete();
                else
                    student.delete();
            } else if (select == 3) {
                if (select() == 1)
                    teacher.update();
                else
                    student.update();
            } else if (select == 4) {
                if (select() == 1)
                    teacher.select();
                else
                    student.select();
            }
        }
    }

    public int select() {
        System.out.println("SELECT: 1.teacher 2.student");
        int select = input.nextInt();
        input.nextLine();
        return select;
    }
}
