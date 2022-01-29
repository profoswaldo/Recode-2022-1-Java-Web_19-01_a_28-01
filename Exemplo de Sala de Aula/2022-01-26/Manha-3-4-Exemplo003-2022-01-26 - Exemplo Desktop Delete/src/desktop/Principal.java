package desktop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {

		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String usuario = "postgres"; //verificar o seu usuario do banco
		final String senha = "aluno123"; //verificar a sua senha do banco
		final String driverBanco = "org.postgresql.Driver";
		final String instrucao_delete = "DELETE FROM pessoa WHERE id = ?";
		
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_delete);
			preparedStatement.setInt(1, 20);

			preparedStatement.executeUpdate();
			
			System.out.println("Sucesso");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
