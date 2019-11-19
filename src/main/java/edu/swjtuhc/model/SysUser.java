package edu.swjtuhc.model;

public class SysUser {
	private String username;
	private String password;
	private int age;
	private String constellation;
	private String blood;
	private String local;
	private String school;
	private String birthday;
	@Override
	public String toString() {
		return "SysUser [username=" + username + ", password=" + password + ", age=" + age + ", constellation="
				+ constellation + ", blood=" + blood + ", local=" + local + ", school=" + school + ", birthday="
				+ birthday + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
