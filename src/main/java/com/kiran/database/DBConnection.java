package com.kiran.database;

import com.kiran.config.ConfigReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws SQLException {

        String url = ConfigReader.getProperty("db.url");
        String user = ConfigReader.getProperty("db.user");
        String password = ConfigReader.getProperty("db.password");

        return DriverManager.getConnection(url, user, password);
    }
}



//
//
//package com.kiran.database;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DBConnection {
//
//    private static final String URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
//    private static final String USER = "sa";
//    private static final String PASSWORD = "";
//
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(URL, USER, PASSWORD);
//    }
//}
