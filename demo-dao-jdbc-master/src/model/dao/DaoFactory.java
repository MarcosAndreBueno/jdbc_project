package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	//esse método retorna o tipo da interface, mas quem chamá-lo terá a implementação da interface (upcasting)
	//essa é uma maneira de injetar dependência sem expôr a implementação do método (SellerDaoJDBC)
	//e permitir que a classe que chamou este método trabalhe com um objeto mais genérico (SellerDao)
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
