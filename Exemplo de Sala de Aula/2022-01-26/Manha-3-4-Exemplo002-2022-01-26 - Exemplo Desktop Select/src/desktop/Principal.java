package desktop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {

		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String usuario = "postgres"; //verificar o seu usuario do banco
		final String senha = "aluno123"; //verificar a sua senha do banco
		final String driverBanco = "org.postgresql.Driver";
		final String instrucao_select = "SELECT * FROM pessoa";
		
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_select);
			
			

			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				
				System.out.println("ID: " + id + " - NOME: " + nome);
				
			}
			
			System.out.println("Sucesso");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
