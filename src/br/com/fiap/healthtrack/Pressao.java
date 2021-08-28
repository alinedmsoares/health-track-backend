package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe Press�o
 * @author Aline Soares
 * @version 0.1
 */

public class Pressao implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idPressure; //Id da medi��o
	private double systolicPressure; //Press�o sist�lica
	private double diastolicPressure; //Press�o diast�lica
	private String dtMeasurement; //Data da medi��o
	private String pressureSituation; //Situa��o da press�o


	/**
	 * @param idPressure - Id da press�o
	 * @param systolicPressure - Press�o Sist�lica
	 * @param diastolicPressure - Press�o Diast�lica
	 * @param dtMeasurement - Data da medi��o
	 */
	public Pressao(int idPressure, double systolicPressure, double diastolicPressure, String dtMeasurement) {
		super();
		this.idPressure = idPressure;
		this.systolicPressure = systolicPressure;
		this.diastolicPressure = diastolicPressure;
		this.dtMeasurement = dtMeasurement;

	}
	
	/**
	 * Calcular situa��o da press�o
	 * @param systolicPressure - Press�o Sist�lica
	 * @param diastolicPressure - Press�o Diast�lica
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
	 * Verificar id da press�o
	 * @return Id da press�o.
	 */
	public int getIdPressure() {
		return idPressure;
	}

	
	/**
	 * Configurar id da press�o
	 * @param idPressure - Id da press�o
	 */
	public void setIdPressure(int idPressure) {
		this.idPressure = idPressure;
	}

	/**
	 * Verificar Press�o Sist�lica
	 * @return Press�o sist�lica.
	 */
	public double getSystolicPressure() {
		return systolicPressure;
	}

	
	/**
	 * Configurar Press�o Sist�lica
	 * @param systolicPressure - Press�o Sist�lica
	 */
	public void setSystolicPressure(double systolicPressure) {
		this.systolicPressure = systolicPressure;
	}

	/**
	 * Verificar Press�o Diast�lica
	 * @return Press�o diast�lica.
	 */
	public double getDiastolicPressure() {
		return diastolicPressure;
	}

	
	/**
	 * Configurar Press�o Diast�lica
	 * @param diastolicPressure - Press�o Diast�lica
	 */
	public void setDiastolicPressure(double diastolicPressure) {
		this.diastolicPressure = diastolicPressure;
	}

	/**
	 * Verificar Data de Medi��o da Press�o
	 * @return Data de medi��o da press�o.
	 */
	public String getDtMeasurement() {
		return dtMeasurement;
	}

	
	/**
	 * Configurar Data de Medi��o da Press�o
	 * @param dtMeasurement - Data da medi��o
	 */
	public void setDtMeasurement(String dtMeasurement) {
		this.dtMeasurement = dtMeasurement;
	}

	/**
	 * Verificar Situa��o da Press�o
	 * @return Situa��o da press�o.
	 */
	public String getPressureSituation() {
		return pressureSituation;
	}

	
	/**
	 * Configurar Situa��o da Press�o
	 * @param pressureSituation - Situa��o da press�o
	 */
	public void setPressureSituation(String pressureSituation) {
		this.pressureSituation = pressureSituation;
	}

	

}
