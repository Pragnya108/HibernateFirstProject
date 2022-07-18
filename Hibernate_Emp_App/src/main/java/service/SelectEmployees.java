package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class SelectEmployees {
public static void main(String[] args) {
		
		Configuration cfgr = new Configuration();
		cfgr.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfgr.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Employee e = (Employee) session.get(Employee.class, 102);
		System.out.println(e.geteId());
		System.out.println(e.geteName());
		System.out.println(e.geteSal());
		
		session.close();
}
}
