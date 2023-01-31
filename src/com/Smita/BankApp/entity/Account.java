package com.Smita.BankApp.entity;

public class Account {
	private int accNo;
	private String name;
	private String add;
	private String panNo;
	private double bal;
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdd() {
		return add;
	}
	
	public void setAdd(String add) {
		this.add = add;
	}
	
	public String getPanNo() {
		return panNo;
	}
	
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	public double getBal() {
		return bal;
	}
	
	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", add=" + add + ", panNo=" + panNo + ", bal=" + bal
				+ "]";
	}
	
	
	
	
}
