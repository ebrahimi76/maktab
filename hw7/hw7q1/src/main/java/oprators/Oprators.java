package oprators;

import configConnect.ConfigConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Oprators {
    private final Scanner input = new Scanner(System.in);
    private final Connection connection = ConfigConnect.creatConnection();
    protected static String QUERY1 = "(first_name, last_name) VALUES(?, ?);";
    protected static String QUERY2 = "SET first_name=?, last_name=? WHERE id=?;";
    protected static String QUERY3 = "WHERE id=?;";
    protected static String QUERY4 = "SELECT id, first_name, last_name";

    public Oprators() throws SQLException {
    }

    public void insert() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY1);
        System.out.println("Enter first name: ");
        preparedStatement.setString(1, input.nextLine());
        System.out.println("Enter last name: ");
        preparedStatement.setString(2, input.nextLine());
        preparedStatement.executeUpdate();
    }

    public void update() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY2);
        System.out.println("Enter id: ");
        preparedStatement.setInt(3, input.nextInt());
        input.nextLine();
        System.out.println("Enter first name: ");
        preparedStatement.setString(1, input.nextLine());
        System.out.println("Enter last name: ");
        preparedStatement.setString(2, input.nextLine());
        preparedStatement.executeUpdate();
    }

    public void delete() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY3);
        System.out.println("Enter id: ");
        preparedStatement.setInt(1, input.nextInt());
        input.nextLine();
        preparedStatement.executeUpdate();
    }

    public void select() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY4);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("id\tname\tfamily");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            System.out.println(id + "\t" + firstName + " \t" + lastName);
        }
    }
}
