package com.cg.entity.util;

import com.cg.entity.Account;
import java.util.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
 
public class CRUDoperations {
	public void insertEntity() {
		EntityManager em=Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id=sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter balance");
		float bal=sc.nextFloat();
		Account a=new Account(id,name,bal);
		em.persist(a);
		em.getTransaction().commit();
		em.close();
	}
	
	public void findEntity() {
		EntityManager em=Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		System.out.println("Enter input");
		Scanner sc=new Scanner(System.in);
		Account e1=em.find(Account.class, sc.nextInt());
		System.out.println(e1);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public void updateEntity() {
		EntityManager em=Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		System.out.println("Enter input");
		Scanner sc=new Scanner(System.in);
		int id =sc.nextInt();
		Account e1=em.find(Account.class, id);
		System.out.println("Enter the name to be modified: ");
		String name=sc.next();
		System.out.println("Enter the balnce to be modified: ");
		float balance=sc.nextFloat();
		Account a=new Account(id,name,balance);
		em.persist(a);
		System.out.println(a);
		em.getTransaction().commit();
		em.close();	
	}
	
	public void removeEntity() {
		EntityManager em=Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		System.out.println("Enter input");
		Scanner sc=new Scanner(System.in);
		Account e1=em.find(Account.class, sc.nextInt());
		System.out.println(e1);
		em.remove(e1);
		em.getTransaction().commit();
		em.close();
	}	
	}

