package com.cg.ibs.cardmanagement.bean;

import java.math.BigInteger;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Service_Requests")
public class CaseIdBean {

	public CaseIdBean() {

	}
    @Id
    @Column(length=20,name="case_id_number")
	private String caseIdTotal;
    @Column(nullable = false,name="case_timestamp")
    //check again
    //@Temporal(value = TemporalType.TIMESTAMP)
	private LocalDateTime caseTimeStamp;
    @Column(nullable=false,name="status_of_service_request")
	private String statusOfServiceRequest;
    @Column(length=11,name="account_number")
	private BigInteger accountNumber;
    @Column(nullable=false,length=16,name="uci")  
	private BigInteger UCI;
    @Column(nullable=false,name="define_service_request")
	private String defineServiceRequest;
	@Column(length=16,name="card_number")
	private BigInteger cardNumber;
	@Column(nullable=false,length=22,name="customer_reference_id")  
	private String customerReferenceId;
	public String getCaseIdTotal() {
		return caseIdTotal;
	}
	public void setCaseIdTotal(String caseIdTotal) {
		this.caseIdTotal = caseIdTotal;
	}
	public LocalDateTime getCaseTimeStamp() {
		return caseTimeStamp;
	}
	public void setCaseTimeStamp(LocalDateTime caseTimeStamp) {
		this.caseTimeStamp = caseTimeStamp;
	}
	public String getStatusOfServiceRequest() {
		return statusOfServiceRequest;
	}
	public void setStatusOfServiceRequest(String statusOfServiceRequest) {
		this.statusOfServiceRequest = statusOfServiceRequest;
	}
	public BigInteger getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigInteger getUCI() {
		return UCI;
	}
	public void setUCI(BigInteger uCI) {
		this.UCI = uCI;
	}
	public String getDefineServiceRequest() {
		return defineServiceRequest;
	}
	public void setDefineServiceRequest(String defineServiceRequest) {
		this.defineServiceRequest = defineServiceRequest;
	}
	public BigInteger getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(BigInteger cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCustomerReferenceId() {
		return customerReferenceId;
	}
	public void setCustomerReferenceId(String customerReferenceId) {
		this.customerReferenceId = customerReferenceId;
	}
	public CaseIdBean(String caseIdTotal, LocalDateTime caseTimeStamp, String statusOfServiceRequest, BigInteger accountNumber,
			BigInteger uCI, String defineServiceRequest, BigInteger cardNumber, String customerReferenceId) {
		super();
		this.caseIdTotal = caseIdTotal;
		this.caseTimeStamp = caseTimeStamp;
		this.statusOfServiceRequest = statusOfServiceRequest;
		this.accountNumber = accountNumber;
		this.UCI = uCI;
		this.defineServiceRequest = defineServiceRequest;
		this.cardNumber = cardNumber;
		this.customerReferenceId = customerReferenceId;
	}
	@Override
	public String toString() {
		return "CaseIdBean [caseIdTotal=" + caseIdTotal + ", caseTimeStamp=" + caseTimeStamp + ", statusOfServiceRequest="
				+ statusOfServiceRequest + ", accountNumber=" + accountNumber + ", UCI=" + UCI + ", defineServiceRequest=" + defineServiceRequest
				+ ", cardNumber=" + cardNumber + ", customerReferenceId=" + customerReferenceId + "]";
	}



}
