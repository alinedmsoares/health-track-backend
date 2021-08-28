package br.com.fiap.healthtrack;

import java.io.Serializable;


/**
 * Classe Usuário
 * @author Aline Soares
 * @version 0.1
 */

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idUser; //Id do usuário
	private String name; //Nome do usuário
	private String birthdate; //Data de nascimento do usuário
	private String genre; //Gênero do usuário
	private Double height; //Altura do usuário
	private String email; //Email do usuário
	private String password; //Senha do usuário
	
	
	/**
	 * @param idUser - Id do usuário
	 * @param name - Nome do usuário
	 * @param birthdate - Data de nascimento do usuário
	 * @param genre - Gênero do usuário
	 * @param height - Altura do usuário
	 * @param email - Email do usuário
	 * @param password - Senha do usuário
	 */
	
	public Usuario(int idUser, String name, String birthdate, String genre, Double height, String email,
			String password) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.birthdate = birthdate;
		this.genre = genre;
		this.height = height;
		this.email = email;
		this.password = password;
	}
	
	/**
	 * Realizar login
	 * @param email - Email do usuário
	 * @param password - Senha do usuário
	 */
	public void login(String email, String password) {
		
		this.email = "alinedmsoares@gmail.com";
		this.password = "123Abc";
				
		if(email == this.email && password == this.password) {
			
			System.out.println("Login válido");
		} else {
			
			System.out.println("Login inválido");
		}
	}
	
	/**
	 * Verificar id do usuário
	 * @return Id do usuário
	 */
	public int getIdUser() {
		return idUser;
	}
	/**
	 * Configurar id do usuário
	 * @param idUser - Id do usuário
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
	/**
	 * Verificar nome do usuário
	 * @return Nome do usuário
	 */
	public String getName() {
		return name;
	}
	/**
	 * Configurar nome do usuário
	 * @param name - Nome do usuário
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Verificar data de nascimento do usuário
	 * @return Data de nascimento
	 */
	public String getBirthdate() {
		return birthdate;
	}
	/**
	 * Configurar data de nascimento do usuário
	 * @param birthdate - Data de nascimento do usuário
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	
	/**
	 * Verificar gênero do usuário
	 * @return Gênero do usuário.
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * Configurar gênero do usuário
	 * @param genre - Gênero do usuário
	 */

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	/**
	 * Verificar altura do usuário
	 * @return Altura do usuário
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * Configurar altura do usuário
	 * @param height - Altura do usuário
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	/**
	 * Verificar email do usuário
	 * @return email do usuário
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Configurar email do usuário
	 * @param email - Email do usuário
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Verificar senha do usuário
	 * @return senha do usuário
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Configurar senha do usuário
	 * @param password - Senha do usuário
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
