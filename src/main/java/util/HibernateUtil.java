package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println("error: không thể tạo SessionFactory");
			return null;
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSessionfactory().close();
	}
}
