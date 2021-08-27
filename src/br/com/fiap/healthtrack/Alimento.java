package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe que abstrai um alimento presente em uma alimentação realizada pelo usuário.
 * Um mesmo alimento pode estar presente em várias alimentações de vários usuários em vários dias.
 * Um alimento pode não estar em nenhuma alimentação.
 * @author Marcelo Portella
 * @version 0.1
 */
public class Alimento implements Serializable {

	/**
	 * Controle de versionamento de objetos da classe Alimento.
	 */
	private static final long serialVersionUID = 1L;
	
	
	// Variáveis de Instância
	
	/**
	 * Número de identificação (ID) do alimento no sistema.
	 */
	private int foodId;
	
	/**
	 * Descrição do alimento.
	 */
	private String foodDescription;
	
	/**
	 * Quantidade de peso (gramas) por porção padrão do alimento.
	 */
	private float gramPerPortion;
	
	/**
	 * Quantidade de calorias (kcal) presente em uma grama do alimento.
	 */
	private float kcalPerGram;
	
	
	// Construtores da Classe
	
	/**
	 * Construtor padrão da classe.
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
	 * Consulta a descrição do alimento.
	 * @return Descrição do alimento.
	 */
	public String getFoodDescription() {
		return foodDescription;
	}
	/**
	 * Modifica a descrição do alimento.
	 * @param foodDescription Descrição do alimento.
	 */
	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}

	
	/**
	 * Consulta a quantidade de gramas por porção deste alimento.
	 * @return Peso (gramas) por porção.
	 */
	public float getGramPerPortion() {
		return gramPerPortion;
	}
	/**
	 * Modifica a quantidade de gramas por porção deste alimento.
	 * @param gramPerPortion Peso (gramas) por porção.
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
