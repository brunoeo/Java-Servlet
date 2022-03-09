package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;


//@WebServlet("/alteraEmpresa")
public class AlteraEmpresa implements Acao{


	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nomeEmpresa = request.getParameter("nome");
		String parametroData = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Altera Empresa" + id);

		
		Date data = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(parametroData);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		banco.alterarEmpresa(nomeEmpresa, data, id);
		
		return "redirect:entrada?acao=ListaEmpresas";
		
	}

}
