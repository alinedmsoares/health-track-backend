package br.com.fiap.healthtrack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.Peso;
import br.com.fiap.healthtrack.HealthTrackDBManager;

public class PesoDAO implements IPesoDAO {
	
	private Connection conexao;

	ArrayList<Peso> list = new ArrayList<Peso>();
	
	@Override
	public void create(Peso weight) {
		PreparedStatement stmt = null;
		
		try {
	          conexao = HealthTrackDBManager.obterConexao();
	          String sql = "INSERT INTO T_PESO (ID_PESO, DATA, PESO) VALUES (SEQ_PESO.NEXTVAL, ?, ?)";
	          stmt = conexao.prepareStatement(sql);
	          java.sql.Date data = new java.sql.Date(weight.getWeightDate().getTimeInMillis());
	          stmt.setDate(1, data);
	          stmt.setDouble(2, weight.getWeight());
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
	public List<Peso> getAll() {
		List<Peso> lista = new ArrayList<Peso>();
	    PreparedStatement stmt = null;
	    java.sql.ResultSet rs = null;
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
		    stmt = conexao.prepareStatement("SELECT * FROM T_PESO");
		    rs = stmt.executeQuery();
	  
	    //Percorre todos os registros encontrados
	    while (rs.next()) {
		    int id = rs.getInt("ID_PESO");
		    java.sql.Date data = rs.getDate("DATA");
	        Calendar dataPesagem = Calendar.getInstance();
	        dataPesagem.setTimeInMillis(data.getTime());
	        double peso = rs.getDouble("PESO");

	        Peso pesagem = new Peso(id, dataPesagem, peso);

	        lista.add(pesagem);
	      }
	    } catch (java.sql.SQLException e) {
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
	public Peso getById(int id) {
		Peso weight = null;
		  PreparedStatement stmt = null;
		  ResultSet rs = null;
		  try {
		    conexao = HealthTrackDBManager.obterConexao();
		    stmt = conexao.prepareStatement("SELECT * FROM T_PESO WHERE ID_PESO = ?");
		    stmt.setInt(1, id);
		    rs = stmt.executeQuery();
		  
		    if (rs.next()){
		    	int idWeight = rs.getInt("ID_PESO");
			    java.sql.Date data = rs.getDate("DATA");
		        Calendar dataPesagem = Calendar.getInstance();
		        dataPesagem.setTimeInMillis(data.getTime());
		        double peso = rs.getDouble("PESO");
		    
		        weight = new Peso(idWeight, dataPesagem, peso);
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
		  return weight;
	}
	
	@Override
	public void update(Peso weight) {
		PreparedStatement stmt = null;
		  
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
	      String sql = "UPDATE T_PESO SET DATA = ?, PESO = ? WHERE ID_PESO = ?";
	      stmt = conexao.prepareStatement(sql);
	      java.sql.Date data = new java.sql.Date(weight.getWeightDate().getTimeInMillis());
	      stmt.setDate(1, data);
	      stmt.setDouble(2, weight.getWeight());
	      stmt.setInt(3, weight.getIdWeight());
	  
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
	      String sql = "DELETE FROM T_PESO WHERE ID_PESO = ?";
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