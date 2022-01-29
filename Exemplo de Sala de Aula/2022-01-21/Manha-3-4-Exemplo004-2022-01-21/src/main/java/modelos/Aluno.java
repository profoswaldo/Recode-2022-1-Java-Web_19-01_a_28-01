package modelos;

public class Aluno {
	
	private String nome;
	private double teste, prova;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTeste() {
		return teste;
	}
	public void setTeste(double teste) {
		this.teste = teste;
	}
	public double getProva() {
		return prova;
	}
	public void setProva(double prova) {
		this.prova = prova;
	}
	
	public double getMedia() {
		return (teste + prova)/2;
	}
	
}
