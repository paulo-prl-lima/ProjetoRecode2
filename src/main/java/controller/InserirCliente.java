package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import model.ClienteDAO;

@WebServlet("/InserirCliente")
public class InserirCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClienteDAO clientedao = new ClienteDAO();
	Cliente cliente = new Cliente();

	


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/InserirCliente")) {
			inserirCliente(request, response);
		} else {
			response.sendRedirect("index.html");
		}

	}

	private void inserirCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cliente.setNome(request.getParameter("nome"));
		cliente.setEndereco(request.getParameter("endereco"));
		cliente.setTelefone(request.getParameter("telefone"));
		clientedao.inserirCliente(cliente);
		
		response.sendRedirect("/ProjetoRecode/cliente.html");

	}

}
