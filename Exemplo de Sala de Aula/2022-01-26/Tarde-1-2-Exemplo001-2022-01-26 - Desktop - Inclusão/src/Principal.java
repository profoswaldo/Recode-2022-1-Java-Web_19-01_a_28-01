import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {
	
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/postgres"; // cuidado: Deve ser a string do seu banco
		String usuario = "postgres";// cuidado: Deve ser o usuário do seu banco
		String senha = "aluno123"; // cuidade: Deve ser a senha do seu banco
		String instrucao_sql = "INSERT INTO pessoa (cpf, nome) VALUES(?, ?)";

		try {

			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = 
					conexao.prepareStatement(instrucao_sql);
			
			preparedStatement.setInt(1, 456);
			preparedStatement.setString(2, "Gisele");
			
			preparedStatement.executeUpdate();
			
			System.out.println("Sucesso");

		} catch (Exception e) {
			System.out.println("Erro");
		}

	}

}
