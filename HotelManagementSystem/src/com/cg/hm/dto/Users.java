package com.cg.hm.dto;

import java.sql.Date;

public class Users {
	
	private String user_name; 
	private String password; 
	private String gender;
	private String email;
	private Date dob;
	private String role; 
	private String user_id;
	private String mobile_no; 
	private String phone;
	private String address; 
	private String security_question;
	private String security_answer;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String user_name, String password, String gender,
			String email, Date dob,String role, String user_id, String mobile_no,
			String phone, String address, String security_question,
			String security_answer) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.gender = gender;
		this.email = email;
		this.dob=dob;
		this.role = role;
		this.user_id = user_id;
		this.mobile_no = mobile_no;
		this.phone = phone;
		this.address = address;
		this.security_question = security_question;
		this.security_answer = security_answer;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSecurity_question() {
		return security_question;
	}

	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}

	public String getSecurity_answer() {
		return security_answer;
	}

	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}

	@Override
	public String toString() {
		return "Users [user_name=" + user_name + ", password=" + password
				+ ", gender=" + gender + ", email=" + email + ", dob=" + dob
				+ ", role=" + role + ", user_id=" + user_id + ", mobile_no="
				+ mobile_no + ", phone=" + phone + ", address=" + address
				+ ", security_question=" + security_question
				+ ", security_answer=" + security_answer + "]";
	}

	
	
	

}
