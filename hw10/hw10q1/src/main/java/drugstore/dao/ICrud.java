package drugstore.dao;

import java.sql.SQLException;
import java.util.List;

public interface ICrud<T, D extends Number> {
    void create(T item) throws SQLException;

    void read() throws SQLException;

    void update(D id) throws SQLException;

    void delete(D id) throws SQLException;
}
