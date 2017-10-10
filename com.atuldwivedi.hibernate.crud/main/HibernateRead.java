package main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.Employee;

public class HibernateRead {

	public static void main(String[] args) {
		
		//Employee emp = new Employee();
		
		Configuration conn=new Configuration().configure("conf/hibernate.cfg.xml");
		
		SessionFactory sf = conn.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Employee emp = (Employee) s.get(Employee.class, 3);
		
		System.out.println("Get complete: " + emp.getSubject());
		
        s.close();
	    
	    sf.close();
	}
	
}