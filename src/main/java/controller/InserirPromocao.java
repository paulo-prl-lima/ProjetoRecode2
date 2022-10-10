package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Promocao;
import model.PromocaoDAO;

@WebServlet("/InserirPromocao")
public class InserirPromocao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PromocaoDAO promocaodao = new PromocaoDAO();
	Promocao promocao = new Promocao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/InserirPromocao")) {
			inserirPromocao(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	private void inserirPromocao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		promocao.setNomePacote(request.getParameter("nomePacote"));
		promocao.setPercentual(Double.parseDouble(request.getParameter("percentual")));
		promocao.setObservacao(request.getParameter("observacao"));
		promocaodao.inserirPromocao(promocao);
		response.sendRedirect("/ProjetoRecode/cad_promocao.html");
	}

}
