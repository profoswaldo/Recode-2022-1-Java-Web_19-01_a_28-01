package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import modelo.pessoal.Aluno;

public class DAOAluno {
	
	private final String url = "jdbc:postgresql://localhost:5432/postgres";
	private final String usuario = "postgres"; //verificar o seu usuario do banco
	private final String senha = "aluno123"; //verificar a sua senha do banco
	private final String driverBanco = "org.postgresql.Driver";
	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;

	public DAOAluno() throws Exception {
		Class.forName(driverBanco);
		conexao = DriverManager.getConnection(url, usuario, senha);
	}
	
	public void incluir(Aluno aluno) throws Exception {
		
		final String instrucao_insert = "INSERT INTO alunos (id, matricula, nome, teste, prova) VALUES(?,?,?,?,?)";
		
		try {
			
			
			preparedStatement = conexao.prepareStatement(instrucao_insert);
			preparedStatement.setInt(1, aluno.getId());
			preparedStatement.setString(2, aluno.getMatricula());
			preparedStatement.setString(3, aluno.getNome());
			preparedStatement.setDouble(4, aluno.getTeste());
			preparedStatement.setDouble(5, aluno.getProva());
			
			preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void excluir(Aluno aluno) {
		
	}
	
	
	public void alterar(Aluno aluno) {
		
	}
	
	public Aluno consultar(Aluno aluno) {
		return null;
	}

}
