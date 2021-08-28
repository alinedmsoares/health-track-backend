package br.com.fiap.healthtrack;

/**
 * Teste das Classes Usuário, Atividade e Alimentação
 * @version 0.1
 */

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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");

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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
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
		System.out.println(" ");
		System.out.println("#######################################################################");		
		System.out.println(" ");

		//Teste de login válido
		user.login("alinedmsoares@gmail.com", "123Abc");

		//Teste de login inválido
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
		ativ.setActivityType("Musculação");

		System.out.println("Exibindo o novo tipo de atividade:");
		System.out.println(ativ.getActivityType());
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		
		//------------- Duração da Atividade ------------- 
		System.out.println("Exibindo a duração da atividade:");
		System.out.println(ativ.getDuration());

		/**
		 * Alterar duração da Atividade
		 * @param nova duração da atividade
		 */		
		ativ.setDuration(90);

		System.out.println("Exibindo a nova duração da atividade:");
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
		//------------- Sensação de Esforço da Atividade ------------- 
		System.out.println("Exibindo a sensação de esforço da atividade:");
		System.out.println(ativ.getSenseExertion());

		/**
		 * Alterar a sensação de esforço da Atividade
		 * @param nova sensação de esforço da atividade
		 */
		ativ.setSenseExertion("Cansado");

		System.out.println("Exibindo a nova sensação de esforço da atividade:");
		System.out.println(ativ.getSenseExertion());		

		//------------------ Alimentação ------------------------


		// Testando os construtores da classe Alimentacao.java

		Alimentacao padrao = new Alimentacao();
		Alimentacao completo = new Alimentacao("2021-08-27", 'B', (float)500.5);
		Alimentacao descricao = new Alimentacao("2021-07-10", 'D', (float)150.1, "Lanche da tarde, comi uma maçã.");


		// Testando Getters & Setters da classe Alimentacao.java

		// Objeto 1:
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		System.out.println("Testando o construtor padrão, getters e setters da classe Alimentacao: ");
		System.out.println(" ");

		padrao.setMealDate("2020-12-25");
		System.out.println(String.format("Data da alimentação: %s", padrao.getMealDate()));

		padrao.setMealType('A');
		System.out.println(String.format("Cód. da alimentação: %s", padrao.getMealType()));

		padrao.setMealKcal((float)90.5);
		System.out.println(String.format("Total de kcal: %s", padrao.getMealKcal()));

		padrao.setMealNotes("Café da manhã, comi uma torrada com manteiga.");
		System.out.println(String.format("Obs. da alimentação: %s", padrao.getMealNotes()));

		// Objeto 2:
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		System.out.println("Testando o primeiro construtor com parâmetros da classe Alimentacao: ");
		System.out.println(" ");
		System.out.println(String.format("Data da alimentação: %s", completo.getMealDate()));
		System.out.println(String.format("Cód. da alimentação: %s", completo.getMealType()));
		System.out.println(String.format("Total de kcal: %s", completo.getMealKcal()));
		System.out.println(String.format("Obs. da alimentação: %s", completo.getMealNotes()));

		// Objeto 3:
		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		System.out.println("Testando o segundo construtor com parâmetros da classe Alimentacao: ");
		System.out.println(" ");
		System.out.println(String.format("Data da alimentação: %s", descricao.getMealDate()));
		System.out.println(String.format("Cód. da alimentação: %s", descricao.getMealType()));
		System.out.println(String.format("Total de kcal: %s", descricao.getMealKcal()));
		System.out.println(String.format("Obs. da alimentação: %s", descricao.getMealNotes()));


		// Testando o construtor padrão, getters e setters da classe Alimento.java

		Alimento padrao2 = new Alimento();

		System.out.println(" ");
		System.out.println("#######################################################################");
		System.out.println(" ");
		System.out.println("Testando o construtor padrão, getters e setters da classe Alimento: ");
		System.out.println(" ");

		padrao2.setFoodId(1234);
		System.out.println(String.format("ID do alimento: %s", padrao2.getFoodId()));

		padrao2.setFoodDescription("Ovo Cozido Grande");
		System.out.println(String.format("Descrição do alimento: %s", padrao2.getFoodDescription()));

		padrao2.setGramPerPortion((float)50.1);
		System.out.println(String.format("Peso (g) por porção: %s", padrao2.getGramPerPortion()));

		padrao2.setKcalPerGram((float)77.9);
		System.out.println(String.format("kcal por peso (g): %s", padrao2.getKcalPerGram()));
	
	}
}
