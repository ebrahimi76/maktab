package drugstore.dao;

import drugstore.entity.Person;

import java.sql.SQLException;

public class AdminDao extends PersonDao {
    public AdminDao() throws SQLException {
    }

    @Override
    public void create(Person item) throws SQLException {
        String temp = insert;
        insert = "INSERT INTO drugstore.admin " + insert;
        super.create(item);
        insert = temp;
    }

    @Override
    public void read() throws SQLException {
        String temp = select;
        select = select + " drugstore.admin;";
        super.read();
        select = temp;
    }

    @Override
    public void update(Integer id) throws SQLException {
        String temp = update;
        update = "UPDATE drugstore.admin " + update;
        super.update(id);
        update = temp;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String temp = delete;
        delete = "DELETE FROM drugstore.admin " + delete;
        super.delete(id);
        delete = temp;
    }
}
