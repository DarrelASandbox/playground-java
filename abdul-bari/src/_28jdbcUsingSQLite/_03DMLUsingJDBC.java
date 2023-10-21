package src._28jdbcUsingSQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _03DMLUsingJDBC {
  public static void main(String[] args) {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection("jdbc:sqlite:src/_28jdbcUsingSQLite/university.db");
      Statement statement = connection.createStatement();

      statement.executeUpdate("INSERT INTO dept VALUES(60, 'Math')");
      statement.executeUpdate("UPDATE dept SET dName = 'Chem' WHERE deptNo = 60");
      // statement.executeUpdate("DELETE FROM dept WHERE deptNo >= 60");
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {
      try {
        if (connection != null)
          connection.close();
      } catch (SQLException e) {
        System.err.println(e.getMessage());
      }
    }
  }
}
