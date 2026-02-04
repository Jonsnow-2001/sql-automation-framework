package com.kiran.tests;

import com.kiran.database.QueryExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseTest {

    @Test
    public void testUserCount() throws SQLException {

        QueryExecutor.executeUpdate(
                "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), salary INT)"
        );

        QueryExecutor.executeUpdate(
                "INSERT INTO users VALUES (1, 'Kiran', 50000)"
        );

        QueryExecutor.executeUpdate(
                "INSERT INTO users VALUES (2, 'Rahul', 60000)"
        );

        int count = QueryExecutor.getCount(
                "SELECT COUNT(*) FROM users"
        );

        Assert.assertEquals(count, 2);
    }


//    @Test
//    public void testUserCount() throws SQLException {
//
//        // Create table
//        QueryExecutor.executeUpdate(
//                "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), salary INT)"
//        );
//
//        // Insert data
//        QueryExecutor.executeUpdate(
//                "INSERT INTO users VALUES (1, 'Kiran', 50000)"
//        );
//
//        QueryExecutor.executeUpdate(
//                "INSERT INTO users VALUES (2, 'Rahul', 60000)"
//        );
//
//        // Execute query
//        ResultSet resultSet = QueryExecutor.executeQuery(
//                "SELECT COUNT(*) AS total FROM users"
//        );
//
//        resultSet.next();
//        int count = resultSet.getInt("total");
//
//        Assert.assertEquals(count, 2);
//    }


}
