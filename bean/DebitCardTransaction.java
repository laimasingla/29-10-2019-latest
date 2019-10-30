package com.cg.ibs.cardmanagement.bean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class DebitCardTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRANS_ID", nullable = false, length = 10)
	private int transactionId;
	@Column(name = "UCI", nullable = false, length = 16)
	private BigInteger UCI;
	@Column(name = "account_number", nullable = false, length = 11)
	private BigInteger accountNumber;

	@Column(name = "TRANS_DESC", nullable = false, length = 40)
	private String transactionDescription;

	@Column(name = "TRANS_DATE_TIME", nullable = false, length = 20)
	private LocalDateTime transactionDate;

	@Column(name = "AMOUNT", nullable = false, length = 10)
	private BigDecimal transactionAmount;

	@ManyToOne
	@JoinColumn(name = "debit_card_number", insertable = false, updatable = false)
	private DebitCardBean debitBeanObject;

	// private BigDecimal amount;
	@Column(name = "TRANS_TYPE", nullable = false, length = 20)
	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;

	@Column(name = "TRANS_MODE", nullable = false, length = 20)
	@Enumerated(EnumType.STRING)
	private TransactionMode transactionMode;

	// private String description;

	public DebitCardTransaction() {
		super();
	}

	public DebitCardTransaction(int transactionId, BigInteger uCI, BigInteger accountNumber,
			String transactionDescription, LocalDateTime transactionDate, BigDecimal transactionAmount,
			TransactionType transactionType, TransactionMode transactionMode) {
		super();
		this.transactionId = transactionId;
		this.UCI = uCI;
		this.accountNumber = accountNumber;
		this.transactionDescription = transactionDescription;

		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
		this.transactionMode = transactionMode;
	}

	@Override
	public String toString() {
		return "DebitCardTransaction [transactionId=" + transactionId + ", UCI=" + UCI + ", accountNumber="
				+ accountNumber + ", transactionDescription=" + transactionDescription + ", transactionDate="
				+ transactionDate + ", transactionAmount=" + transactionAmount + ", transactionType=" + transactionType
				+ ", transactionMode=" + transactionMode + "]";
	}

	public BigInteger getUCI() {
		return UCI;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public TransactionMode getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(TransactionMode transactionMode) {
		this.transactionMode = transactionMode;
	}

	public void setUCI(BigInteger uCI) {
		this.UCI = uCI;
	}

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

}
