package com.cg.ibs.cardmanagement.bean;

import java.math.BigInteger;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "debit_Card")
@NamedQuery(name="verifyDebitCardNumber",query="Select d from DebitCardBean d where d.cardNumber=?1")
public class DebitCardBean {
	@Id
	@Column(name = "debit_card_number", length = 20, nullable = false)
	private BigInteger cardNumber;
	@Column(name = "debit_Card_Status", nullable = false, length = 7)
	private String cardStatus;
	@Column(name = "name_On_Debit_Card", length = 20)
	private String nameOnCard;
	@Column(name = "debit_Cvv_Num", nullable = false, length = 3)
	private String cvvNum;
	@Column(name = "debit_Pin", nullable = false, length = 4)
	private String currentPin;
	@Column(name = "card_Type", nullable = false, length = 8)
	private String cardType;
	@Column(name = "date_of_expiry", nullable = false)
	private LocalDate dateOfExpiry;

	@ManyToOne
	@JoinColumn(name = "account_number", insertable = false, updatable = false)
	private AccountBean accountBeanObject;

	@OneToMany(mappedBy="debitBeanObject")

	Set<DebitCardTransaction> debitTransaction = new HashSet<>();

	public DebitCardBean() {
		super();

	}

	public DebitCardBean(BigInteger cardNumber, String cardStatus, String nameOnCard, String cvvNum, String currentPin,
			String cardType, LocalDate dateOfExpiry, Set<DebitCardTransaction> debitTransaction) {
		super();
		this.cardNumber = cardNumber;
		this.cardStatus = cardStatus;
		this.nameOnCard = nameOnCard;
		this.cvvNum = cvvNum;
		this.currentPin = currentPin;
		this.cardType = cardType;
		this.dateOfExpiry = dateOfExpiry;

		this.debitTransaction = debitTransaction;
	}

	public BigInteger getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(BigInteger cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCvvNum() {
		return cvvNum;
	}

	public void setCvvNum(String cvvNum) {
		this.cvvNum = cvvNum;
	}

	public String getCurrentPin() {
		return currentPin;
	}

	public void setCurrentPin(String currentPin) {
		this.currentPin = currentPin;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public AccountBean getAccountBeanObject() {
		return accountBeanObject;
	}

	public void setAccountBeanObject(AccountBean accountBeanObject) {
		this.accountBeanObject = accountBeanObject;
	}

	public Set<DebitCardTransaction> getDebitTransaction() {
		return debitTransaction;
	}

	public void setDebitTransaction(Set<DebitCardTransaction> debitTransaction) {
		this.debitTransaction = debitTransaction;
	}

	

	@Override
	public String toString() {
		return "DebitCardBean [cardNumber=" + cardNumber + ", cardStatus=" + cardStatus + ", nameOnCard=" + nameOnCard
				+ ", cvvNum=" + cvvNum + ", currentPin=" + currentPin + ", cardType=" + cardType + ", dateOfExpiry="
				+ dateOfExpiry + ", accountNumber=" + 
				 ", debitTransaction=" + debitTransaction + "]";
	}

}