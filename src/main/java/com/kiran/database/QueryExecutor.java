package com.kiran.database;

import java.sql.*;

public class QueryExecutor {

    public static void executeUpdate(String query) throws SQLException {
        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(query);
        }
    }

    public static int getCount(String query) throws SQLException {
        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            resultSet.next();
            return resultSet.getInt(1);
        }
    }
}



//
//package com.kiran.database;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class QueryExecutor {
//
//    public static void executeUpdate(String query) throws SQLException {
//        try (Connection connection = DBConnection.getConnection();
//             Statement statement = connection.createStatement()) {
//
//            statement.executeUpdate(query);
//        }
//    }
//
//    public static ResultSet executeQuery(String query) throws SQLException {
//        Connection connection = DBConnection.getConnection();
//        Statement statement = connection.createStatement();
//        return statement.executeQuery(query);
//    }
//}
