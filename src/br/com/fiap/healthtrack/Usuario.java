package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Subclasse que abstrai um usu�rio comum do sistema Health Track.
 * Herda a superclasse Pessoa.
 * @author Aline Soares
 * @version 0.1
 */
public class Usuario extends Pessoa implements Serializable {
	
	/**
	 * Controle de versionamento de objetos da classe Alimentacao.
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	// Vari�veis de Inst�ncia
	
	/**
	 * Id do usu�rio
	 */
	private int idUser;
	
	/**
	 * Altura do usu�rio
	 */
	private Double height;
	
	
	
	// Construtores da Classe
	
	/**
	 * Construtor padr�o da classe Usuario.
	 */
	public Usuario() {
		super();
	}
	
	/**
	 * Construtor da classe Usuario
	 * @param idUser - Id do usu�rio
	 * @param height - Altura do usu�rio
	 */
	public Usuario(int idUser, Double height) {
		super();
		this.idUser = idUser;
		this.height = height;
	}	
	
	
	
	// M�todos

	/**
	 * Verifica id do usu�rio
	 * @return Id do usu�rio
	 */
	public int getIdUser() {
		return idUser;
	}
	/**
	 * Configura id do usu�rio
	 * @param idUser - Id do usu�rio
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
	/**
	 * Verifica altura do usu�rio
	 * @return Altura do usu�rio
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * Configura altura do usu�rio
	 * @param height - Altura do usu�rio
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	/**
	 * Realiza o login do usu�rio no sistema.
	 * @param email - Email do usu�rio
	 * @param password - Senha do usu�rio
	 */
	public void login(String email, String password) {
		String userEmail = super.getEmail();
		String userPassword = super.getPassword();
		if(email == userEmail && password == userPassword) {
			System.out.println("Login v�lido");
		} else {
			System.out.println("Login inv�lido");
		}
	}
	
	
	
}
