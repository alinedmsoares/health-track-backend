package br.com.fiap.healthtrack.model.dao;

import br.com.fiap.healthtrack.model.beans.Pressao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PressaoDAO {
	
	public List<Pressao> getAll(long id) {
		List<Pressao> listaPressao = new ArrayList<Pressao>();
		try {
			Connection conexao = ConnectionManager.getInstance().getConnection();
			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_PRESSAO WHERE USUARIO_ID_USUARIO = ?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Pressao medicao = new Pressao();
				long idPressao = rs.getLong("ID_PRESSAO");
				medicao.setIdPressao(idPressao);
				short sistolica = rs.getShort("SISTOLICA");
				medicao.setPressaoDiastolica(sistolica);
				short diastolica = rs.getShort("DIASTOLICA");
				medicao.setPressaoDiastolica(diastolica);
				java.sql.Date sqlDate = rs.getDate("DT_PRESSAO");
				int dia = sqlDate.toLocalDate().getDayOfMonth();
				int mes = sqlDate.toLocalDate().getMonthValue();
				int ano = sqlDate.toLocalDate().getYear();
				String dataPressao = dia + "/" + mes + "/" + ano;
				medicao.setDataPressao(dataPressao);
				listaPressao.add(medicao);
			}
			rs.close();
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaPressao;
	}
	
	
	public int add(long id, Pressao pressao) {
		Connection conexao = ConnectionManager.getInstance().getConnection();
		try {
			PreparedStatement stmt = conexao.prepareStatement("INSERT INTO T_PRESSAO (ID_PRESSAO, SISTOLICA, DIASTOLICA, DT_PRESSAO, USUARIO_ID_USUARIO) "
															+ "VALUES (SEQ_PRESSAO.nextval, ?, ?, ?, ?);");
			stmt.setShort(1, pressao.getPressaoSistolica());
			stmt.setShort(2, pressao.getPressaoDiastolica());
			stmt.setDate(3, java.sql.Date.valueOf(pressao.getDataPressao()));
			stmt.setLong(4, id);
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
	
	
	public int update(Pressao pressao) {
		Connection conexao = ConnectionManager.getInstance().getConnection();
		try {
			PreparedStatement stmt = conexao.prepareStatement("UPDATE T_PRESSAO SET SISTOLICA = ?, DIASTOLICA = ?, DT_PRESSAO = ? WHERE ID_PRESSAO = ?;");
			stmt.setShort(1, pressao.getPressaoSistolica());
			stmt.setShort(2, pressao.getPressaoDiastolica());
			stmt.setDate(3, java.sql.Date.valueOf(pressao.getDataPressao()));
			stmt.setLong(4, pressao.getIdPressao());
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
			PreparedStatement stmt = conexao.prepareStatement("DELETE FROM T_PRESSAO WHERE ID_PRESSAO = ?;");
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
