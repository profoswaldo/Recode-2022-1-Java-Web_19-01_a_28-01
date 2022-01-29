package modelo.persistencia;

import java.util.HashMap;

import modelo.pessoal.Funcionario;

public class DAOFuncionario {
	
	private BaseDados baseDados;
	private HashMap<String, Funcionario> dadosFuncionario;
	
	
	
	public DAOFuncionario() {
		
		baseDados = new BaseDados();
		dadosFuncionario = baseDados.getDadosFuncionario();
		
		
	}
	
	public void incluir(Funcionario funcionario) {
		
	}
	
	public void excluir(Funcionario funcionario) {
		
	}
	
	public void alterar(Funcionario funcionario) {
		
	}
	
	public Funcionario consultar(Funcionario funcionario) {
		return dadosFuncionario.get(funcionario.getMatricula());
	}

}
