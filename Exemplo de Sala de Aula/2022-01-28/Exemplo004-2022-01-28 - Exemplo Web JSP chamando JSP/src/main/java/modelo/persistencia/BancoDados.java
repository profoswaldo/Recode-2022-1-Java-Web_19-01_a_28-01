package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BancoDados {
	
	private final String url = "jdbc:postgresql://localhost:5432/postgres";
	private final String usuario = "postgres"; //verificar o seu usuario do banco
	private final String senha = "aluno123"; //verificar a sua senha do banco
	private final String driverBanco = "org.postgresql.Driver";
	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;

	public BancoDados() throws Exception {
		Class.forName(driverBanco);
		conexao = DriverManager.getConnection(url, usuario, senha);
	
	}
	
	public Connection getConexao() {
		return conexao;
	}
}
