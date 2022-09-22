package com.sopra.project;

public class Bank {
	
	private int bankId;
	private String bankName;
	private String accountNo;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Bank(int bankId, String bankName, String accountNo) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.accountNo = accountNo;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", accountNo=" + accountNo + "]";
	}
	

}
