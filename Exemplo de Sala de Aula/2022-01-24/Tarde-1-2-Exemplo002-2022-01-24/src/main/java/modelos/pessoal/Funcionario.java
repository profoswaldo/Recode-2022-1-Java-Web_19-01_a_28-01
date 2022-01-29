package modelos.pessoal;

public abstract class Funcionario extends Pessoa{
	
	public Funcionario() {
		
	}
	
	private String matricula;
	private double salarioBruto;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public abstract double getSalarioLiquido();
	
	

}
