package com.mausam.hibernate;
import java.util.*;
import javax.persistence.*;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;


@Entity
@Table(name="customers")
public class Customer {
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name="cid")
	private int cid;          //primary key
	 @Column(name="cname")
	private String cname;
	 @Column(name="email")
	private String email;
	 @Column(name="phone")
	private long phone;
	 @Column(name="city")
	private String city;
	 @Column(name="balance")
	private double balance;
	
	public Customer(){}
	
	public Customer(String cname, String email, long phone, String city, double balance) {

		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city =   city;
		this.balance = balance;
	}
    
	public int getCid() {
		return cid;
	}
      
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", balance=" + balance + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/*public Customer(int cid, String cname, String email, long phone, String city, double balance) {
        this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.balance = balance;
	}*/
	
	
	
}
