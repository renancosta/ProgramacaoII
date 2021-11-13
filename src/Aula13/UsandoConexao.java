package Aula13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsandoConexao {

	public static void main(String[] args) throws SQLException {
		Connection conexao;
		PreparedStatement ps;
		ResultSet rs;
		int cont = 0;
		
		conexao = Conexao.criarConexao();
		
		String sql="select nome,cnpj from cliente";
		
		ps = conexao.prepareStatement(sql);
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("nome"));
			System.out.println(rs.getString("cnpj"));
			cont++;
		}
		System.out.println(cont);
		
		conexao.close();
	}

}
