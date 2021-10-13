package drugstore.dao;

import drugstore.entity.Person;
import drugstore.service.PersonScanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDao implements ICrud<Person, Integer> {
    private final Connection connection = DbConfig.getConnection();
    private PreparedStatement preparedStatement;

    protected static String insert = "(name, username, password) VALUES(?, ?, ?);";
    protected static String select = "SELECT id, name, username FROM";
    protected static String update = "SET name=?, username=?, password=? WHERE id=?;";
    protected static String delete = "WHERE id= ?;";

    public PersonDao() throws SQLException {
    }

    @Override
    public void create(Person item) throws SQLException {
        preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, item.getName());
        preparedStatement.setString(2, item.getUsername());
        preparedStatement.setString(3, item.getPassword());
        preparedStatement.executeUpdate();
    }

    @Override
    public void read() throws SQLException {
        preparedStatement = connection.prepareStatement(select);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println("Id: " + id + "\tName: " + name + "\tUsername: "
                    + username + "\tPassword: " + password);
        }
    }

    @Override
    public void update(Integer id) throws SQLException {
        preparedStatement = connection.prepareStatement(update);
        Person person = PersonScanner.getPersonInfo();
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getUsername());
        preparedStatement.setString(3, person.getPassword());
        preparedStatement.setInt(4, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(Integer id) throws SQLException {
        preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }
}
