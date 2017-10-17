package com.cg.hm.service;

import java.util.List;

import com.cg.hm.dao.IHMDao;
import com.cg.hm.dao.IHMDaoIMPL;
import com.cg.hm.dto.Users;
import com.cg.hm.exception.HMException;

public class IHMServIMPL implements IHMServ {
	
	IHMDao hdao = new IHMDaoIMPL();

	@Override
	public int adduserdetails(Users user) throws HMException {
		
		return hdao.adduserdetails(user);
	}

	@Override
	public boolean validate_email(String email) throws HMException {
		
		return hdao.validate_email(email);
	}

	@Override
	public int forgotpassword(String email, String sec_ques, String sec_answer)throws HMException {
		
		return hdao.forgotpassword(email,sec_ques,sec_answer);
	}

	@Override
	public int update_password(String email, String pwd) throws HMException {
		return hdao.update_password(email,pwd);
	}

}
