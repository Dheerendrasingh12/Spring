package com.dheerendra.beans;

public class BankLoanApproval {

	private LoanDeatails detail;

	public BankLoanApproval() {
	System.out.println("BankLoanApproval-0-param constructor");
	}

	public void setDetail(LoanDeatails detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "BankLoanApproval [detail=" + detail + "]";
	}
	
	public String appovedLoan() {
		if(detail.getLoanType().equalsIgnoreCase("Car")) 
			return "Loan Approved "+detail.getCustomer();
		
		else
			return "Loan is Rejected "+detail.getCustomer();
	}
	
}
