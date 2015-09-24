package com.mausam.hibernate;


import org.hibernate.*;



public class Lab2B {

	public static void main(String[] args) {
		
		
		
		
		SessionFactory sessionFactory =   HibernateUtil.getSessionFactory();
		Session session    =   sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Customer cust = (Customer) session.load(Customer.class, 1);
		System.out.println(cust);
		tx.commit();
		session.close();
//		if(tx!=null)
//		tx.rollback();
		
		
	}

}
