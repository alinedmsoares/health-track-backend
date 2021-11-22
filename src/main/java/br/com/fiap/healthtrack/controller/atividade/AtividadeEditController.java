package br.com.fiap.healthtrack.controller.atividade;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/atividade/editar")
public class AtividadeEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AtividadeEditController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//2021-06-30T18:30:00
		request.getRequestDispatcher("../atividades/editar.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		long idAtividade = Long.parseLong(request.getParameter("idAtividade"));
		
		
		
	}

}
