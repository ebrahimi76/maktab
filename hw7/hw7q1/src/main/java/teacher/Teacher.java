package teacher;

import oprators.Oprators;

import java.sql.SQLException;

public class Teacher extends Oprators {

    public Teacher() throws SQLException {
    }

    @Override
    public void insert() throws SQLException {
        String temp = QUERY1;
        QUERY1 = "INSERT INTO School.teacher " + QUERY1;
        super.insert();
        QUERY1 = temp;
    }

    @Override
    public void update() throws SQLException {
        String temp = QUERY2;
        QUERY2 = "UPDATE School.teacher " + QUERY2;
        super.update();
        QUERY2 = temp;
    }

    @Override
    public void delete() throws SQLException {
        String temp = QUERY3;
        QUERY3 = "DELETE FROM School.teacher " + QUERY3;
        super.delete();
        QUERY3 = temp;
    }

    @Override
    public void select() throws SQLException {
        String temp = QUERY4;
        QUERY4 = QUERY4 + " FROM School.teacher;";
        super.select();
        QUERY4 = temp;
    }
}
