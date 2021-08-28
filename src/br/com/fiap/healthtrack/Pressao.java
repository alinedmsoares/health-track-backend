package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe Pressão
 * @author Aline Soares
 * @version 0.1
 */

public class Pressao implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idPressure; //Id da medição
	private double systolicPressure; //Pressão sistólica
	private double diastolicPressure; //Pressão diastólica
	private String dtMeasurement; //Data da medição
	private String pressureSituation; //Situação da pressão


	/**
	 * @param idPressure - Id da pressão
	 * @param systolicPressure - Pressão Sistólica
	 * @param diastolicPressure - Pressão Diastólica
	 * @param dtMeasurement - Data da medição
	 */
	public Pressao(int idPressure, double systolicPressure, double diastolicPressure, String dtMeasurement) {
		super();
		this.idPressure = idPressure;
		this.systolicPressure = systolicPressure;
		this.diastolicPressure = diastolicPressure;
		this.dtMeasurement = dtMeasurement;

	}
	
	/**
	 * Calcular situação da pressão
	 * @param systolicPressure - Pressão Sistólica
	 * @param diastolicPressure - Pressão Diastólica
	 */
	public void calculatePressureSituation(double systolicPressure, double diastolicPressure) {

		if(systolicPressure > 140 || diastolicPressure > 90) {
			
			this.pressureSituation = "Elevada";

		} else if (systolicPressure < 120 || diastolicPressure < 80) {
			
			this.pressureSituation = "Abaixo do normal";

		} else if(systolicPressure >= 120 && systolicPressure <= 140 || diastolicPressure >= 80 && diastolicPressure <= 90) {
			
			this.pressureSituation = "Normal";

		} 

	}

	/**
	 * Verificar id da pressão
	 * @return Id da pressão.
	 */
	public int getIdPressure() {
		return idPressure;
	}

	
	/**
	 * Configurar id da pressão
	 * @param idPressure - Id da pressão
	 */
	public void setIdPressure(int idPressure) {
		this.idPressure = idPressure;
	}

	/**
	 * Verificar Pressão Sistólica
	 * @return Pressão sistólica.
	 */
	public double getSystolicPressure() {
		return systolicPressure;
	}

	
	/**
	 * Configurar Pressão Sistólica
	 * @param systolicPressure - Pressão Sistólica
	 */
	public void setSystolicPressure(double systolicPressure) {
		this.systolicPressure = systolicPressure;
	}

	/**
	 * Verificar Pressão Diastólica
	 * @return Pressão diastólica.
	 */
	public double getDiastolicPressure() {
		return diastolicPressure;
	}

	
	/**
	 * Configurar Pressão Diastólica
	 * @param diastolicPressure - Pressão Diastólica
	 */
	public void setDiastolicPressure(double diastolicPressure) {
		this.diastolicPressure = diastolicPressure;
	}

	/**
	 * Verificar Data de Medição da Pressão
	 * @return Data de medição da pressão.
	 */
	public String getDtMeasurement() {
		return dtMeasurement;
	}

	
	/**
	 * Configurar Data de Medição da Pressão
	 * @param dtMeasurement - Data da medição
	 */
	public void setDtMeasurement(String dtMeasurement) {
		this.dtMeasurement = dtMeasurement;
	}

	/**
	 * Verificar Situação da Pressão
	 * @return Situação da pressão.
	 */
	public String getPressureSituation() {
		return pressureSituation;
	}

	
	/**
	 * Configurar Situação da Pressão
	 * @param pressureSituation - Situação da pressão
	 */
	public void setPressureSituation(String pressureSituation) {
		this.pressureSituation = pressureSituation;
	}

	

}
