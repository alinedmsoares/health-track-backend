package br.com.fiap.healthtrack;

public class Executable {

	public static void main(String[] args) {

		Usuario user = new Usuario(123, "Aline", "12/06/2002", "F", 1.60, "alinedmsoares@gmail.com", "1234Abc");
		
//		------------- Id do usu�rio ------------- 
		System.out.println("Exibindo o id do usu�rio:");
		System.out.println(user.getIdUser());
		
		/**
		 * Alterar id do usu�rio
		 * @param novo id do usu�rio
		 */
		user.setIdUser(321);
		
		System.out.println("Exibindo o novo id do usu�rio:");
		System.out.println(user.getIdUser());
		System.out.println("----------------------------------");


//		------------- Nome do usu�rio ------------- 
		System.out.println("Exibindo o nome do usu�rio:");
		System.out.println(user.getName());
		
		/**
		 * Alterar nome do usu�rio
		 * @param novo nome do usu�rio
		 */		
		user.setName("Aline Soares");
		
		System.out.println("Exibindo o novo nome do usu�rio:");
		System.out.println(user.getName());
		System.out.println("----------------------------------");
		
//		------------- Data de nascimento do usu�rio ------------- 
		System.out.println("Exibindo a data de nascimento do usu�rio:");
		System.out.println(user.getBirthdate());
		
		/**
		 * Alterar data de nascimento do usu�rio
		 * @param nova data de nascimento do usu�rio
		 */
		user.setBirthdate("12/06/2000");
		
		System.out.println("Exibindo a nova data de nascimento nome do usu�rio:");
		System.out.println(user.getBirthdate());
		System.out.println("----------------------------------");
		
//		------------- G�nero do usu�rio ------------- 
		System.out.println("Exibindo o g�nero do usu�rio:");
		System.out.println(user.getGenre());
		
		/**
		 * Alterar g�nero do usu�rio
		 * @param novo g�nero do usu�rio
		 */
		user.setGenre("Feminino");
		
		System.out.println("Exibindo o novo g�nero do usu�rio:");
		System.out.println(user.getGenre());
		System.out.println("----------------------------------");
		
//		------------- Altura do usu�rio ------------- 
		System.out.println("Exibindo a altura do usu�rio:");
		System.out.println(user.getHeight());
		
		/**
		 * Alterar altura do usu�rio
		 * @param nova altura do usu�rio
		 */
		user.setHeight(1.59);
		
		System.out.println("Exibindo a nova altura do usu�rio:");
		System.out.println(user.getHeight());
		System.out.println("----------------------------------");
		
//		------------- Email do usu�rio ------------- 
		System.out.println("Exibindo o email do usu�rio:");
		System.out.println(user.getEmail());
		
		/**
		 * Alterar email do usu�rio
		 * @param novo email do usu�rio
		 */
		user.setEmail("alinedmsoares01@gmail.com");
		
		System.out.println("Exibindo o novo email do usu�rio:");
		System.out.println(user.getEmail());
		System.out.println("----------------------------------");
		
//		------------- Senha do usu�rio ------------- 
		System.out.println("Exibindo a senha do usu�rio:");
		System.out.println(user.getPassword());
		
		/**
		 * Alterar senha do usu�rio
		 * @param nova senha do usu�rio
		 */
		user.setPassword("Abc123");
		
		System.out.println("Exibindo a nova senha do usu�rio:");
		System.out.println(user.getPassword());
		System.out.println("----------------------------------");		


		//Teste de login v�lido
		user.login("alinedmsoares@gmail.com", "123Abc");
		
		//Teste de login inv�lido
		user.login("alinedmsoares@gmail.com", "321Abc");
	}

	Atividade user = new Atividade(01, 60, "28/08/21", 600, "forte");
	
//	------------- Id da Atividade ------------- 
	System.out.println("Exibindo o id da atividade:");
	System.out.println(user.getIdUser());
	
	/**
	 * Alterar id da Atividade
	 * @param novo id da Atividade
	 */
	user.setIdUser(321);
	
	System.out.println("Exibindo o novo id do usu�rio:");
	System.out.println(user.getIdUser());
	System.out.println("----------------------------------");

}
