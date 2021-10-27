package br.com.fiap.healthtrack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.healthtrack.HealthTrackDBManager;
import br.com.fiap.healthtrack.Profissional;

public class ProfissionalDAO implements IProfissionalDAO {

	Connection conexao = null;
	

	
	@Override
	public void create(Profissional profissional) {
		try {
	          conexao = HealthTrackDBManager.obterConexao();
	          PreparedStatement stmt = conexao.prepareStatement("INSERT INTO T_PROFISSIONAL (ID_PESSOA, NM_PESSOA, DT_NASC, DS_GENERO, DS_EMAIL, DS_SENHA, ID_PROFISSIONAL, "
	        		  											+ "DS_PROFISSAO, DS_DESCRICAO) VALUES (SEQ_PESSOA.NEXTVAL, ?, ?, ?, ?, ?, SEQ_PROFISSIONAL.NEXTVAL, ?, ?)");
	          stmt.setString(1, profissional.getName());
	          stmt.setString(2, profissional.getBirthdate());
	          stmt.setString(3, profissional.getGenre());
	          stmt.setString(4, profissional.getEmail());
	          stmt.setString(5, profissional.getPassword());
	          stmt.setString(6, profissional.getProfession());
	          stmt.setString(7, profissional.getDescription());
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
	public List<Profissional> getAll() {
		List<Profissional> listaProfissional = new ArrayList<Profissional>();
	    try {
	      conexao = HealthTrackDBManager.obterConexao();
	      PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTACAO");
	      ResultSet rs = stmt.executeQuery();
	      while (rs.next()) {
		    int idPessoa = rs.getInt("ID_PESSOA");
	        String name = rs.getString("NM_PESSOA");
	        java.sql.Date sqldate = rs.getDate("DT_NASC");
	        String birthdate = sqldate.toString();
	        String genre = rs.getString("DS_GENERO");
	        String email = rs.getString("DS_EMAIL");
	        String password = rs.getString("DS_SENHA");
	        int idProfissional = rs.getInt("ID_PROFISSIONAL");
	        String profession = rs.getString("DS_PROFISSAO");
	        String description = rs.getString("DS_DESCRICAO");
	        Profissional obj = new Profissional(idPessoa, name, birthdate, genre, email, password, idProfissional, profession, description);
	        listaProfissional.add(obj);
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
	    return listaProfissional;
	}

	
	
	@Override
	public Profissional getByiD(int Id) {
		Profissional obj = null;
		  try {
		    conexao = HealthTrackDBManager.obterConexao();
		    PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_PROFISSIONAL WHERE ID_PROFISSIONAL = ?");
		    stmt.setInt(1, Id);
		    ResultSet rs = stmt.executeQuery();
		    if (rs.next()){
		    	int idPessoa = rs.getInt("ID_PESSOA");
		        String name = rs.getString("NM_PESSOA");
		        java.sql.Date sqldate = rs.getDate("DT_NASC");
		        String birthdate = sqldate.toString();
		        String genre = rs.getString("DS_GENERO");
		        String email = rs.getString("DS_EMAIL");
		        String password = rs.getString("DS_SENHA");
		        int idProfissional = rs.getInt("ID_PROFISSIONAL");
		        String profession = rs.getString("DS_PROFISSAO");
		        String description = rs.getString("DS_DESCRICAO");
		        obj = new Profissional(idPessoa, name, birthdate, genre, email, password, idProfissional, profession, description);
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
	public void update(Profissional profissional) {
		try {
		      conexao = HealthTrackDBManager.obterConexao();
		      PreparedStatement stmt = conexao.prepareStatement("UPDATE T_PROFISSIONAL SET NM_PESSOA = ?, DT_NASC = ?, DS_GENERO = ?, "
		      													+ "DS_EMAIL = ?, DS_SENHA = ?, DS_PROFISSAO = ?, DS_DESCRICAO = ? WHERE ID_PROFISSIONAL = ?");
		      stmt.setString(1, profissional.getName());
		      java.sql.Date sqldate = java.sql.Date.valueOf(profissional.getBirthdate());
		      stmt.setDate(2, sqldate);
		      stmt.setString(3, profissional.getGenre());
		      stmt.setString(4, profissional.getEmail());
		      stmt.setString(5, profissional.getPassword());
		      stmt.setString(6, profissional.getProfession());
		      stmt.setString(7, profissional.getDescription());
		      stmt.setInt(8, profissional.getIdProfessional());
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
		      PreparedStatement stmt = conexao.prepareStatement("DELETE FROM T_PROFISSIONAL WHERE ID_PROFISSIONAL = ?");
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