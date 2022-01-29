package modelos;

public class Funcionario {
	
	private String matricula, nome;
	private double salarioBruto;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getInss() {
		return salarioBruto * 0.11;
	}
	
	public double getSalarioLiquido() {
		return salarioBruto - getInss();
	}
	

}
