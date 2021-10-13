package drugstore.dao;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConfig {
    private DbConfig() {
    }

    public static Connection getConnection() throws SQLException {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL("");
        mysqlDataSource.setUser("");
        mysqlDataSource.setPassword("");
        return mysqlDataSource.getConnection();
    }
}
