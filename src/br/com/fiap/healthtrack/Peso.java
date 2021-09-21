package br.com.fiap.healthtrack;

import java.io.Serializable;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * Classe Peso
 * @author Felipe
 * @version 0.1
 */
public class Peso implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	private Calendar weightDate;
	private double weight;
	
	
	
	/**
	 * Construtor padr�o da classe Peso.
	 */
	public Peso() {
	}
	
	/**
	 * Construtor completo da classe Peso.
	 * @param weightDate - Data do peso.
	 * @param weight - Peso do usu�rio.
	 */
	public Peso(Calendar weightDate, double weight) {
		this.weightDate = weightDate;
		this.weight = weight;
	}
	
	
	
	/**
	 * Consulta a data da pesagem.
	 * @return A data da pesagem.
	 */
	public Calendar getWeightDate() {
		return weightDate;
	}
	
	/**
	 * Modifica a data da pesagem.
	 * @param weightDate A data da pesagem.
	 */
	public void setWeightDate(Calendar weightDate) {
		this.weightDate = weightDate;
	}
	

	
	/**
	 * Consulta o peso do usu�rio.
	 * @return O peso do usu�rio.
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Modifica o peso do usu�rio.
	 * @param weight O peso do usu�rio.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Peso [weightDate=" + sdf.format(weightDate.getTime())
                + ", weight=" + String.format("%.1f",weight) + "]";
	}
	
}