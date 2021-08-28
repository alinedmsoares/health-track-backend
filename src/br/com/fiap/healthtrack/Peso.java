package br.com.fiap.healthtrack;
import java.io.Serializable;
import java.util.Date;


/**
 * Classe Peso
 * @author Felipe
 * @version 0.1
 */

public class Peso implements Serializable{

	private static final long serialVersionUID = 1L;
	private double weight; //Peso
	private int idWeight; //Id peso
	private Date dtWeighing; //Data de pesagem
	
	/**
	 * @param weight - Peso do usuário
	 * @param idWeight - Id do registro de peso do usuário
	 * @param dtWeighing - Data da pesagem
	 */
	
	public Peso(double weight, int idWeight, Date dtWeighing) {
		super();
		this.weight = weight;
		this.idWeight = idWeight;
		this.dtWeighing = dtWeighing;
	}
	
	
	/**
	 * Buscar Id Peso
	 */
	public int getIdWeight() {
		return idWeight;
	}
	
	/**
	 * Inserir Id Peso
	 * @param idWeight - Id do registro de peso do usuário
	 */
	public void setIdWeight(int idWeight) {
		this.idWeight = idWeight;
	}
	
	/**
	 * Buscar Pesagem
	 */
	public double getWeight() {
		return weight;
			
	}
	
	/**
	 * Inserir Peso
	 * @param weight - Peso do usuário
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * Buscar Data Pesagem
	 */
	public Date getDtWeighing() {
		return dtWeighing;
	}
	
	/**
	 * Inserir Data Pesagem
	 * @param dtWeighing - Data da pesagem
	 */
	public void setDtWeighing(Date dtWeighing) {
		this.dtWeighing = dtWeighing;
	}
}