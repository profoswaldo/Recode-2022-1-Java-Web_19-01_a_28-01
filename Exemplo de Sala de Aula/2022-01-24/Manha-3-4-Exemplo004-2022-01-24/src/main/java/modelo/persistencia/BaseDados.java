package modelo.persistencia;

import java.util.HashMap;

import modelo.pessoal.Funcionario;

public class BaseDados {
	
	private HashMap<String, Funcionario> dadosFuncionario = null;
	private Funcionario funcionario = null;
	
	
	public BaseDados() {
		dadosFuncionario = new HashMap<String, Funcionario>();
		incluirFuncionarios();
	}
	
	private void incluirFuncionarios() {
		funcionario = new Funcionario();
		funcionario.setMatricula("123");
		funcionario.setNome("Oswaldo");
		funcionario.setSalarioBruto(1000);
		dadosFuncionario.put(funcionario.getMatricula(), funcionario);
		
	}

	public HashMap<String, Funcionario> getDadosFuncionario() {
		return dadosFuncionario;
	}

	
	
	
	
	

}
