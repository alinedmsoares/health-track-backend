package br.com.fiap.healthtrack;
  
  import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.dao.PesoDAO;
  
  public class TestePeso {
  
    public static void main(String[] args) {
    	//Instancia o DAO
    	PesoDAO dao = new PesoDAO();
  
      //Instancia o Colaborador
      Peso weight = new Peso();
      weight.setWeightDate(Calendar.getInstance());
      weight.setWeight(60.9);
  
      //Cadastra no banco de dados
      dao.create(weight);
  
      System.out.println("Cadastrado!");
      
      
      //Lista todos os dados
      List<Peso> lista = dao.getAll();
      for (Peso item : lista) {
          System.out.println(item.getIdWeight() + " " + item.getWeight() + " " + item.getWeightDate().getTime());
        }
      
      //Remove um dado através do id
      dao.delete(3);
      
      
      //Atualizando o dado
      Peso weight1 = dao.getById(1);
      
      //Imprime os valores 
      System.out.println(weight1.getIdWeight() + " "
          + weight1.getWeight() + " "
          + weight1.getWeightDate().getTime());
      
      //Altera os valores de alguns atributos
      weight1.setWeight(61.8);
      //Atualiza no banco de dados
      dao.update(weight1);
    }
    
  }
  

