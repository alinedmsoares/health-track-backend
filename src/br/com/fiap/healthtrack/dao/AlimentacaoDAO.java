package br.com.fiap.healthtrack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.healthtrack.Alimentacao;
import br.com.fiap.healthtrack.HealthTrackDBManager;

public class AlimentacaoDAO implements IAlimentacaoDAO {

	
	Connection conexao = null;
	
	
	
	@Override
	public void create(Alimentacao meal) {
		try {
	          conexao = HealthTrackDBManager.obterConexao();
	          PreparedStatement stmt = conexao.prepareStatement("INSERT INTO T_PESO (ID_ALIMENTACAO, NR_CALORIAS, NM_ALIMENTO, DT_ALIMENTACAO) VALUES (SEQ_ALIMENTACAO.NEXTVAL, ?, ?, ?)");
	          stmt.setDouble(1, meal.getIdAlimentacao());
	          stmt.setString(2, meal.getDescricaoAlimento());
	          stmt.setDate(3, meal.getDataAlimentacao());
	          stmt.executeUpdate();
	          stmt.close();
	        } catch (java.sql.SQLException e) {
	          e.printStackTrace();
	        } finally {
	          try {
	            conexao.close();
	          } catch (java.sql.SQLException e) {
	            e.printStackTrace();
	          }
	        }
	}

	
	
	@Override
	public List<Alimentacao> getAll() {
		List<Alimentacao> listaAlimentacao = new ArrayList<Alimentacao>();
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
	      PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTACAO");
	      ResultSet rs = stmt.executeQuery();
	      while (rs.next()) {
		    int id = rs.getInt("ID_ALIMENTACAO");
	        int calorias = rs.getInt("NR_CALORIAS");
	        String alimento = rs.getString("NM_ALIMENTO");
	        java.sql.Date data = rs.getDate("DT_ALIMENTACAO");
	        Alimentacao obj = new Alimentacao(id, calorias, alimento, data);
	        listaAlimentacao.add(obj);
	        stmt.close();
	        rs.close();
	      }
	    } catch (java.sql.SQLException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        conexao.close();
	      } catch (java.sql.SQLException e) {
	        e.printStackTrace();
	      }
	    }
	    return listaAlimentacao;
	}

	
	
	@Override
	public Alimentacao getByiD(int Id) {
		  Alimentacao obj = null;
		  try {
		    conexao = HealthTrackDBManager.obterConexao();
		    PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTACAO WHERE ID_ALIMENTACAO = ?");
		    stmt.setInt(1, Id);
		    ResultSet rs = stmt.executeQuery();
		    if (rs.next()){
		    	int id = rs.getInt("ID_ALIMENTACAO");
		        int calorias = rs.getInt("NR_CALORIAS");
		        String alimento = rs.getString("NM_ALIMENTO");
		        java.sql.Date data = rs.getDate("DT_ALIMENTACAO");
		        obj = new Alimentacao(id, calorias, alimento, data);
		    }
		    stmt.close();
		    rs.close();
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }finally {
		    try {
		      conexao.close();
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		  }
		  return obj;
	}

	
	
	@Override
	public void update(Alimentacao meal) {
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
	      PreparedStatement stmt = conexao.prepareStatement("UPDATE T_ALIMENTACAO SET NR_CALORIAS = ?, NM_ALIMENTO = ?, DT_ALIMENTACAO = ? WHERE ID_ALIMENTACAO = ?");
	      stmt.setInt(1, meal.getQtdeCaloria());
	      stmt.setString(2, meal.getDescricaoAlimento());
	      stmt.setDate(3, meal.getDataAlimentacao());
	      stmt.setInt(4, meal.getIdAlimentacao());
	      stmt.executeUpdate();
	      stmt.close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	}

	

	@Override
	public void delete(int id) {
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
	      PreparedStatement stmt = conexao.prepareStatement("DELETE FROM T_ALIMENTACAO WHERE ID_ALIMENTACAO = ?");
	      stmt.setInt(1, id);
	      stmt.executeUpdate();
	      stmt.close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	}


	
}