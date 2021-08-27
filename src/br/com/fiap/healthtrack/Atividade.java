package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe Usuário
 * @author Adriana Estima
 * @version 0.1
 */

public class Atividade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idtype; //Id type
	private int duration; //Duração da atividade
	private String date; //Data da atividade
	private int calorie; //Quantidade de calorias
	private String senseExertion; //Sensação de esforço
		
	/**
	 * @param idType
	 * @param duration
	 * @param date
	 * @param calorie
	 * @param senseExertion
	*/
	
	public Atividade(int idType, int duration , String date, int calorie, String senseExertion) {
		super();
		this.idType = idType;
		this.duration = duration;
		this.date = date;
		this.calorie = calorie;
		this.senseExertion = senseExertion;
	}
	
	/**
	 * Inserir Tipo de Atividade
	 * @param IdAtividade
	 */
	public void setidType (int idType) {
		
		this.idType = idType;
		
	}
	/**
	 * Buscar Tipo de Atividade
	 * @param IdAtividade
	 */
	public idType getidType () {
		
		return = this.idType;
		
	}
		
	/**
	 * Inserir Duração da Atividade
	 * @param duration
	 */
		
	public void setDuration (int duration) {
		
		this.duration = duration;
			
	}
	/**
	 * Buscar Duração da Atividade
	 * @param duration
	 */
	public duration getDuration () {
		
		return = this.duration;
		
	}
		
	/**
	 * Inserir Data da Atividade
	 * @param date
	 */
		
	public void setDate (String date) {
				
		this.date = date;
				
	}
	/**
	 * Buscar Data da Atividade
	 * @param date
	 */
	public date getDate () {
		
		return = this.date;
		
	}
	/**
	 * Inserir Calorias da Atividade
	 * @param calorie
	 */
	public void setCalorie (int calorie) {
					
		this.calorie = calorie;
	}
	/**
	 * Buscar Calorias da Atividade
	 * @param calorie
	 */
	public calorie getCalorie () {
		
		return = this.calorie;
	}
	/**
	 * Inserir Sensação de Esforço
	 * @param senseExertion
	 */
	public void setSenseExertion (String senseExtersion) {
					
		this.senseExertion = senseExtersion;
	}
	/**
	 * Buscar Sensação de Esforço
	 * @param senseExtersion
	 */
	public senseExertion getsenseExertion () {
		
		return = this.senseExertion;
	}
	
			
			
			
			
		