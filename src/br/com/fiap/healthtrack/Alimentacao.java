package br.com.fiap.healthtrack;

import java.io.Serializable;
import java.sql.Date;

/**
 * Classe que abstrai uma alimentação realizada pelo usuário.
 * Um usuário pode realizar várias alimentações ao longo do dia.
 * Um usuário pode não realizar nenhuma alimentação.
 * @author Marcelo Portella
 * @version 0.1
 */
public class Alimentacao implements Serializable {
	
	/**
	 * Controle de versionamento de objetos da classe Alimentacao.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ID da Alimentação.
	 */
	private int idAlimentacao;
	
	/**
	 * Total de Calorias (kcal) da Alimentação.
	 */
	private int qtdeCaloria;
	
	/**
	 * Descrição do Alimento.
	 */
	private String descricaoAlimento;
	
	/**
	 * Data da alimentação.
	 */
	private Date dataAlimentacao;
	
	
	/**
	 * Construtor padrão da classe.
	 */
	public Alimentacao() {
	}
	
	public Alimentacao(int idAlimentacao, int qtdeCaloria, String descricaoAlimento, Date dataAlimentacao) {
		this.idAlimentacao = idAlimentacao;
		this.qtdeCaloria = qtdeCaloria;
		this.descricaoAlimento = descricaoAlimento;
		this.dataAlimentacao = dataAlimentacao;
	}


	public int getIdAlimentacao() {
		return idAlimentacao;
	}


	public void setIdAlimentacao(int idAlimentacao) {
		this.idAlimentacao = idAlimentacao;
	}


	public int getQtdeCaloria() {
		return qtdeCaloria;
	}


	public void setQtdeCaloria(int qtdeCaloria) {
		this.qtdeCaloria = qtdeCaloria;
	}


	public String getDescricaoAlimento() {
		return descricaoAlimento;
	}


	public void setDescricaoAlimento(String descricaoAlimento) {
		this.descricaoAlimento = descricaoAlimento;
	}


	public Date getDataAlimentacao() {
		return dataAlimentacao;
	}


	public void setDataAlimentacao(Date dataAlimentacao) {
		this.dataAlimentacao = dataAlimentacao;
	}


	

}
