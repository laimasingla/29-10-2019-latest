package com.cg.ibs.cardmanagement.bean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Credit_Card")
public class CreditCardBean {

	@Id
	@Column(nullable = false, length = 16, name = "credit_card_number")
	private BigInteger cardNumber;

	@Column(nullable = false, length = 3, name = "credit_score")
	private int creditScore;
	@Column(nullable = false, name = "credit_limit")
	private BigDecimal creditLimit;
	@Column(nullable = false, name = "customer_income")
	private double income;
	@Column(name = "credit_card_Status", nullable = false)
	@Enumerated(EnumType.STRING)
	private CreditCardStatus cardStatus;
	@Column(name = "name_On_Credit_Card", nullable = false)
	private String nameOnCard;
	@Column(name = "Credit_Cvv", nullable = false, length = 3)
	private String cvvNum;
	@Column(name = "Credit_Pin", nullable = false, length = 4)
	private String currentPin;
	@Column(name = "Credit_Card_Type", nullable = false)
	private String cardType;
	@Column(name = "Credit_Expiry_Date", nullable = false)
	private LocalDate dateOfExpiry;
	@Column(name = "Remarks")
	private String adminRemarks;

	@ManyToOne
	@JoinColumn(name = "uci")
	private CustomerBean customerBeanObject;

	@OneToMany(mappedBy = "creditBeanObject")
	Set<CreditCardTransaction> creditTransaction = new HashSet<>();

	public CreditCardBean() {
		super();

	}

	public BigInteger getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(BigInteger cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CreditCardStatus getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(CreditCardStatus cardStatus) {
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

	public CustomerBean getCustBeanObject() {
		return customerBeanObject;
	}

	public void setCustBeanObject(CustomerBean custBeanObject) {
		this.customerBeanObject = custBeanObject;
	}

	public Set<CreditCardTransaction> getCreditTransaction() {
		return creditTransaction;
	}

	public void setCreditTransaction(Set<CreditCardTransaction> creditTransaction) {
		this.creditTransaction = creditTransaction;
	}

	public CreditCardBean(BigInteger cardNumber, int creditScore, BigDecimal creditLimit, double income,
			CreditCardStatus cardStatus, String nameOnCard, String cvvNum, String currentPin, String cardType,
			LocalDate dateOfExpiry, CustomerBean custBeanObject, Set<CreditCardTransaction> creditTransaction) {
		super();
		this.cardNumber = cardNumber;

		this.creditScore = creditScore;
		this.creditLimit = creditLimit;
		this.income = income;
		this.cardStatus = cardStatus;
		this.nameOnCard = nameOnCard;
		this.cvvNum = cvvNum;
		this.currentPin = currentPin;
		this.cardType = cardType;
		this.dateOfExpiry = dateOfExpiry;
		this.customerBeanObject = custBeanObject;
		this.creditTransaction = creditTransaction;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "CreditCardBean [cardNumber=" + cardNumber + ", creditScore=" + creditScore + ", creditLimit="
				+ creditLimit + ", income=" + income + ", cardStatus=" + cardStatus + ", nameOnCard=" + nameOnCard
				+ ", cvvNum=" + cvvNum + ", currentPin=" + currentPin + ", cardType=" + cardType + ", dateOfExpiry="
				+ dateOfExpiry + ", custBeanObject=" + customerBeanObject + ", creditTransaction=" + creditTransaction
				+ "]";
	}

}
