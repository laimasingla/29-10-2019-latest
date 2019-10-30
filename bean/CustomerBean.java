package com.cg.ibs.cardmanagement.bean;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="customer_bean")
public class CustomerBean {

	@Id
	@Column(name="uci",length = 16)
	private BigInteger UCI;
	@Column(name="first_name",length = 15,nullable = false)
	private String firstName;
	@Column(name="last_name",length = 15,nullable = false)
	private String lastName;

	@OneToMany(mappedBy="customerBeanObject")
	Set<AccountBean> AccountBean = new HashSet<>();
	@OneToMany(mappedBy="customerBeanObject")
	Set<CreditCardBean> creditCard=new HashSet<>();
	
	
	public CustomerBean() {
		super();
	}

	public CustomerBean(BigInteger UCI,  String firstName, String lastName) {
		super();

		this.UCI = UCI;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}



	public BigInteger getUCI() {
		return UCI;
	}

	public void setUCI(BigInteger UCI) {
		this.UCI = UCI;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	@Override
	public String toString() {
		return "CustomerBean [ UCI=" + UCI + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

}
