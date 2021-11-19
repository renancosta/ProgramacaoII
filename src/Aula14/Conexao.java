package Aula14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection criarConexao() throws SQLException {
		Connection conexao;
		
		String url="jdbc:mysql://db4free.net:3306/topicosavancados";
		String usuario="root_topicos";
		String senha="rootrenan";
		
		conexao = DriverManager.getConnection(url, usuario, senha);
		
		return conexao;
		
	}
}

