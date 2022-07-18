package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Doctor;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		
		Doctor d2 = new Doctor(107,"Shreenika");
		Doctor d = new Doctor(105,"PRASHANT");
		Doctor d1 = new Doctor(106,"Maheshwar");
		session.saveOrUpdate(d);
		session1.saveOrUpdate(d1);
		session2.saveOrUpdate(d2);
//		session.delete(d);
//		Doctor d1 = (Doctor)session.get(Doctor.class, 105);
//		System.out.println(d1);
//		System.out.println(session.load(Doctor.class, 105));
		
		session.evict(d);
		session.beginTransaction().commit();
		session.close();
		session1.beginTransaction().commit();
		session1.close();
		session2.beginTransaction().commit();
		session2.close();
//		Session session1 = sf.openSession();
//		d.setName("Pragnya");
//		session1.merge(d);
//		session1.beginTransaction().commit();
//		session1.close();
	}

}
