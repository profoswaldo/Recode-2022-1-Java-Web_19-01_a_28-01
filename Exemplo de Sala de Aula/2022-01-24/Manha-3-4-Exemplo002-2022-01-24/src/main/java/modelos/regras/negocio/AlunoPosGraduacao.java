package modelos.regras.negocio;

public class AlunoPosGraduacao extends Aluno{

	public double getMedia() {
		return (getTeste() + getProva())/2;
	}
	
}
