package com.cg.ibs.cardmanagement.bean;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="credit_card_transaction")
public class CreditCardTransaction {
	@Id
	@Column(name = "transaction_id")
	private BigInteger transactionId;
	@Column(name="uci",length = 16,nullable = false)
	private BigInteger UCI;
	
	@Column(name="date_of_trans",nullable = false)
	//@Temporal(value = TemporalType.DATE)
	private LocalDateTime dateOfTran;
	@Column(name="amount_of_trans",nullable = false)
	private BigDecimal amount;
	@Column(name="description",nullable = false)
	private String description;
	
	@ManyToOne @JoinColumn(name="credit_card_number", insertable = false, updatable = false)
	private CreditCardBean creditBeanObject;
	

	@Override
	public String toString() {
		return "CreditCardTransaction [transactionid=" + transactionId + ", UCI=" + UCI  + ", date=" + dateOfTran + ", amount=" + amount + ", description=" + description + "]";
	}

	public  CreditCardTransaction(BigInteger transactionId, BigInteger uCI, BigInteger creditCardNumber, LocalDateTime date,
			BigDecimal amount, String description) {
		
		this.transactionId = transactionId;
		this.UCI = uCI;
		
		this.dateOfTran = date;
		this.amount = amount;
		this.description = description;
	}
	
	public CreditCardTransaction() {
	super();
	}

	public BigInteger getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(BigInteger transactionId) {
		this.transactionId = transactionId;
	}
	public BigInteger getUCI() {
		return UCI;
	}
	public void setUCI(BigInteger UCI) {
		this.UCI = UCI;
	}
	
	public LocalDateTime getDateOfTran() {
		return dateOfTran;
	}
	public void setDateOfTran(LocalDateTime dateOfTrans) {
		this.dateOfTran = dateOfTrans;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
   
}
