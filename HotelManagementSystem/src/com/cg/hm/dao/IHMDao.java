package com.cg.hm.dao;

import java.util.List;

import com.cg.hm.dto.Users;
import com.cg.hm.exception.HMException;

public interface IHMDao {
	
	int adduserdetails(Users user) throws HMException;
	public boolean validate_email(String email) throws HMException;
	int forgotpassword(String email,String sec_ques,String sec_answer) throws HMException;
	int update_password(String email,String pwd) throws HMException;

}
