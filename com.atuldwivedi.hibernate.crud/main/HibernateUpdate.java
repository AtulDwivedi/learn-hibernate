package main;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Employee;

public class HibernateUpdate {

	public static void main(String[] args) {
Configuration conn = new Configuration().configure("conf/hibernate.cfg.xml");
		
		SessionFactory sf = conn.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction(); 
		
		Employee emp = (Employee) s.get(Employee.class, 2);
		
		System.out.println(emp.getName());
		
		System.out.println("updating the name of the employee fetched from DB");
		
		emp.setName("xyz");
		
		t.commit();
		
		//other way of update		
		s = sf.openSession();
		
		Transaction t1 = s.beginTransaction(); 
		
		Query query = s.createQuery("update Employee set name = 'def' where id = 3");
		
		int result= query.executeUpdate();
		
		System.out.println(result);
		
		t1.commit();
		
	}

}
