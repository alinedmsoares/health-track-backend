package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Classe que abstrai uma alimenta��o realizada pelo usu�rio.
 * Um usu�rio pode realizar v�rias alimenta��es ao longo do dia.
 * Um usu�rio pode n�o realizar nenhuma alimenta��o.
 * @author Marcelo Portella
 * @version 0.1
 */
public class Alimentacao implements Serializable {
	
	/**
	 * Controle de versionamento de objetos da classe Alimentacao.
	 */
	private static final long serialVersionUID = 1L;
	
	
	// Vari�veis de Inst�ncia
	
	/**
	 * Data da Alimenta��o.
	 */
	private String mealDate;
	
	/**
	 * C�digo da Alimenta��o.
	 * A (Caf� da manh�), B (Almo�o), C (Janta), D (Outras Alimenta��es).
	 */
	private char mealType;
	
	/**
	 * Total de Calorias (kcal) da Alimenta��o.
	 */
	private float mealKcal;
	
	/**
	 * Observa��es da Alimenta��o.
	 */
	private String mealNotes;
	
	
	// Construtores da Classe
	
	/**
	 * Construtor padr�o da classe.
	 */
	public Alimentacao() {
	}

	/**
	 * Construtor completo.
	 * @param mealDate Data desta alimenta��o.
	 * @param mealType Tipo de alimenta��o que est� sendo registrada.
	 * @param mealKcal Total de calorias consumidas nesta alimenta��o.
	 */
	public Alimentacao(String mealDate, char mealType, float mealKcal) {
		this.mealDate = mealDate;
		this.mealType = mealType;
		this.mealKcal = mealKcal;
	}

	/**
	 * Construtor completo (com observa��es).
	 * @param mealDate Data desta alimenta��o.
	 * @param mealType Tipo de alimenta��o que est� sendo registrada.
	 * @param mealKcal Total de calorias consumidas nesta alimenta��o.
	 * @param mealNotes Observa��es desta refei��o.
	 */
	public Alimentacao(String mealDate, char mealType, float mealKcal, String mealNotes) {
		this.mealDate = mealDate;
		this.mealType = mealType;
		this.mealKcal = mealKcal;
		this.mealNotes = mealNotes;
	}


	// Getters & Setters

	/**
	 * Consulta a data da alimenta��o.
	 * @return Data da Alimenta��o.
	 */
	public String getMealDate() {
		return mealDate;
	}
	/**
	 * Modifica a data da alimenta��o.
	 * @param mealDate A data da alimenta��o.
	 */
	public void setMealDate(String mealDate) {
		this.mealDate = mealDate;
	}

	
	/**
	 * Consulta o c�digo da alimenta��o.
	 * @return C�digo da alimenta��o (mealType).
	 */
	public char getMealType() {
		return mealType;
	}
	/**
	 * Modifica o c�digo da alimenta��o.
	 * @param mealType O c�digo da alimenta��o.
	 */
	public void setMealType(char mealType) {
		this.mealType = mealType;
	}

	
	/**
	 * Consulta o total de calorias da alimenta��o.
	 * @return Total de calorias (kcal).
	 */
	public float getMealKcal() {
		return mealKcal;
	}
	/**
	 * Modifica o total de calorias da alimenta��o.
	 * @param mealKcal O total de calorias (kcal).
	 */
	public void setMealKcal(float mealKcal) {
		this.mealKcal = mealKcal;
	}

	
	/**
	 * Consulta as observa��es da alimenta��o.
	 * @return Observa��es da alimenta��o.
	 */
	public String getMealNotes() {
		return mealNotes;
	}
	/**
	 * Modifica as observa��es da alimenta��o.
	 * @param mealNotes Observa��es da alimenta��o.
	 */
	public void setMealNotes(String mealNotes) {
		this.mealNotes = mealNotes;
	}

	public void showData() {
		System.out.println("");
		System.out.println("Dados referentes a alimenta��o:");
		System.out.println(String.format("Data da alimenta��o: %s", mealDate));
		System.out.println(String.format("C�d. da alimenta��o: %s", mealType));
		System.out.println(String.format("Total de kcal: %s", mealKcal));
		System.out.println(String.format("Obs. da alimenta��o: %s", mealNotes));
		System.out.println("");

	}
}
