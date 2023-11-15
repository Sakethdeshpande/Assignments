package com.cg.entity.util;

import com.cg.entity.Account;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
 
public class CRUDoperations {
	public void insertEntity() {
	    EntityManager  entityManager = Jpautil.getEntityManagerFactory().createEntityManager();
	    EntityTransaction entityTransaction = entityManager.getTransaction();
	    entityTransaction.begin();
	    Account empObj = new Account(3,"bjfb",3000.9f);
	    entityManager.persist(empObj);
	    entityManager.getTransaction().commit();
	    entityManager.close();
	}
	public void findEntity() {
		EntityManager entityManager = Jpautil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Account empobj = entityManager.find(Account.class, 1);
		System.out.println(empobj);
		entityManager.getTransaction().commit();
		entityManager.close();

	}
	public void updateEntity() {
		EntityManager entityManager=Jpautil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Account empobj=entityManager.find(Account.class,1);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	public void deleteEntity() {
		EntityManager  entityManager = Jpautil.getEntityManagerFactory().createEntityManager();
	    entityManager.getTransaction().begin();
	    Account empObj = entityManager.find(Account.class, 23);
	    //System.out.println(empObj);
	    entityManager.remove(empObj);
	    entityManager.getTransaction().commit();
	    entityManager.close();
		
		
		
	}


}
