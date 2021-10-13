package drugstore.dao;

import drugstore.entity.Drug;
import drugstore.service.DrugScanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DrugDao implements ICrud<Drug, Integer> {
    private final Connection connection = DbConfig.getConnection();
    private PreparedStatement preparedStatement;

    public DrugDao() throws SQLException {
    }

    @Override
    public void create(Drug item) throws SQLException {
        preparedStatement = connection.prepareStatement("INSERT INTO drugstore.drug" +
                " (name, price, `number`) VALUES(?, ?, ?);");
        preparedStatement.setString(1, item.getName());
        preparedStatement.setInt(2, item.getPrice());
        preparedStatement.setInt(3, item.getNumber());
        preparedStatement.executeUpdate();
    }

    @Override
    public void read() throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT id, name, price," +
                " `number` FROM drugstore.drug;");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");
            int number = resultSet.getInt("number");
            System.out.println("Id: " + id + "\tName: " + name + "\tPrice: "
                    + price + "\tNumber: " + number);
        }
    }

    @Override
    public void update(Integer id) throws SQLException {
        preparedStatement = connection.prepareStatement("UPDATE drugstore.drug SET name=?," +
                " price=?, `number`=? WHERE id=?;");
        Drug drug = DrugScanner.getPersonInfo();
        preparedStatement.setString(1, drug.getName());
        preparedStatement.setInt(2, drug.getPrice());
        preparedStatement.setInt(3, drug.getNumber());
        preparedStatement.setInt(4, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(Integer id) throws SQLException {
        preparedStatement = connection.prepareStatement("DELETE FROM drugstore.drug WHERE id=?;");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }
}
