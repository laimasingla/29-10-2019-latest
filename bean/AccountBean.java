package com.cg.ibs.cardmanagement.bean;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account_bean")



public class AccountBean {
	@Id
	@Column(length = 11,name = "account_number",nullable=false)
	private BigInteger accountNumber;

	
	@OneToMany(mappedBy ="accountBeanObject",cascade = CascadeType.ALL)
	Set<DebitCardBean> debitCard=new HashSet<>();
	
	@ManyToOne @JoinColumn(name="uci")
	private CustomerBean customerBeanObject;
	
	
	
	public CustomerBean getCustomerBeanObject() {
		return customerBeanObject;
	}
	public void setCustomerBeanObject(CustomerBean customerBeanObject) {
		this.customerBeanObject = customerBeanObject;
	}
	public BigInteger getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountBean() {
		super();
	}
	@Override
	public String toString() {
		return "AccountBean [accountNumber=" + accountNumber +  "]";
	}
	public AccountBean(BigInteger accountNumber ){
		super();
		this.accountNumber = accountNumber;
		
	}
	
}