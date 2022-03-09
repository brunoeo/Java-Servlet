<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresa</title>
</head>
<body>

		Usuario Logado: ${usuarioLogado.login}
		 
		<c:import url="logout-parcial.jsp" /> 
		

		
		

		<c:if test="${not empty empresa}"> 
	
			Empresa ${empres+a}  cadastrada com sucesso!
	
	</c:if>
	

	Lista de empresas: <br />

	<ul>
		<c:forEach items="${lista}" var="empresa">
		
		<li> 
			${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
			<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}"> editar </a>
			<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}"> remove </a>
			
		
		 </li>
		
		</c:forEach>	
	</ul>
	
	<br>
	
	<a href="/gerenciador/entrada?acao=NovaEmpresaForm"> Nova Empresa </a>
	

</body>
</html>