package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Subclasse que abstrai um usuário comum do sistema Health Track.
 * Herda a superclasse Pessoa.
 * @author Aline Soares
 * @version 0.1
 */
public class Usuario extends Pessoa implements Serializable {
	
	/**
	 * Controle de versionamento de objetos da classe Alimentacao.
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	// Variáveis de Instância
	
	/**
	 * Id do usuário
	 */
	private int idUser;
	
	/**
	 * Altura do usuário
	 */
	private Double height;
	
	
	
	// Construtores da Classe
	
	/**
	 * Construtor padrão da classe Usuario.
	 */
	public Usuario() {
		super();
	}
	
	/**
	 * Construtor da classe Usuario
	 * @param idUser - Id do usuário
	 * @param height - Altura do usuário
	 */
	public Usuario(int idUser, Double height) {
		super();
		this.idUser = idUser;
		this.height = height;
	}	
	
	
	
	// Métodos

	/**
	 * Verifica id do usuário
	 * @return Id do usuário
	 */
	public int getIdUser() {
		return idUser;
	}
	/**
	 * Configura id do usuário
	 * @param idUser - Id do usuário
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
	/**
	 * Verifica altura do usuário
	 * @return Altura do usuário
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * Configura altura do usuário
	 * @param height - Altura do usuário
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	/**
	 * Realiza o login do usuário no sistema.
	 * @param email - Email do usuário
	 * @param password - Senha do usuário
	 */
	public void login(String email, String password) {
		String userEmail = super.getEmail();
		String userPassword = super.getPassword();
		if(email == userEmail && password == userPassword) {
			System.out.println("Login válido");
		} else {
			System.out.println("Login inválido");
		}
	}
	
	
	
}
