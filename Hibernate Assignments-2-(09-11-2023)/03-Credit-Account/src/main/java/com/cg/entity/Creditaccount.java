package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="interest")

public class Creditaccount extends Account {
	@Column(name="interest")
	private double overduelimit;
	public Creditaccount() {
		
	}
	public Creditaccount(double overduelimit) {
		super();
		this.overduelimit = overduelimit;
	}
	
	public double getOverduelimit() {
		return overduelimit;
	}
	public void setOverduelimit(double overduelimit) {
		this.overduelimit = overduelimit;
	}
	@Override
	public String toString() {
		return "Creditaccount [overduelimit=" + overduelimit + ", getOverduelimit()=" + getOverduelimit() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getBalance()=" + getBalance() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
