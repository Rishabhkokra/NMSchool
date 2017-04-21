package com.school.nm.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GenerateTables {

	public static void main(String[] args) {
		 //creating seession factory object  
	    SessionFactory factory=new Configuration().configure().buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	 session.beginTransaction();
	    //session.save(emp);//persisting the object
	    
	    
	
	session.getTransaction().commit();
	      
	   
	    session.close();  
	
      //empImpl.listAll();
      //empImpl.listSelected(name);
      System.gc();
      System.out.println("COMPLETED");

	}

}
