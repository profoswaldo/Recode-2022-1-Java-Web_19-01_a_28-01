import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {
	
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/postgres"; // cuidado: Deve ser a string do seu banco
		String usuario = "postgres";// cuidado: Deve ser o usu�rio do seu banco
		String senha = "aluno123"; // cuidade: Deve ser a senha do seu banco
		String instrucao_sql = "UPDATE pessoa SET nome=? WHERE CPF=?";

		try {

			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = 
					conexao.prepareStatement(instrucao_sql);
			
			preparedStatement.setInt(2, 123);
			preparedStatement.setString(1, "Ricardo");
			
			preparedStatement.executeUpdate();
			
			System.out.println("Sucesso");

		} catch (Exception e) {
			System.out.println("Erro");
		}

	}

}
