package br.com.fiap.healthtrack.controller.dashboard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class DashboardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DashboardController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Dados
		String nomeUsuario = "Aline";
		byte idade = 19;
		String hoje = "15/11/2021";
		float altura = 1.58f;
		request.setAttribute("nomeUsuario", nomeUsuario);
		request.setAttribute("idade", idade);
		request.setAttribute("hoje", hoje);
		request.setAttribute("altura", altura);
		
		// IMC
		float imc = 15.0f;
		String imcStatus = "IMC Normal";
		request.setAttribute("imc", imc);
		request.setAttribute("imcStatus", imcStatus);
		
		// Pressao
		byte sistolica = 12;
		byte diastolica = 8;
		String pressaoStatus = "Pressão Normal";
		request.setAttribute("sistolica", sistolica);
		request.setAttribute("diastolica", diastolica);
		request.setAttribute("pressaoStatus", pressaoStatus);
		
		request.getRequestDispatcher("dashboard/dashboard.jsp").forward(request, response);
	}


}
