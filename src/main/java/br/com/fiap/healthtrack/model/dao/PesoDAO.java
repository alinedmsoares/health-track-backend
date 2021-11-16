package br.com.fiap.healthtrack.model.dao;

import br.com.fiap.healthtrack.model.beans.Peso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PesoDAO {
	
	public List<Peso> getAll(long id) {
		List<Peso> listaPeso = new ArrayList<Peso>();
		try {
			Connection conexao = ConnectionManager.getInstance().getConnection();
			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_PESO WHERE T_USUARIO_ID_USUARIO = ?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Peso pesagem = new Peso();
				long idPeso = rs.getLong("ID_PESO");
				pesagem.setIdPeso(idPeso);
				float peso = rs.getFloat("PESO");
				pesagem.setPeso(peso);
				java.sql.Date sqlDate = rs.getDate("DT_PESAGEM");
				int dia = sqlDate.toLocalDate().getDayOfMonth();
				int mes = sqlDate.toLocalDate().getMonthValue();
				int ano = sqlDate.toLocalDate().getYear();
				String dataPeso = dia + "/" + mes + "/" + ano;
				pesagem.setDataPeso(dataPeso);
				listaPeso.add(pesagem);
			}
			rs.close();
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaPeso;
	}


	public int add(long id, Peso peso) {
		Connection conexao = ConnectionManager.getInstance().getConnection();
		try {
			PreparedStatement stmt = conexao.prepareStatement("INSERT INTO T_PESO (ID_PESO, PESO, DT_PESAGEM, USUARIO_ID_USUARIO) "
															+ "VALUES (SEQ_PESO.nextval, ?, ?, ?);");
			stmt.setFloat(1, peso.getPeso());
			stmt.setDate(2, java.sql.Date.valueOf(peso.getDataPeso()));
			stmt.setLong(3, id);
			stmt.executeUpdate();
			conexao.commit();
			stmt.close();
			conexao.close();
			return 1;
		} catch (SQLException e) {
			try {
				conexao.rollback();
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int update(Peso peso) {
		Connection conexao = ConnectionManager.getInstance().getConnection();
		try {
			PreparedStatement stmt = conexao.prepareStatement("UPDATE T_PESO SET PESO = ?, DT_PESAGEM = ? WHERE ID_PESO = ?;");
			stmt.setFloat(1, peso.getPeso());
			stmt.setDate(2, java.sql.Date.valueOf(peso.getDataPeso()));
			stmt.setLong(3, peso.getIdPeso());
			stmt.executeUpdate();
			conexao.commit();
			stmt.close();
			conexao.close();
			return 1;
		} catch (SQLException e) {
			try {
				conexao.rollback();
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int delete(long id) {
		Connection conexao = ConnectionManager.getInstance().getConnection();
		try {
			PreparedStatement stmt = conexao.prepareStatement("DELETE FROM T_PESO WHERE ID_PESO = ?;");
			stmt.setLong(1, id);
			stmt.executeUpdate();
			conexao.commit();
			stmt.close();
			conexao.close();
			return 1;
		} catch (SQLException e) {
			try {
				conexao.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
