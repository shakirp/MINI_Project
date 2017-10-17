package com.cg.hm.service;

import java.util.List;

import com.cg.hm.dto.Users;
import com.cg.hm.exception.HMException;

public interface IHMServ {
	
	int adduserdetails(Users user) throws HMException;
	public boolean validate_email(String email) throws HMException;
	int forgotpassword(String email,String sec_ques,String sec_answer) throws HMException;
	int update_password(String email,String pwd) throws HMException;

}
