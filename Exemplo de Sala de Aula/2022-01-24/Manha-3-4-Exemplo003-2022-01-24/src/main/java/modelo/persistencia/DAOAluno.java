package modelo.persistencia;

import java.util.HashMap;

import modelo.negocio.Aluno;

public class DAOAluno {
	
	
	Banco banco;
	HashMap<String, Aluno> tabelaAluno;
	
	public DAOAluno() {
		banco = new Banco();
		tabelaAluno = banco.getTabela();
		
	}
	
	
	public void incluir(Aluno aluno) {
		
	}
	
	public void excluir(Aluno aluno) {
		
	}
	
	public void alterar(Aluno aluno) {
		
	}
	
	public Aluno consultar(Aluno aluno) {
		return tabelaAluno.get(aluno.getMatricula());
	}

}
