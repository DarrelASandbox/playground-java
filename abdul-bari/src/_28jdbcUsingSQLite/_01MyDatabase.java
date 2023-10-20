
package src._28jdbcUsingSQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import src.utils.AnsiColors;

public class _01MyDatabase {
  public static void main(String[] args) {
    Connection connection = null;
    try {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:src/_28jdbcUsingSQLite/university.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.
      ResultSet rs = statement.executeQuery("SELECT * FROM dept");

      printAll(rs);
      // printNameAndDept(rs);

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

  public static void printAll(ResultSet rs) throws SQLException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int columnCount = rsmd.getColumnCount();

    while (rs.next()) {
      StringBuilder row = new StringBuilder();
      for (int i = 1; i <= columnCount; i++) {
        String columnName = rsmd.getColumnName(i);
        String value = rs.getString(i);
        row.append(columnName).append(": ").append(value);
        if (i < columnCount) {
          row.append(", ");
        }
      }
      System.out.println(row.toString());
    }
  }

  public static void printNameAndDept(ResultSet rs) throws SQLException {
    int deptNo;
    String deptName;
    while (rs.next()) {
      deptNo = rs.getInt("deptNo");
      deptName = rs.getString("dName");

      AnsiColors.println("deptNo: ", deptNo);
      AnsiColors.println("deptName: ", deptName);
    }
  }
}
