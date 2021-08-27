package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe que abstrai um alimento presente em uma alimenta��o realizada pelo usu�rio.
 * Um mesmo alimento pode estar presente em v�rias alimenta��es de v�rios usu�rios em v�rios dias.
 * Um alimento pode n�o estar em nenhuma alimenta��o.
 * @author Marcelo Portella
 * @version 0.1
 */
public class Alimento implements Serializable {

	/**
	 * Controle de versionamento de objetos da classe Alimento.
	 */
	private static final long serialVersionUID = 1L;
	
	
	// Vari�veis de Inst�ncia
	
	/**
	 * N�mero de identifica��o (ID) do alimento no sistema.
	 */
	private int foodId;
	
	/**
	 * Descri��o do alimento.
	 */
	private String foodDescription;
	
	/**
	 * Quantidade de peso (gramas) por por��o padr�o do alimento.
	 */
	private float gramPerPortion;
	
	/**
	 * Quantidade de calorias (kcal) presente em uma grama do alimento.
	 */
	private float kcalPerGram;
	
	
	// Construtores da Classe
	
	/**
	 * Construtor padr�o da classe.
	 */
	public Alimento() {
	}
	
	
	// Getters & Setters
	
	/**
	 * Consulta o ID do alimento.
	 * @return ID do alimento (foodId).
	 */
	public int getFoodId() {
		return foodId;
	}
	/**
	 * Modifica o ID do alimento.
	 * @param foodId ID do alimento.
	 */
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	
	/**
	 * Consulta a descri��o do alimento.
	 * @return Descri��o do alimento.
	 */
	public String getFoodDescription() {
		return foodDescription;
	}
	/**
	 * Modifica a descri��o do alimento.
	 * @param foodDescription Descri��o do alimento.
	 */
	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}

	
	/**
	 * Consulta a quantidade de gramas por por��o deste alimento.
	 * @return Peso (gramas) por por��o.
	 */
	public float getGramPerPortion() {
		return gramPerPortion;
	}
	/**
	 * Modifica a quantidade de gramas por por��o deste alimento.
	 * @param gramPerPortion Peso (gramas) por por��o.
	 */
	public void setGramPerPortion(float gramPerPortion) {
		this.gramPerPortion = gramPerPortion;
	}
	
	
	/**
	 * Consulta a quantidade de calorias (kcal) por grama do alimento.
	 * @return kcal por grama.
	 */
	public float getKcalPerGram() {
		return kcalPerGram;
	}
	/**
	 * Modifica a quantidade de calorias (kcal) por grama do alimento.
	 * @param kcalPerGram kcal por grama.
	 */
	public void setKcalPerGram(float kcalPerGram) {
		this.kcalPerGram = kcalPerGram;
	}
	
	
}
