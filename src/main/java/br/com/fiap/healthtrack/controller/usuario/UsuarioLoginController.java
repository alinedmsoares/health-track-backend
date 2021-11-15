package br.com.fiap.healthtrack.controller.usuario;

//import br.com.fiap.healthtrack.model.dao.UsuarioDAO;
import br.com.fiap.healthtrack.model.beans.Usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class UsuarioLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UsuarioLoginController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//String email = request.getParameter("email");
			//String senha = request.getParameter("senha");
			//UsuarioDAO dao = new UsuarioDAO();
			//Usuario usuario = dao.login(email, senha);
			Usuario usuario = new Usuario();
			usuario.setIdUsuario(1);
			if (usuario.getIdUsuario() == 0) {
				response.sendRedirect("esqueci-minha-senha.html");
			} else {
				//request.setAttribute("idUsuario", usuario.getIdUsuario());
				//request.setAttribute("nomeUsuario", usuario.getNomeUsuario());
				//request.setAttribute("dataNascimento", usuario.getDataNascimento());
				//request.setAttribute("genero", usuario.getGenero());
				//request.setAttribute("altura", usuario.getAltura());
				response.sendRedirect("dashboard");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
