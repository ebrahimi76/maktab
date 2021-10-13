package drugstore.dao;

import drugstore.entity.Person;

import java.sql.SQLException;

public class PatientDao extends PersonDao {
    public PatientDao() throws SQLException {
    }

    @Override
    public void create(Person item) throws SQLException {
        String temp = insert;
        insert = "INSERT INTO drugstore.patient " + insert;
        super.create(item);
        insert = temp;
    }

    @Override
    public void read() throws SQLException {
        String temp = select;
        select = select + " drugstore.patient;";
        super.read();
        select = temp;
    }

    @Override
    public void update(Integer id) throws SQLException {
        String temp = update;
        update = "UPDATE drugstore.patient " + update;
        super.update(id);
        update = temp;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        String temp = delete;
        delete = "DELETE FROM drugstore.patient " + delete;
        super.delete(id);
        delete = temp;
    }
}
