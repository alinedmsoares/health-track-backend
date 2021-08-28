package br.com.fiap.healthtrack;

/**
 * Teste das Classes Usu�rio, Atividade e Alimenta��o
 * @version 0.1
 */

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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");

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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");		
		System.out.println(" ");

		//Teste de login v�lido
		user.login("alinedmsoares@gmail.com", "123Abc");

		//Teste de login inv�lido
		user.login("alinedmsoares@gmail.com", "321Abc");
		
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
		//------------------Atividade------------------------

		Atividade ativ = new Atividade(1, "Corrida", 60, "27/08/2021", 600, "Forte");

		//		------------- Id Atividade ------------- 
		System.out.println("Exibindo o id atividade:");
		System.out.println(ativ.getIdActivity());

		/**
		 * Alterar Id Atividade
		 * @param novo Id Atividade
		 */
		ativ.setIdActivity(2);

		System.out.println("Exibindo o novo id atividade:");
		System.out.println(ativ.getIdActivity());
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
		//	------------- Tipo de Atividade ------------- 
		System.out.println("Exibindo o tipo de atividade:");
		System.out.println(ativ.getActivityType());

		/**
		 * Alterar Tipo de Atividade
		 * @param novo Tipo de Atividade
		 */
		ativ.setActivityType("Muscula��o");

		System.out.println("Exibindo o novo tipo de atividade:");
		System.out.println(ativ.getActivityType());
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
		//------------- Dura��o da Atividade ------------- 
		System.out.println("Exibindo a dura��o da atividade:");
		System.out.println(ativ.getDuration());

		/**
		 * Alterar dura��o da Atividade
		 * @param nova dura��o da atividade
		 */		
		ativ.setDuration(90);

		System.out.println("Exibindo a nova dura��o da atividade:");
		System.out.println(ativ.getDuration());
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
		//------------- Data da Atividade ------------- 
		System.out.println("Exibindo a data da atividade:");
		System.out.println(ativ.getDate());

		/**
		 * Alterar data da Atividade
		 * @param nova data da atividade
		 */		
		ativ.setDate("29/08/21");

		System.out.println("Exibindo a nova data da atividade:");
		System.out.println(ativ.getDate());
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
		//------------- Caloria da Atividade ------------- 
		System.out.println("Exibindo a quantidade de calorias gastas com a atividade:");
		System.out.println(ativ.getCalorie());

		/**
		 * Alterar caloria da Atividade
		 * @param nova caloria da atividade
		 */
		ativ.setCalorie(500);

		System.out.println("Exibindo a quantidade de calorias gastas com a atividade:");
		System.out.println(ativ.getCalorie());
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		//------------- Sensa��o de Esfor�o da Atividade ------------- 
		System.out.println("Exibindo a sensa��o de esfor�o da atividade:");
		System.out.println(ativ.getSenseExertion());

		/**
		 * Alterar a sensa��o de esfor�o da Atividade
		 * @param nova sensa��o de esfor�o da atividade
		 */
		ativ.setSenseExertion("Cansado");

		System.out.println("Exibindo a nova sensa��o de esfor�o da atividade:");
		System.out.println(ativ.getSenseExertion());		

		//------------------ Alimenta��o ------------------------


		// Testando os construtores da classe Alimentacao.java

		Alimentacao padrao = new Alimentacao();
		Alimentacao completo = new Alimentacao("2021-08-27", 'B', (float)500.5);
		Alimentacao descricao = new Alimentacao("2021-07-10", 'D', (float)150.1, "Lanche da tarde, comi uma ma��.");


		// Testando Getters & Setters da classe Alimentacao.java

		// Objeto 1:
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		System.out.println("Testando o construtor padr�o, getters e setters da classe Alimentacao: ");
		System.out.println(" ");

		padrao.setMealDate("2020-12-25");
		System.out.println(String.format("Data da alimenta��o: %s", padrao.getMealDate()));

		padrao.setMealType('A');
		System.out.println(String.format("C�d. da alimenta��o: %s", padrao.getMealType()));

		padrao.setMealKcal((float)90.5);
		System.out.println(String.format("Total de kcal: %s", padrao.getMealKcal()));

		padrao.setMealNotes("Caf� da manh�, comi uma torrada com manteiga.");
		System.out.println(String.format("Obs. da alimenta��o: %s", padrao.getMealNotes()));

		// Objeto 2:
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		System.out.println("Testando o primeiro construtor com par�metros da classe Alimentacao: ");
		System.out.println(" ");
		System.out.println(String.format("Data da alimenta��o: %s", completo.getMealDate()));
		System.out.println(String.format("C�d. da alimenta��o: %s", completo.getMealType()));
		System.out.println(String.format("Total de kcal: %s", completo.getMealKcal()));
		System.out.println(String.format("Obs. da alimenta��o: %s", completo.getMealNotes()));

		// Objeto 3:
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		System.out.println("Testando o segundo construtor com par�metros da classe Alimentacao: ");
		System.out.println(" ");
		System.out.println(String.format("Data da alimenta��o: %s", descricao.getMealDate()));
		System.out.println(String.format("C�d. da alimenta��o: %s", descricao.getMealType()));
		System.out.println(String.format("Total de kcal: %s", descricao.getMealKcal()));
		System.out.println(String.format("Obs. da alimenta��o: %s", descricao.getMealNotes()));


		// Testando o construtor padr�o, getters e setters da classe Alimento.java

		Alimento padrao2 = new Alimento();

		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		System.out.println("Testando o construtor padr�o, getters e setters da classe Alimento: ");
		System.out.println(" ");

		padrao2.setFoodId(1234);
		System.out.println(String.format("ID do alimento: %s", padrao2.getFoodId()));

		padrao2.setFoodDescription("Ovo Cozido Grande");
		System.out.println(String.format("Descri��o do alimento: %s", padrao2.getFoodDescription()));

		padrao2.setGramPerPortion((float)50.1);
		System.out.println(String.format("Peso (g) por por��o: %s", padrao2.getGramPerPortion()));

		padrao2.setKcalPerGram((float)77.9);
		System.out.println(String.format("kcal por peso (g): %s", padrao2.getKcalPerGram()));
	
	}
}
