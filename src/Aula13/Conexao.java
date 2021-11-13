package Aula13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection criarConexao() throws SQLException {
		Connection conexao;
		
		String url="jdbc:mysql://localhost:3306/sistema_vendas";
		String usuario="root";
		String senha="root";
		
		conexao = DriverManager.getConnection(url, usuario, senha);
		
		return conexao;
		
	}
}
