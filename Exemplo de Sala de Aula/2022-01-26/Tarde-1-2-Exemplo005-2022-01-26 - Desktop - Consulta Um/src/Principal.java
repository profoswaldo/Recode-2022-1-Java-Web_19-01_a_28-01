import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {
	
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/postgres"; // cuidado: Deve ser a string do seu banco
		String usuario = "postgres";// cuidado: Deve ser o usuário do seu banco
		String senha = "aluno123"; // cuidade: Deve ser a senha do seu banco
		String instrucao_sql = "SELECT * FROM pessoa WHERE CPF = ?";

		try {

			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = 
					conexao.prepareStatement(instrucao_sql);
			
			preparedStatement.setInt(1, 123);
			
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				int cpf = resultSet.getInt("cpf");
				String nome = resultSet.getString("nome");
				
				System.out.println("CPF: " + cpf + " - NOME: " + nome);
			}
			
			
			System.out.println("Sucesso");

		} catch (Exception e) {
			System.out.println("Erro");
		}

	}

}
