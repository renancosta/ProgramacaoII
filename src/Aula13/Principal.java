package Aula13;

import java.sql.SQLException;

import Aula13.dao.VendedorDao;

public class Principal {
	public static void main(String[] args) throws SQLException {
		System.out.println(VendedorDao.listaVendedores().toString());
	}
}
