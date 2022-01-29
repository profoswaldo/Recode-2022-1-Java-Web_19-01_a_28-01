package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAOPessoa {
	
	
	public DAOPessoa() {
		
	}
	
	public void incluir(Pessoa pessoa) {
		
		String url = "jdbc:postgresql://localhost:5432/postgres"; // cuidado: Deve ser a string do seu banco
		String usuario = "postgres";// cuidado: Deve ser o usuário do seu banco
		String senha = "aluno123"; // cuidade: Deve ser a senha do seu banco
		String instrucao_sql = "INSERT INTO pessoa (cpf, nome) VALUES(?, ?)";
		String driver = "org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = 
				conexao.prepareStatement(instrucao_sql);
			
			preparedStatement.setInt(1, pessoa.getCpf());
			preparedStatement.setString(2, pessoa.getNome());
			
			preparedStatement.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Pessoa pessoa) {
		
	}
	
	public void alterar(Pessoa pessoa) {
		
	}
	
	public Pessoa consultar(Pessoa pessoa) {
		return null;
	}

}
