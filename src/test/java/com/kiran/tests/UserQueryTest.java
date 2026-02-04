package com.kiran.tests;

import com.kiran.database.QueryExecutor;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLException;

public class UserQueryTest {

    @BeforeClass
    public void setupDatabase() throws SQLException {

        QueryExecutor.executeUpdate(
                "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), salary INT)"
        );

        QueryExecutor.executeUpdate(
                "INSERT INTO users VALUES (1, 'Kiran', 50000)"
        );

        QueryExecutor.executeUpdate(
                "INSERT INTO users VALUES (2, 'Rahul', 60000)"
        );

        QueryExecutor.executeUpdate(
                "INSERT INTO users VALUES (3, 'Amit', 70000)"
        );
    }

    @Test
    public void validateUserCount() throws SQLException {
        int count = QueryExecutor.getCount(
                "SELECT COUNT(*) FROM users"
        );
        Assert.assertEquals(count, 3);
    }

    @Test
    public void validateSalarySum() throws SQLException {
        int sum = QueryExecutor.getCount(
                "SELECT SUM(salary) FROM users"
        );
        Assert.assertEquals(sum, 50000 + 60000 + 70000);
    }

    // -------------------------
    // DATA PROVIDER
    // -------------------------

    @DataProvider(name = "userData")
    public Object[][] userDataProvider() {
        return new Object[][]{
                {1, "Kiran"},
                {2, "Rahul"},
                {3, "Amit"}
        };
    }

    // -------------------------
    // PARAMETERIZED TEST
    // -------------------------

    @Test(dataProvider = "userData")
    public void validateUserExists(int id, String name) throws SQLException {

        int count = QueryExecutor.getCount(
                "SELECT COUNT(*) FROM users WHERE id = " + id +
                        " AND name = '" + name + "'"
        );

        Assert.assertEquals(count, 1);
    }

    @AfterClass
    public void tearDown() throws SQLException {
        QueryExecutor.executeUpdate("DROP TABLE users");
    }
}
