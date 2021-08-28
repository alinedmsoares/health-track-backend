package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe Atividade
 * @author Adriana Estima
 * @version 0.1
 */

public class Atividade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Id Atividade
	 */
	private int idActivity; 
	/**
	 * Tipo de atividade
	 */
	private String activityType;
	/**
	 * Duração da atividade
	 */
	private int duration;
	/**
	 * Data da atividade
	 */
	private String date;
	/**
	 * Quantidade de calorias
	 */
	private int calorie;
	/**
	 * Sensação de esforço
	 */
	private String senseExertion;
		
	/**
	 * @param idActivity - Id da Atividade
	 * @param activityType - Tipo da atividade
	 * @param duration - Duração da atividade
	 * @param date - Data da realização da atividade
	 * @param calorie - Calorias gastas com a atividade
	 * @param senseExertion - Sensação de esforço na atividade
	*/
	
	public Atividade(int idActivity, String activityType, int duration , String date, int calorie, String senseExertion) {
		super();
		this.idActivity = idActivity;
		this.activityType = activityType;
		this.duration = duration;
		this.date = date;
		this.calorie = calorie;
		this.senseExertion = senseExertion;
	}
	
	/**
	 * Inserir Id Atividade
	 * @param idActivity - Id da Atividade
	 */
	public void setIdActivity (int idActivity) {
		
		this.idActivity = idActivity;
		
	}
	/**
	 * Buscar Id Atividade
	 * @return Id da Atividade
	 */
	public int getIdActivity () {
		
		return idActivity;
		
	}
	
	/**
	 * Inserir Tipo de Atividade
	 * @param activityType - Tipo da atividade
	 */
	public void setActivityType (String activityType) {
		
		this.activityType = activityType;
		
	}
	/**
	 * Buscar Tipo de Atividade
	 * @return Tipo de Atividade
	 */
	public String getActivityType () {
		
		return activityType;
		
	}
		
	/**
	 * Inserir Duração da Atividade
	 * @param duration - Duração da atividade
	 */
		
	public void setDuration (int duration) {
		
		this.duration = duration;
			
	}
	/**
	 * Buscar Duração da Atividade
	 * @return Duração da Atividade
	 */
	public int getDuration () {
		
		return duration;
		
	}
		
	/**
	 * Inserir Data da Atividade
	 * @param date - Data da realização da atividade
	 */
		
	public void setDate (String date) {
				
		this.date = date;
				
	}
	/**
	 * Buscar Data da Atividade
	 * @return Data da Atividade
	 */
	public String getDate () {
		
		return date;
		
	}
	/**
	 * Inserir Calorias da Atividade
	 * @param calorie - Calorias gastas com a atividade
	 */
	public void setCalorie (int calorie) {
					
		this.calorie = calorie;
	}
	/**
	 * Buscar Calorias da Atividade
	 * @return Calorias gastas com a atividade
	 */
	public int getCalorie () {
		
		return calorie;
	}
	/**
	 * Inserir Sensação de Esforço
	 * @param senseExertion - Sensação de esforço na atividade
	 */
	public void setSenseExertion (String senseExertion) {
					
		this.senseExertion = senseExertion;
	}
	/**
	 * Buscar Sensação de Esforço
	 * @return Sensação de esforço na atividade
	 */
	public String getSenseExertion () {
		
		return senseExertion;
	}
}
