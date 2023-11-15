package com.cg;

import com.cg.entity.util.CRUDoperations;
public class TestAccount {

	public static void main(String[] args) {
		CRUDoperations crudOperations = new CRUDoperations();
		//crudOperations.insertEntity();
		crudOperations.findEntity();
		crudOperations.updateEntity();
		crudOperations.deleteEntity();
		
	}

}
