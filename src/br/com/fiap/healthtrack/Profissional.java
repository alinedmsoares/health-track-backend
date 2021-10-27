package br.com.fiap.healthtrack;

import java.io.Serializable;

/**
 * Subclasse que abstrai um profissional do sistema Health Track.
 * Herda a superclasse Pessoa.
 * @author Aline Soares
 * @version 0.1
 */
public class Profissional extends Pessoa implements Serializable {

	/**
	 * Controle de versionamento de objetos da classe Profissional.
	 */
	private static final long serialVersionUID = 1L;



	// Vari�veis de Inst�ncia

	/**
	 * Id do profissional
	 */
	private int idProfessional;

	/**
	 * �rea do profissional
	 */
	private String profession;

	/**
	 * Descri��o do profissional
	 */
	private String description;


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
	 * Construtor da classe Profissional
	 * @param idProfessional - Id do Profissional
	 * @param profession - �rea do profissional
	 * @param description - Descri��o do profissional
	 */

	public Profissional(int idPessoa, String name, String birthdate, String genre, String email, String password, int idProfessional, String profession, String description) {
		super(idPessoa, name, birthdate, genre, email, password);
		this.idProfessional = idProfessional;
		this.profession = profession;
		this.description = description;
	}

	// M�todos Get/Set


	/**
	 * Verifica id do profissional
	 * @return Id do profissional
	 */

	public int getIdProfessional() {
		return idProfessional;
	}

	public void setIdProfessional(int idProfessional) {
		this.idProfessional = idProfessional;
	}

	/**
	 * Verifica �rea do profissional
	 * @return �rea do profissional
	 */

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * Verifica Descri��o do profissional
	 * @return Descri��o do profissional
	 */

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	

	
	//M�todos sobrescritos
		@Override
		public void showData() {
			super.showData();
			System.out.println("Dados referentes ao profissional:");
			System.out.println("Id: " + this.idProfessional);
			System.out.println("Profiss�o: " + this.profession);
			System.out.println("Descri��o: " + this.description);
		}
}



