package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Employee;

public class HibernateCreate {

	public static void main(String[] args) {
		
		Configuration conn = new Configuration().configure("conf/hibernate.cfg.xml");
		
		SessionFactory sf = conn.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction(); 
		
		Employee emp=new Employee();
		
		emp.setId(1);
		emp.setName("abc");
		emp.setSubject("English");
		
		
        Employee emp1=new Employee();
		
		emp1.setId(2);
		emp1.setName("def");
		emp1.setSubject("Hindi");
		
        Employee emp2=new Employee();
		
		emp2.setId(3);
		emp2.setName("ghi");
		emp2.setSubject("Maths");
		
        Employee emp3=new Employee();
		
		emp3.setId(4);
		emp3.setName("jkl");
		emp3.setSubject("Science");
		
        Employee emp4=new Employee();
		
		emp4.setId(5);
		emp4.setName("pqr");
		emp4.setSubject("Social");
		
		
	    s.save(emp);
	    s.save(emp1);
	    s.save(emp2);
	    s.save(emp3);
	    s.save(emp4);
		
	    t.commit();
	    
	    s.close();

	}

}
