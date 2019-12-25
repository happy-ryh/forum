package edu.swjtuhc.demo.model;

public class admin {
	private String adminGrade;
	private String adminPassword;
	private String adminAccount;
	@Override
	public String toString() {
		return "admin [adminGrade=" + adminGrade + ", adminPassword=" + adminPassword + ", adminAccount=" + adminAccount
				+ ", getAdminGrade()=" + getAdminGrade() + ", getAdminPassword()=" + getAdminPassword()
				+ ", getAdminAccount()=" + getAdminAccount() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getAdminGrade() {
		return adminGrade;
	}
	public void setAdminGrade(String adminGrade) {
		this.adminGrade = adminGrade;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminAccount() {
		return adminAccount;
	}
	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}
	
}
