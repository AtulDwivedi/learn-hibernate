package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Student;
import pojo.Subject;

public class Hibernate_ManytoOne {

	public static void main(String[] args) {
		
		
        Configuration conn = new Configuration().configure("conf/hibernate_config.cfg.xml");
		
		SessionFactory sf = conn.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction(); 
		
		Subject sub = new Subject();
		
		sub.setSubId(1);
		sub.setSubName("Maths");
		
		Student std1 = new Student();
		
		std1.setStdId(1);
		std1.setStdName("test");
		std1.setStdAge("15");
		std1.setSubject(1);

		Student std2 = new Student();
		
		std2.setStdId(2);
		std2.setStdName("test1");
		std2.setStdAge("16");
		std2.setSubject(1);
		
		s.save(std1);
		s.save(std2);
		
		t.commit();

        s.close();
	    
	    sf.close();
		

	}

}
