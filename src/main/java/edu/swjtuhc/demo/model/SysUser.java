package edu.swjtuhc.demo.model;

import java.util.Date;

public class SysUser {
	private String username;
	private String userPassword;
	private int userAge;
	private String constellation;
	private String userBlood;
	private String userLocal;
	private String userSchool;
	private Date userBirthday;
	private String userEmail;
	private int userPhone;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	public String getUserBlood() {
		return userBlood;
	}

	public void setUserBlood(String userBlood) {
		this.userBlood = userBlood;
	}

	public String getUserLocal() {
		return userLocal;
	}

	public void setUserLocal(String userLocal) {
		this.userLocal = userLocal;
	}

	public String getUserSchool() {
		return userSchool;
	}

	public void setUserSchool(String userSchool) {
		this.userSchool = userSchool;
	}


	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}

	@Override
	public String toString() {
		return "SysUser [username=" + username + ", userPassword=" + userPassword + ", userAge=" + userAge
				+ ", constellation=" + constellation + ", userBlood=" + userBlood + ", userLocal=" + userLocal
				+ ", userSchool=" + userSchool + ", userBirthday=" + userBirthday + ", userEmail=" + userEmail
				+ ", userPhone=" + userPhone + "]";
	}
}
