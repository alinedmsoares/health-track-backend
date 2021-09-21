package br.com.fiap.healthtrack;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.dao.PesoDAO;

/**
 * Teste da Classe Peso.
 * @version 0.1
 */
public class Teste {

	public static void main(String[] args) {
		
		System.out.println("\n ATIVIDADE: Create e Read usando Collections e DAO\n");
		
		// Criando os 10 objetos da classe Peso, e usando o DAO para guard�-los em uma Cole��o (ArrayList da classe PesoDAO):
		PesoDAO dao = new PesoDAO();
		for (int i = 0; i < 10; i++) {
            Calendar cal = Calendar.getInstance();
            cal.set(2021,8,1+i);
            Peso obj = new Peso(cal, 89.0d-i);
            dao.create(obj);
        }

		// Retornando a cole��o completa com o DAO (m�todo getAll da classe PesoDAO), e recebendo-a na vari�vel lista:
        List<Peso> lista = dao.getAll();

        // Realizando um la�o for e exibinda o registro completo da informa��o (m�todo toString da classe Peso):
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(" " + lista.get(i).toString());
        }
	
        
        
        
        // Realizando as outras opera��es CRUD:
        
        // Update
        System.out.println("\n B�nus - Update e Delete:\n");
        System.out.println(" Objeto antes do update: " + lista.get(5).toString());
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2021,8,6);
        Peso novo = new Peso(cal2,85.5d);
        dao.update(5,novo);

        // Delete
        System.out.println(" Objeto antes do delete: " + lista.get(8).toString() + "\n");
        dao.delete(8);
        
        // Mostrando
        lista = dao.getAll();
        System.out.println(" Lista atualizada com update e delete: \n");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(" " + lista.get(i).toString());
        }
        
        
	}
}
