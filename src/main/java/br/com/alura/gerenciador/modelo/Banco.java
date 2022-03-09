package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresa = new ArrayList<>();
	private static List<Usuario> listaUsuario = new ArrayList<>();

	private static Integer chaveSequencial=1;
	
	static {
		Empresa empresa = new Empresa("Alura");
		empresa.setId(chaveSequencial++);;
		Empresa empresa1 = new Empresa("Caelum");
		empresa1.setId(chaveSequencial++);;
		listaEmpresa.add(empresa);
		listaEmpresa.add(empresa1);
		
		Usuario u1 = new Usuario("nico", "12345");
		Usuario u2 = new Usuario("ana", "12345");
		
		listaUsuario.add(u1);
		listaUsuario.add(u2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);;
		Banco.listaEmpresa.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.listaEmpresa;
	}

	public void deleteObject(Integer id) {
		
		Iterator<Empresa> it = listaEmpresa.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId() == id) { 
				it.remove();;
			}
		}
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		
		for(Empresa empresa : listaEmpresa) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public void alterarEmpresa(String nomeEmpresa, Date data, Integer id) {
		
		buscaEmpresaPelaId(id).setDataAbertura(data);
		buscaEmpresaPelaId(id).setNome(nomeEmpresa);

	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario u : listaUsuario) {
			if(u.ehIgual(login, senha)==true) {
				return u;
			}
		}
		return null;
	}
	
}
