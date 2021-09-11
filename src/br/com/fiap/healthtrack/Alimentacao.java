package br.com.fiap.healthtrack;

import java.io.Serializable;

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
	
	
	// Variáveis de Instância
	
	/**
	 * Data da Alimentação.
	 */
	private String mealDate;
	
	/**
	 * Código da Alimentação.
	 * A (Café da manhã), B (Almoço), C (Janta), D (Outras Alimentações).
	 */
	private char mealType;
	
	/**
	 * Total de Calorias (kcal) da Alimentação.
	 */
	private float mealKcal;
	
	/**
	 * Observações da Alimentação.
	 */
	private String mealNotes;
	
	
	// Construtores da Classe
	
	/**
	 * Construtor padrão da classe.
	 */
	public Alimentacao() {
	}

	/**
	 * Construtor completo.
	 * @param mealDate Data desta alimentação.
	 * @param mealType Tipo de alimentação que está sendo registrada.
	 * @param mealKcal Total de calorias consumidas nesta alimentação.
	 */
	public Alimentacao(String mealDate, char mealType, float mealKcal) {
		this.mealDate = mealDate;
		this.mealType = mealType;
		this.mealKcal = mealKcal;
	}

	/**
	 * Construtor completo (com observações).
	 * @param mealDate Data desta alimentação.
	 * @param mealType Tipo de alimentação que está sendo registrada.
	 * @param mealKcal Total de calorias consumidas nesta alimentação.
	 * @param mealNotes Observações desta refeição.
	 */
	public Alimentacao(String mealDate, char mealType, float mealKcal, String mealNotes) {
		this.mealDate = mealDate;
		this.mealType = mealType;
		this.mealKcal = mealKcal;
		this.mealNotes = mealNotes;
	}


	// Getters & Setters

	/**
	 * Consulta a data da alimentação.
	 * @return Data da Alimentação.
	 */
	public String getMealDate() {
		return mealDate;
	}
	/**
	 * Modifica a data da alimentação.
	 * @param mealDate A data da alimentação.
	 */
	public void setMealDate(String mealDate) {
		this.mealDate = mealDate;
	}

	
	/**
	 * Consulta o código da alimentação.
	 * @return Código da alimentação (mealType).
	 */
	public char getMealType() {
		return mealType;
	}
	/**
	 * Modifica o código da alimentação.
	 * @param mealType O código da alimentação.
	 */
	public void setMealType(char mealType) {
		this.mealType = mealType;
	}

	
	/**
	 * Consulta o total de calorias da alimentação.
	 * @return Total de calorias (kcal).
	 */
	public float getMealKcal() {
		return mealKcal;
	}
	/**
	 * Modifica o total de calorias da alimentação.
	 * @param mealKcal O total de calorias (kcal).
	 */
	public void setMealKcal(float mealKcal) {
		this.mealKcal = mealKcal;
	}

	
	/**
	 * Consulta as observações da alimentação.
	 * @return Observações da alimentação.
	 */
	public String getMealNotes() {
		return mealNotes;
	}
	/**
	 * Modifica as observações da alimentação.
	 * @param mealNotes Observações da alimentação.
	 */
	public void setMealNotes(String mealNotes) {
		this.mealNotes = mealNotes;
	}

	public void showData() {
		System.out.println("");
		System.out.println("Dados referentes a alimentação:");
		System.out.println(String.format("Data da alimentação: %s", mealDate));
		System.out.println(String.format("Cód. da alimentação: %s", mealType));
		System.out.println(String.format("Total de kcal: %s", mealKcal));
		System.out.println(String.format("Obs. da alimentação: %s", mealNotes));
		System.out.println("");

	}
}
