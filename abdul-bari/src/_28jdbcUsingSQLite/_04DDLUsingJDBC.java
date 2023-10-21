package src._28jdbcUsingSQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _04DDLUsingJDBC {
  public static void main(String[] args) {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection("jdbc:sqlite:src/_28jdbcUsingSQLite/university.db");
      Statement statement = connection.createStatement();

      // statement.executeUpdate("CREATE TABLE NewTable(a integer, b float)");
      statement.executeUpdate("DROP TABLE NewTable");
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
