package modelo.persistencia;

import java.util.HashMap;

import modelo.pessoal.Funcionario;

public class BaseDados {
	
	private Funcionario funcionario;
	
	private HashMap<String, Funcionario> tabela;
	
	public BaseDados() {
		
		tabela = new HashMap<String, Funcionario>();
		
		funcionario = new Funcionario();
		funcionario.setMatricula("123");
		funcionario.setNome("Oswaldo");
		
		tabela.put(funcionario.getMatricula(), funcionario);
		
		funcionario = new Funcionario();
		funcionario.setMatricula("456");
		funcionario.setNome("Gisele");
		
		tabela.put(funcionario.getMatricula(), funcionario);
		
	}
	
	public HashMap<String, Funcionario> getTabela(){
		return tabela;
	}
	
	
	

}
