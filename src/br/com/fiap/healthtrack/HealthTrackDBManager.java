package br.com.fiap.healthtrack;
  
  import java.sql.Connection;
  import java.sql.DriverManager;
  
  public class HealthTrackDBManager {
  
    public static Connection obterConexao() {
      Connection conexao = null;
      try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
  
        conexao = DriverManager.getConnection(
            "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
            "RM89332", "120602");
  
      } catch (Exception e) {
        e.printStackTrace();
      }
      return conexao;
    }
  
  }