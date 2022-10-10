package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Destino;
import model.DestinoDAO;

@WebServlet("/InserirDestino")
public class InserirDestino extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DestinoDAO destinodao = new DestinoDAO();
	Destino destino = new Destino();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/InserirDestino")) {
			inserirDestino(request, response);
		} else {
			response.sendRedirect("index.html");
		}

	}

	private void inserirDestino(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		destino.setNome(request.getParameter("nome"));
		destino.setDescricao(request.getParameter("descricao"));
		destino.setValor(Double.parseDouble(request.getParameter("valor")));
		destino.setNomeHotel(request.getParameter("nomeHotel"));
		destino.setIdCliente(Integer.parseInt(request.getParameter("idCliente")));
		destino.setIdPromocao(Integer.parseInt(request.getParameter("idPromocao")));
		destino.setQtdDias(Integer.parseInt(request.getParameter("qtdDias")));
		destinodao.inserirDestino(destino);
		response.sendRedirect("/ProjetoRecode/destino.html");

	}
}