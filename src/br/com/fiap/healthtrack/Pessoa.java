package br.com.fiap.healthtrack;

public class Pessoa {

	public Pessoa() {
	}

	public static void main(String[] args) {

	}	

	// Classe Pessoa //


	public static final long serialVersionUID = 1L;
	private int idPessoa;
	private String name;
	private String birthdate;
	private String genre;
	private String email;
	private String password;

	public Pessoa(int idPessoa, String name, String birthdate, String genre, String email, String password) {
		super();
		this.idPessoa = idPessoa;
		this.name = name;
		this.birthdate = birthdate;
		this.genre = genre;
		this.email = email;
		this.password = password;
	}


	public void login(String email, String password) {

		this.email = "aline@gmail.com";
		this.password = "123Abc";

		if(email == this.email && password == this.password) {

			System.out.println("Login válido");
		} else {

			System.out.println("Login inválido");
		}
	}

	// get - set //

	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void showData() {
		System.out.println("");
		System.out.println("Dados referentes a pessoa:");
		System.out.println("Id: " + this.idPessoa);
		System.out.println("Nome: " + this.name);
		System.out.println("Data de nascimento: " + this.birthdate);
		System.out.println("Gênero: " + this.genre);
		System.out.println("Email: " + this.email);
		System.out.println("Senha: " + this.password);
		System.out.println("");

	}
}




