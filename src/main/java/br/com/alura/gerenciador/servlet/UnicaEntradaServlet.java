package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		String paramAcao = request.getParameter("acao");
//		
//		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
//		String nome;
//		
//		try {
//			Class classe = Class.forName(nomeDaClasse); //carrega a classe com o nome da String
//			Acao acao = (Acao) classe.newInstance();
//			nome = acao.executa(request, response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
//				| IOException e) {
//			throw new ServletException(e);
//		}
//		
//		String[] endereco = nome.split(":");
//		
//		if(endereco[0].equals("forward")) {
//			RequestDispatcher rd =request.getRequestDispatcher("WEB-INF/view/" + endereco[1]);
//			rd.forward(request, response);
//		}else {
//			response.sendRedirect(endereco[1]);
//		}
		
	}

}
