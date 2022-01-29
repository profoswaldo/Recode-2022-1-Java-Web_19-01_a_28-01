package modelos.pessoal;

public class FuncionarioCNPJ extends Funcionario{
	
	public double getAjudaCusto() {
		return getSalarioBruto() * 0.05;
	}
	
	public double getSalarioLiquido() {
		return getSalarioBruto() + getAjudaCusto();
	}

}
