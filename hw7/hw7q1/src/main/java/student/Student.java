package student;

import oprators.Oprators;

import java.sql.SQLException;

public class Student extends Oprators {

    public Student() throws SQLException {
    }

    @Override
    public void insert() throws SQLException {
        String temp = QUERY1;
        QUERY1 = "INSERT INTO School.student " + QUERY1;
        super.insert();
        QUERY1 = temp;
    }

    @Override
    public void update() throws SQLException {
        String temp = QUERY2;
        QUERY2 = "UPDATE School.student " + QUERY2;
        super.update();
        QUERY2 = temp;
    }

    @Override
    public void delete() throws SQLException {
        String temp = QUERY3;
        QUERY3 = "DELETE FROM School.student " + QUERY3;
        super.delete();
        QUERY3 = temp;
    }

    @Override
    public void select() throws SQLException {
        String temp = QUERY4;
        QUERY4 = QUERY4 + " FROM School.student;";
        super.select();
        QUERY4 = temp;
    }
}
