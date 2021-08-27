package br.com.fiap.healthtrack;

public class Executable {

	public static void main(String[] args) {

		Usuario user = new Usuario(123, "Aline", "12/06/2002", "F", 1.60, "alinedmsoares@gmail.com", "1234Abc");
		
//		------------- Id do usuário ------------- 
		System.out.println("Exibindo o id do usuário:");
		System.out.println(user.getIdUser());
		
		/**
		 * Alterar id do usuário
		 * @param novo id do usuário
		 */
		user.setIdUser(321);
		
		System.out.println("Exibindo o novo id do usuário:");
		System.out.println(user.getIdUser());
		System.out.println("----------------------------------");


//		------------- Nome do usuário ------------- 
		System.out.println("Exibindo o nome do usuário:");
		System.out.println(user.getName());
		
		/**
		 * Alterar nome do usuário
		 * @param novo nome do usuário
		 */		
		user.setName("Aline Soares");
		
		System.out.println("Exibindo o novo nome do usuário:");
		System.out.println(user.getName());
		System.out.println("----------------------------------");
		
//		------------- Data de nascimento do usuário ------------- 
		System.out.println("Exibindo a data de nascimento do usuário:");
		System.out.println(user.getBirthdate());
		
		/**
		 * Alterar data de nascimento do usuário
		 * @param nova data de nascimento do usuário
		 */
		user.setBirthdate("12/06/2000");
		
		System.out.println("Exibindo a nova data de nascimento nome do usuário:");
		System.out.println(user.getBirthdate());
		System.out.println("----------------------------------");
		
//		------------- Gênero do usuário ------------- 
		System.out.println("Exibindo o gênero do usuário:");
		System.out.println(user.getGenre());
		
		/**
		 * Alterar gênero do usuário
		 * @param novo gênero do usuário
		 */
		user.setGenre("Feminino");
		
		System.out.println("Exibindo o novo gênero do usuário:");
		System.out.println(user.getGenre());
		System.out.println("----------------------------------");
		
//		------------- Altura do usuário ------------- 
		System.out.println("Exibindo a altura do usuário:");
		System.out.println(user.getHeight());
		
		/**
		 * Alterar altura do usuário
		 * @param nova altura do usuário
		 */
		user.setHeight(1.59);
		
		System.out.println("Exibindo a nova altura do usuário:");
		System.out.println(user.getHeight());
		System.out.println("----------------------------------");
		
//		------------- Email do usuário ------------- 
		System.out.println("Exibindo o email do usuário:");
		System.out.println(user.getEmail());
		
		/**
		 * Alterar email do usuário
		 * @param novo email do usuário
		 */
		user.setEmail("alinedmsoares01@gmail.com");
		
		System.out.println("Exibindo o novo email do usuário:");
		System.out.println(user.getEmail());
		System.out.println("----------------------------------");
		
//		------------- Senha do usuário ------------- 
		System.out.println("Exibindo a senha do usuário:");
		System.out.println(user.getPassword());
		
		/**
		 * Alterar senha do usuário
		 * @param nova senha do usuário
		 */
		user.setPassword("Abc123");
		
		System.out.println("Exibindo a nova senha do usuário:");
		System.out.println(user.getPassword());
		System.out.println("----------------------------------");		


		//Teste de login válido
		user.login("alinedmsoares@gmail.com", "123Abc");
		
		//Teste de login inválido
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
	
	System.out.println("Exibindo o novo id do usuário:");
	System.out.println(user.getIdUser());
	System.out.println("----------------------------------");

}
