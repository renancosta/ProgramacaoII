package Aula14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsoBancoDeDadosOnlineUsuarios {
	public static void main(String[] args) throws SQLException {
		Connection conexao;
		ResultSet rs;
		String sql;
		List<Usuario> usuarios = new ArrayList<Usuario>();
		conexao = Conexao.criarConexao();
		sql="select * from usuario;";
		rs = conexao.prepareStatement(sql).executeQuery();
		
		while(rs.next()) {
			usuarios.add(new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3)));	
		}
		
		System.out.println(usuarios.toString());
	}
}
