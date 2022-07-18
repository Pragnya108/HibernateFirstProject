package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Employee e = new Employee(101,"Prashant",50000);
		session.update(e);
		session.beginTransaction().commit();
		session.close();

	}

}
