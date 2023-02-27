package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("");
		
		System.out.println("=== TEST 2: seller findByDeparment ===");
		Department deparment = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(deparment);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("");
		
		System.out.println("=== TEST 3: seller findByAll ===");
		list = sellerDao.findAll(); // como estou reaproveitando a variavel da lista, não preciso declarar novamente
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
