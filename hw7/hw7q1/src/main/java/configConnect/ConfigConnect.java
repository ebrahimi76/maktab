package configConnect;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConfigConnect {
    public static final String URL = "jdbc:mysql://localhost:3306/School";
    public static final String USERNAME = "";
    public static final String PASSWORD = "";

    public static Connection creatConnection() throws SQLException {
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setURL(URL);
        datasource.setPassword(PASSWORD);
        datasource.setUser(USERNAME);
        return datasource.getConnection();
    }
}
