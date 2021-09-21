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
	 * Construtor padrão da classe Peso.
	 */
	public Peso() {
	}
	
	/**
	 * Construtor completo da classe Peso.
	 * @param weightDate - Data do peso.
	 * @param weight - Peso do usuário.
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
	 * Consulta o peso do usuário.
	 * @return O peso do usuário.
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Modifica o peso do usuário.
	 * @param weight O peso do usuário.
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