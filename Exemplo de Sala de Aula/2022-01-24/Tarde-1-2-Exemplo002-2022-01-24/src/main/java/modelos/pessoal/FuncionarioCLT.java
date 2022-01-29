package modelos.pessoal;

public class FuncionarioCLT extends Funcionario{
	
	public double getInss() {
		return getSalarioBruto() * 0.11;
	}
	public double getSalarioLiquido() {
		return getSalarioBruto() - getInss();
	}

}
