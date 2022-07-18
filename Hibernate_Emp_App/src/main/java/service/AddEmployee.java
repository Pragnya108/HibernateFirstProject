package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class AddEmployee {

	public static void main(String[] args) {
		
		Configuration cfgr = new Configuration();
		cfgr.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfgr.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Employee e = new Employee(102,"Pragnya",25000);
		
		session.save(e);
		session.beginTransaction().commit();
		
		session.close();
		
	}
	
}
