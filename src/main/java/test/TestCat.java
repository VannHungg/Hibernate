package test;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.CatDAO;
import util.HibernateUtil;
import model.Cat;

public class TestCat {
	public static void main(String[] args) {
		CatDAO catDAO = new CatDAO();
		List<Cat> list = catDAO.selectAll();
		
		for (Cat cat : list) {
			System.out.println(cat);
		}
		
		System.out.println("========");
		Cat c = new Cat();
		c.setId(1);
		System.out.println(catDAO.selectById(c));
		
		System.out.println("========");
		Cat c3 = new Cat("Meow", new Date(2025, 12, 10), new Boolean(true));
		if(catDAO.insert(c3)) {
			System.out.println("insert thành công");
		}
		else {
			System.out.println("insert không thành công");
		}
		c3.setId(5);
		if(catDAO.delete(c3)) {
			System.out.println("insert thành công");
		}
		else {
			System.out.println("insert không thành công");
		}
		
	}
}
