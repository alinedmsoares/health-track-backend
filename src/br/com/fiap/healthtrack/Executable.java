package br.com.fiap.healthtrack;

/**
 * Teste das Classes Pessoa, Profissional, Atividade e Alimentação
 * @version 0.1
 */

public class Executable {

	public static void main(String[] args) {
		
		//Pessoa

		Pessoa pessoa = new Pessoa (123, "Aline", "12/06/2002", "Feminino", "aline@gmail.com", "1234Abc");

		pessoa.showData();
		
		//--Teste Login Válido--
		pessoa.login("aline@gmail.com", "123Abc");
		//--Teste Login Inválido--
		pessoa.login("aline@gmail.com", "124Abc");
		
		//Profissional
		Profissional profissional = new Profissional (123, "Roberto", "16/09/1990", "Masculino", "roberto@gmail.com", "1234Abc", 123, "Nutricionista", "2 anos de experiência");
		profissional.showData();
		
		//Atividade

		Atividade ativ = new Atividade(1, "Corrida", 60, "27/08/2021", 600, "Forte");

		ativ.showData();

		//Alimentação

		Alimentacao padrao = new Alimentacao();
		Alimentacao completo = new Alimentacao("2021-08-27", 'B', (float)500.5);
		Alimentacao descricao = new Alimentacao("2021-07-10", 'D', (float)150.1, "Lanche da tarde, comi uma maçã.");


		// Testando Getters & Setters da classe Alimentacao.java

		// Objeto 1:
		padrao.setMealDate("2020-12-25");
		padrao.setMealType('A');
		padrao.setMealKcal((float)90.5);
		padrao.setMealNotes("Café da manhã, comi uma torrada com manteiga.");
		padrao.showData();

		// Objeto 2:
		completo.showData();
		
		//Objeto 3: 
		descricao.showData();


		//Alimento

		Alimento padrao2 = new Alimento();
		
		padrao2.setFoodId(1234);
		padrao2.setFoodDescription("Ovo Cozido Grande");
		padrao2.setGramPerPortion((float)50.1);
		padrao2.setKcalPerGram((float)77.9);
				
		padrao2.showData();
	
	}
}
