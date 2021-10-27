package br.com.fiap.healthtrack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.Alimento;
import br.com.fiap.healthtrack.HealthTrackDBManager;

public class AlimentoDAO implements IAlimentoDAO {
	
	private Connection conexao;

	ArrayList<Alimento> list = new ArrayList<Alimento>();
	
	@Override
	public void create(Alimento food) {
		PreparedStatement stmt = null;
		
		try {
	          conexao = HealthTrackDBManager.obterConexao();
	          String sql = "INSERT INTO T_Alimento (ID_AlIMENTO, QT_CAL, DS_ALIMENTO, QT_PESO_ALIMENTO) VALUES (SQ_ALIMENTO.NEXTVAL, ?, ?, ?)";
	          stmt.setFloat(1, food.getKcalPerGram());
	          stmt.setNString(2,food.getFoodDescription());
	          stmt.setFloat(3, food.getGramPerPortion());
	          stmt.executeUpdate();
	        } catch (java.sql.SQLException e) {
	          e.printStackTrace();
	        } finally {
	          try {
	            stmt.close();
	            conexao.close();
	          } catch (java.sql.SQLException e) {
	            e.printStackTrace();
	          }
	        }
	}

	@Override
	public List<Alimento> getAll() {
		List<Alimento> lista = new ArrayList<Alimento>();
	    PreparedStatement stmt = null;
	    java.sql.ResultSet rs = null;
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
		    stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTO");
		    rs = stmt.executeQuery();
	  
		    int foodId;
				//Percorre todos os registros encontrados
		    while (rs.next()) {
		    	//Recupera os valores de cada coluna
		    	foodId = rs.getInt("ID_ALIMENTO");
		    	String foodDescription = rs.getNString("DS_ALIMENTO");
		    	float kcalPerGram = rs.getFloat("QT_CAL");
		    	float gramPerPortion = rs.getFloat("QT_PESO_ALIMENTO");
	
		    	Alimento food = new Alimento(foodId, foodDescription, kcalPerGram, gramPerPortion);
	
		    	lista.add(food);
		    
	    }} catch (java.sql.SQLException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        stmt.close();
	        rs.close();
	        conexao.close();
	      } catch (java.sql.SQLException e) {
	        e.printStackTrace();
	      }
	    }
	    return lista;
	}
	
	@Override
	public Alimento getById(int id) {
		Alimento food = null;
		  PreparedStatement stmt = null;
		  ResultSet rs = null;
		  try {
		    conexao = HealthTrackDBManager.obterConexao();
		    stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTO WHERE ID_ALIMENTO = ?");
		    stmt.setInt(1, id);
		    rs = stmt.executeQuery();
		  
		    if (rs.next()){
		    	int foodId = rs.getInt("ID_ALIMENTO");
		    	String foodDescription = rs.getNString("DS_ALIMENTO");
		    	float kcalPerGram = rs.getFloat("QT_CAL");
		    	float gramPerPortion = rs.getFloat("QT_PESO_ALIMENTO");
		        food = new Alimento(foodId, foodDescription, kcalPerGram, gramPerPortion);
		    }
		    
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }finally {
		    try {
		      stmt.close();
		      rs.close();
		      conexao.close();
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		  }
		  return food;
	}
	
	@Override
	public void update(Alimento food) {
		PreparedStatement stmt = null;
		  
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
	      String sql = "UPDATE T_ALIMENTO SET QT_CALORIAS = ?, DS_ALIMENTO = ?, QT_PESO_ALIMENTO = ? WHERE ID_ALIMENTO = ?";
	      stmt = conexao.prepareStatement(sql);
	      
	      stmt.setDouble(1, food.getKcalPerGram());
	      stmt.setNString(2, food.getFoodDescription());
	      stmt.setDouble(3, food.getGramPerPortion());
	      stmt.executeUpdate();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        stmt.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	}

	@Override
	public void delete(int id) {
		PreparedStatement stmt = null;
		  
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
	      String sql = "DELETE FROM T_ALIMENTO WHERE ID_ALIMENTO = ?";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setInt(1, id);
	      stmt.executeUpdate();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        stmt.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	}
}