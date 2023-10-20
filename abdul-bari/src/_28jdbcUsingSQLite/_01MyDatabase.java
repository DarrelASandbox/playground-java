package src._28jdbcUsingSQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import src.utils.AnsiColors;

public class _01MyDatabase {
  public static void main(String[] args) {
    Connection connection = null;
    try {
      // create a database connection to db in `_28jdbcUsingSQLite` folder
      connection = DriverManager.getConnection("jdbc:sqlite:src/_28jdbcUsingSQLite/university.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.
      ResultSet rs = statement.executeQuery("SELECT * FROM dept");

      int deptNo;
      String deptName;
      while (rs.next()) {
        deptNo = rs.getInt("deptNo");
        deptName = rs.getString("dName");

        AnsiColors.println("deptNo: ", deptNo);
        AnsiColors.println("deptName: ", deptName);
      }
    } catch (SQLException e) {
      // if the error message is "out of memory",
      // it probably means no database file is found
      System.err.println(e.getMessage());
    } finally {
      try {
        if (connection != null)
          connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e.getMessage());
      }
    }
  }
}