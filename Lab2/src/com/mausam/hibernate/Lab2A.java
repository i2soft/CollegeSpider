package com.mausam.hibernate;

import org.hibernate.*;

public class Lab2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction tx = null;
		
		try{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx= session.beginTransaction();
			
	Customer cust = new Customer("ram","ram@gmail",9989988,"Blore",23000.0);
	System.out.println("Before session.Save()");
	session.save(cust);
	System.out.println("After session.Save()");
	tx.commit();
	System.out.println("After tx.commit()");
	session.close();
	System.out.println("Record Inserted");
	
		}catch(Exception e){
			
			e.printStackTrace();
			if(tx!=null)
			tx.rollback();				
		}			
	}}
