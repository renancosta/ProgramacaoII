package Aula14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsoBancoDeDadosOnlineUmUsuario {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao;
		ResultSet rs;
		String sql;
		Usuario usuario;
		conexao = Conexao.criarConexao();
		sql="select * from usuario where idusuario=1;";
		rs = conexao.prepareStatement(sql).executeQuery();
		
		while(rs.next()) {
			usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3));
			System.out.println(usuario.toString());
		}
		
		
	}
	
}
