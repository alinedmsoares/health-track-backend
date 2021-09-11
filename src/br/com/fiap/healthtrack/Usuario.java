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
	 * Controle de versionamento de objetos da classe Usuario.
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
	
	
// Método construtor
	/**
	 * @param idPessoa
	 * @param name
	 * @param birthdate
	 * @param genre
	 * @param email
	 * @param password
	 */
	/**
	 * Construtor da classe Usuario
	 * @param idUser - Id do usuário
	 * @param height - Altura do usuário
	 */
	
	public Usuario(int idPessoa, String name, String birthdate, String genre, String email, String password, int idUser, Double height) {
		super(idPessoa, name, birthdate, genre, email, password);
		this.idUser = idUser;
		this.height = height;
	}
	
	// Métodos Get/Set
	
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
	
	//Métodos sobrescritos
	@Override
	public void showData() {
		super.showData();
		System.out.println("Dados referentes ao usuário:");
		System.out.println("ID: " + this.idUser);
		System.out.println("Altura: " + this.height);
	}
	
	
}
