import java.sql.*;

public class ConexaoMySQL {
  public static String URL = "jdbc:mysql://localhost:3306";
  public static String USER = "root";
  public static String PASSWORD = "root";

  private Connection dbConnection = null;
  private Statement sqlmgr = null;

  public void OpenDatabase() {
    try {
      dbConnection = DriverManager.getConnection(URL, USER, PASSWORD);
      System.out.println("Conectado com sucesso em: " + URL);
      sqlmgr = dbConnection.createStatement();
    } catch (Exception e) {
      System.out.println("Erro ao conectar: " + e.getMessage());
    }
  }
  
  public int ExecutaQuery(String sql) {
    try {
      return sqlmgr.executeUpdate(sql);
    } catch (Exception e) {
      System.out.println("Erro ao conectar: " + e.getMessage());
    }

    return -1;
  }

}