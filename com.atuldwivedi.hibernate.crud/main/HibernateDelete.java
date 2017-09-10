package main;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Employee;

public class HibernateDelete {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure("conf/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t=s.beginTransaction();
		
		Employee emp = (Employee) s.get(Employee.class, 1);
		
		s.delete(emp);
		
		t.commit();
		
		//other way of deleting
		
		Transaction t1=s.beginTransaction();
		
		s.createQuery("delete from Employee where id= 4").executeUpdate();
		
		t1.commit();

	}

}
