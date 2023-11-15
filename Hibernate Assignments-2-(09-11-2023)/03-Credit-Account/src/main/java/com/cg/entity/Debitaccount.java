package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Debit1")
public class Debitaccount extends Account {
	@Column(name="overduelimit")
	private float interest;
	
public Debitaccount() {
	
}

public Debitaccount(float interest) {
	super();
	this.interest = interest;
}

public float getInterest() {
	return interest;
}

public void setInterest(float interest) {
	this.interest = interest;
}

@Override
public String toString() {
	return "Debitaccount [interest=" + interest + ", getInterest()=" + getInterest() + ", getId()=" + getId()
			+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}




}
