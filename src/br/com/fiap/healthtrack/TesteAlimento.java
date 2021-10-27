package br.com.fiap.healthtrack;
  
  import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.dao.AlimentoDAO;
  
  public class TesteAlimento {
  
    public static void main(String[] args) {
    	//Instancia o DAO
    	AlimentoDAO dao = new AlimentoDAO();
  
      Alimento food = new Alimento();
      food.setFoodDescription("Carne");
      food.setGramPerPortion(0);
      food.setkcalPerGram(0);
  
      //Cadastra no banco de dados
      dao.create(food);
  
      System.out.println("Cadastrado!");
      
      
      //Lista todos os dados
      List<Alimento> lista = dao.getAll();
      for (Alimento item : lista) {
          System.out.println(item.getFoodId() + " " + item.getFoodDescription() + " " + item.getGramPerPortion() + " " + item.getKcalPerGram());
        }
      
      //Remove um dado através do id
      dao.delete(1);
      
      
      //Atualizando o dado
      Alimento food1 = dao.getById(1);
      
      //Imprime os valores 
      System.out.println(food1.getFoodId() + " " + food1.getFoodDescription() + " " + food1.getGramPerPortion() + " " + food1.getKcalPerGram());
      
      //Altera os valores de alguns atributos
      food1.setGramPerPortion(150);;
      //Atualiza no banco de dados
      dao.update(food1);
    }
    
  }
  

