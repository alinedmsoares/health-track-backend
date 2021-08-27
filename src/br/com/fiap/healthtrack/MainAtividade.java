package br.com.fiap.healthtrack;

import br.com.fiap.healthtrack.Atividade;

public class MainAtividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atividade ativ = new Active(1, 60 , "27-08-2021", 600, "Forte");
		
//		------------- Id do Tipo de Atividade ------------- 
		System.out.println("Exibindo o id do tipo de atividade:");
		System.out.println(user.getIdType());
		
		/**
		 * Alterar id do tipo de Atividade
		 * @param novo id do tipo de Atividade
		 */
		user.setIdType(1);
		
		System.out.println("Exibindo o novo id do tipo de atividade:");
		System.out.println(user.getIdType());
		System.out.println("----------------------------------");
}
	
//	------------- Dura��o da Atividade ------------- 
	System.out.println("Exibindo a dura��o da atividade:");
	System.out.println(user.getDuration());
	
	/**
	 * Alterar dura��o da Atividade
	 * @param nova dura��o da atividade
	 */		
	user.setDuration(60);
	
	System.out.println("Exibindo a nova dura��o da atividade:");
	System.out.println(user.getDuration());
	System.out.println("----------------------------------");
}

//------------- Data da Atividade ------------- 
System.out.println("Exibindo a data da atividade:");
System.out.println(user.getDate());

/**
 * Alterar data da Atividade
 * @param nova data da atividade
 */		
user.setDate("27/08/21");

System.out.println("Exibindo a nova data da atividade:");
System.out.println(user.getDate());
System.out.println("----------------------------------");
}

//------------- Caloria da Atividade ------------- 
System.out.println("Exibindo o caloria da atividade:");
System.out.println(user.getCalorie());

/**
 * Alterar caloria da Atividade
 * @param nova caloria da atividade
 */
user.setCalorie(600);

System.out.println("Exibindo a nova caloria da atividade:");
System.out.println(user.getCalorie());
System.out.println("----------------------------------");
}

//------------- Sensa��o de Esfor�o da Atividade ------------- 
System.out.println("Exibindo a sensa��o de esfor�o da atividade:");
System.out.println(user.getSenseExertion());

/**
* Alterar a sensa��o de esfor�o da Atividade
* @param nova sensa��o de esfor�o da atividade
*/
user.setSenseExertion("forte");

System.out.println("Exibindo a nova sensa��o de esfor�o da atividade:");
System.out.println(user.getSenseExertion());
System.out.println("----------------------------------");
}
