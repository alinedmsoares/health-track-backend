package br.com.fiap.healthtrack.model.dao;

import br.com.fiap.healthtrack.model.beans.Atividade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtividadeDAO {
	
	public List<Atividade> getAll(long id) {
		List<Atividade> listaAtividade = new ArrayList<Atividade>();
		try {
			Connection conexao = ConnectionManager.getInstance().getConnection();
			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_ATIVIDADE WHERE T_USUARIO_ID_USUARIO = ?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Atividade atv = new Atividade();
				long idAtividade = rs.getLong("ID_ATIVIDADE");
				atv.setIdAtividade(idAtividade);
				java.sql.Timestamp sqlDate = rs.getTimestamp("DT_ATIVIDADE");
				int dia = sqlDate.toLocalDateTime().getDayOfMonth();
				int mes = sqlDate.toLocalDateTime().getMonthValue();
				int ano = sqlDate.toLocalDateTime().getYear();
				String dataAtividade = dia + "/" + mes + "/" + ano;
				atv.setDataAtividade(dataAtividade);
				int hora = sqlDate.toLocalDateTime().getHour();
				int minuto = sqlDate.toLocalDateTime().getMinute();
				String horaAtividade = hora + ":" + minuto;
				atv.setHoraAtividade(horaAtividade);
				String categoria = rs.getString("CATEGORIA");
				atv.setCategoria(categoria);
				short kcal = rs.getShort("KCAL");
				atv.setKcal(kcal);
				String descricao = rs.getString("DESCRICAO");
				atv.setDescricao(descricao);
				listaAtividade.add(atv);
			}
			rs.close();
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaAtividade;
	}
	
	
	public int add(long id, Atividade atividade) {
		Connection conexao = ConnectionManager.getInstance().getConnection();
		try {
			PreparedStatement stmt = conexao.prepareStatement("INSERT INTO T_ATIVIDADE (ID_ATIVIDADE, DT_ATIVIDADE, CATEGORIA, KCAL, DESCRICAO, T_USUARIO_ID_USUARIO) "
															+ "VALUES (SEQ_ATIVIDADE.nextval, ?, ?, ?, ?, ?);");
			String dataAtividade = atividade.getDataAtividade() + " " + atividade.getHoraAtividade() + ":00";
			stmt.setTimestamp(1, java.sql.Timestamp.valueOf(dataAtividade));
			stmt.setString(2, atividade.getCategoria());
			stmt.setShort(3, atividade.getKcal());
			stmt.setString(4, atividade.getDescricao());
			stmt.setLong(5, id);
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
	
	
	public int update(Atividade atividade) {
		Connection conexao = ConnectionManager.getInstance().getConnection();
		try {
			PreparedStatement stmt = conexao.prepareStatement("UPDATE T_ATIVIDADE SET DT_ATIVIDADE = ?, CATEGORIA = ?, KCAL = ?, DESCRICAO = ? WHERE ID_ATIVIDADE = ?;");
			String dataAtividade = atividade.getDataAtividade() + " " + atividade.getHoraAtividade() + ":00";
			stmt.setTimestamp(1, java.sql.Timestamp.valueOf(dataAtividade));
			stmt.setString(2, atividade.getCategoria());
			stmt.setShort(3, atividade.getKcal());
			stmt.setString(4, atividade.getDescricao());
			stmt.setLong(5, atividade.getIdAtividade());
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
			PreparedStatement stmt = conexao.prepareStatement("DELETE FROM T_ATIVIDADE WHERE ID_ATIVIDADE = ?;");
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
