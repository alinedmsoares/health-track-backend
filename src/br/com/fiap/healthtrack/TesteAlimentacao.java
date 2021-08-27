package br.com.fiap.healthtrack;

/**
 * Classe para teste das classes Alimentacao e Alimento.
 * @author Marcelo Portella
 * @version 0.1
 */
public class TesteAlimentacao {
	/**
	 * Método main.
	 * @param args .
	 */
	public static void main(String[] args) {
				
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
