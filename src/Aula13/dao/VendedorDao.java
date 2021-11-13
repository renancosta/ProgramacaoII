package Aula13.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Aula13.Conexao;
import Aula13.model.Vendedor;

public class VendedorDao {
	
	public static List<Vendedor> listaVendedores() throws SQLException{
		Connection conexao;
		ResultSet rs;
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		
		conexao = Conexao.criarConexao();
		
		String sql="select cod_vendedor,nome,salario,faixa_comissao from vendedor";
		
		rs = conexao.prepareStatement(sql).executeQuery();
		
		while(rs.next()) {
			vendedores.add(new Vendedor(rs.getInt("cod_vendedor"),rs.getString("nome"),
					rs.getFloat("salario"),rs.getString("faixa_comissao").charAt(0)));
		}
		
		conexao.close();
		
		return vendedores;
	}
}
