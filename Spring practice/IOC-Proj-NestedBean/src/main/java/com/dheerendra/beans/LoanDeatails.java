package com.dheerendra.beans;

public class LoanDeatails {

	private int loanId;
	private String loanType;
	private String customer;
	public LoanDeatails() {
	System.out.println("LoanDetails -0-param Constructor");
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "LoanDeatails [loanId=" + loanId + ", loanType=" + loanType + ", customer=" + customer + "]";
	}
	
	
}
