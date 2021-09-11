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
	 * Controle de versionamento de objetos da classe Usuario.
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
	
	
// M�todo construtor
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
	 * @param idUser - Id do usu�rio
	 * @param height - Altura do usu�rio
	 */
	
	public Usuario(int idPessoa, String name, String birthdate, String genre, String email, String password, int idUser, Double height) {
		super(idPessoa, name, birthdate, genre, email, password);
		this.idUser = idUser;
		this.height = height;
	}
	
	// M�todos Get/Set
	
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
	
	//M�todos sobrescritos
	@Override
	public void showData() {
		super.showData();
		System.out.println("Dados referentes ao usu�rio:");
		System.out.println("ID: " + this.idUser);
		System.out.println("Altura: " + this.height);
	}
	
	
}
