package br.com.fiap.healthtrack;
  
  import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.dao.PressaoArterialDAO;
  
  public class TestePressao {
  
    public static void main(String[] args) {
    	//Instancia o DAO
    	PressaoArterialDAO dao = new PressaoArterialDAO();
  
      Pressao pressure = new Pressao();
      pressure.setSystolicPressure(100);
      pressure.setDiastolicPressure(80);
      pressure.setDtMeasurement(Calendar.getInstance());
      double systolicPressure = pressure.getSystolicPressure();
      double diastolicPressure = pressure.getDiastolicPressure();
      String situation = pressure.calculatePressureSituation(systolicPressure, diastolicPressure);
      pressure.setPressureSituation(situation);

      //Cadastra no banco de dados
      dao.create(pressure);
  
      System.out.println("Cadastrado!");
      
      
      //Lista todos os dados
      List<Pressao> lista = dao.getAll();
      for (Pressao item : lista) {
          System.out.println(item.getIdPressure() + " " + item.getSystolicPressure() + " " + item.getDiastolicPressure() + " " + item.getDtMeasurement().getTime() + " " + item.getPressureSituation());
        }
      
    }
    
  }
  

