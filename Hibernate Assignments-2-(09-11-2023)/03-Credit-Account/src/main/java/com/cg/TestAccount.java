package com.cg;

import com.cg.entity.util.CRUDoperations;
import com.cg.entity.util.Jpautil;
import com.cg.entity.Creditaccount;
import com.cg.entity.*;

import jakarta.persistence.EntityManager;
public class TestAccount {

	public static void main(String[] args) {
		EntityManager entityManager=Jpautil.getEntityManagerFactory().createEntityManager();
		//crudOperations.insertEntity();
//		crudOperations.findEntity();
//		crudOperations.updateEntity();
//		crudOperations.deleteEntity();
		entityManager.getTransaction().begin();
		Creditaccount c= new Creditaccount();
		c.setName("Aravind");
		c.setBalance(5678.5f);
		c.setOverduelimit(50000.0f);
		Debitaccount d=new Debitaccount();
		d.setInterest(2678);
		entityManager.persist(c);
		//entityManager.persist(d);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
