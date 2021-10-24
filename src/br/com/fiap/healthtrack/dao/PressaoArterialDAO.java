package br.com.fiap.healthtrack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.Pressao;
import br.com.fiap.healthtrack.HealthTrackDBManager;

public class PressaoArterialDAO implements IPressaoArterialDAO {
	
	private Connection conexao;

	ArrayList<Pressao> list = new ArrayList<Pressao>();
	
	@Override
	public void create(Pressao pressure) {
		PreparedStatement stmt = null;
		
		try {
	          conexao = HealthTrackDBManager.obterConexao();
	          String sql = "INSERT INTO T_PRESSAO_ARTERIAL (ID_PRESSAO, PRESSAO_SISTOLICA, PRESSAO_DIASTOLICA, DT_MEDICAO, SITUACAO_PRESSAO) VALUES (SEQ_PRESSAO_ARTERIAL.NEXTVAL, ?, ?, ?, ?)";
	          stmt = conexao.prepareStatement(sql);
	          stmt.setDouble(1, pressure.getSystolicPressure());
	          stmt.setDouble(2, pressure.getDiastolicPressure());
	          java.sql.Date data = new java.sql.Date(pressure.getDtMeasurement().getTimeInMillis());
	          stmt.setDate(3, data);
	          stmt.setString(4, pressure.getPressureSituation());
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
	public List<Pressao> getAll() {
		List<Pressao> lista = new ArrayList<Pressao>();
	    PreparedStatement stmt = null;
	    java.sql.ResultSet rs = null;
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
		    stmt = conexao.prepareStatement("SELECT * FROM T_PRESSAO_ARTERIAL");
		    rs = stmt.executeQuery();
	  
	    //Percorre todos os registros encontrados
	    while (rs.next()) {
		    int id = rs.getInt("ID_PPRESSAO");
		    double pressaoSistolica = rs.getDouble("PRESSAO_SISTOLICA");
		    double pressaoDiastolica = rs.getDouble("PRESSAO_DIASTOLICA");
		    java.sql.Date data = rs.getDate("DT_MEDICAO");
	        Calendar dataMedicao = Calendar.getInstance();
	        dataMedicao.setTimeInMillis(data.getTime());
	        String situacao = rs.getString("SITUACAO_PRESSAO");

	       Pressao pressao = new Pressao(id, pressaoSistolica, pressaoDiastolica, dataMedicao, situacao);

	        lista.add(pressao);
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
	public void update(Pressao pressure) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pressao getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
//	@Override
//	public Peso getById(int id) {
//		Peso weight = null;
//		  PreparedStatement stmt = null;
//		  ResultSet rs = null;
//		  try {
//		    conexao = HealthTrackDBManager.obterConexao();
//		    stmt = conexao.prepareStatement("SELECT * FROM T_PESO WHERE ID_PESO = ?");
//		    stmt.setInt(1, id);
//		    rs = stmt.executeQuery();
//		  
//		    if (rs.next()){
//		    	int idWeight = rs.getInt("ID_PESO");
//			    java.sql.Date data = rs.getDate("DATA");
//		        Calendar dataPesagem = Calendar.getInstance();
//		        dataPesagem.setTimeInMillis(data.getTime());
//		        double peso = rs.getDouble("PESO");
//		    
//		        weight = new Peso(idWeight, dataPesagem, peso);
//		    }
//		    
//		  } catch (SQLException e) {
//		    e.printStackTrace();
//		  }finally {
//		    try {
//		      stmt.close();
//		      rs.close();
//		      conexao.close();
//		    } catch (SQLException e) {
//		      e.printStackTrace();
//		    }
//		  }
//		  return weight;
//	}
//	
//	@Override
//	public void update(Peso weight) {
//		PreparedStatement stmt = null;
//		  
//	    try {
//	      conexao = HealthTrackDBManager.obterConexao();
//	      String sql = "UPDATE T_PESO SET DATA = ?, PESO = ? WHERE ID_PESO = ?";
//	      stmt = conexao.prepareStatement(sql);
//	      java.sql.Date data = new java.sql.Date(weight.getWeightDate().getTimeInMillis());
//	      stmt.setDate(1, data);
//	      stmt.setDouble(2, weight.getWeight());
//	      stmt.setInt(3, weight.getIdWeight());
//	  
//	      stmt.executeUpdate();
//	    } catch (SQLException e) {
//	      e.printStackTrace();
//	    } finally {
//	      try {
//	        stmt.close();
//	        conexao.close();
//	      } catch (SQLException e) {
//	        e.printStackTrace();
//	      }
//	    }
//	}
//
//	@Override
//	public void delete(int id) {
//		PreparedStatement stmt = null;
//		  
//	    try {
//	      conexao = HealthTrackDBManager.obterConexao();
//	      String sql = "DELETE FROM T_PESO WHERE ID_PESO = ?";
//	      stmt = conexao.prepareStatement(sql);
//	      stmt.setInt(1, id);
//	      stmt.executeUpdate();
//	    } catch (SQLException e) {
//	      e.printStackTrace();
//	    } finally {
//	      try {
//	        stmt.close();
//	        conexao.close();
//	      } catch (SQLException e) {
//	        e.printStackTrace();
//	      }
//	    }
//	}

