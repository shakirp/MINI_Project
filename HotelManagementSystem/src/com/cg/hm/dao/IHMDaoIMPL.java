package com.cg.hm.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.hm.dto.Users;
import com.cg.hm.exception.HMException;

public class IHMDaoIMPL implements IHMDao {
	static String INSERT_QUERY="INSERT INTO Users VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	static String GENERATE_QUERY="SELECT seq_user_id.NEXTVAL FROM DUAL";
	static String VALIDATE_QUERY="SELECT count(*) FROM users WHERE email=?";
	static String FORGOT_PASSWORD="SELECT count(*) FROM users WHERE email=? AND security_question=? AND security_answer=?"; 
	static String UPDATE_PASSWORD="UPDATE users SET password=? WHERE email=?";
	
	Connection conn;

	@Override
	public int adduserdetails(Users user) throws HMException {
		user.setUser_id(String.valueOf(generateUserId()));
		try {
			PreparedStatement pst = conn.prepareStatement(INSERT_QUERY);
			pst.setString(1, user.getUser_name());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getGender());
			pst.setString(4, "");
			pst.setString(5, user.getEmail());
			pst.setString(6, user.getUser_id());
			pst.setString(7, user.getMobile_no());
			pst.setString(8, user.getPhone());
			pst.setString(9, user.getAddress());
			pst.setString(10,user.getSecurity_question());
			pst.setString(11, user.getSecurity_answer());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	private int generateUserId() throws HMException
	{
		try {
			conn=DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rst=st.executeQuery(GENERATE_QUERY);
			rst.next();
			return rst.getInt(1);
		} catch (SQLException e) {
			throw new HMException("Problem in generating user id"+e.getMessage());
		}
		
	}

	@Override
	public boolean validate_email(String email) throws HMException {
		conn=DBUtil.getConnection();
		
		boolean flag=false;
		try {
			PreparedStatement pst= conn.prepareStatement(VALIDATE_QUERY);
			pst.setString(1, email);
			ResultSet rst=pst.executeQuery();
			rst.next();
			int result=rst.getInt(1);
			if(result>0)
			{
				flag=false;
			}
			else
			{
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}

	@Override
	public int forgotpassword(String email, String sec_ques, String sec_answer)throws HMException {
		int flag=0;
		conn=DBUtil.getConnection();
		try {
			PreparedStatement pst=conn.prepareStatement(FORGOT_PASSWORD);
			pst.setString(1, email);
			pst.setString(2, sec_ques);
			pst.setString(3, sec_answer);
			ResultSet rst=pst.executeQuery();
			rst.next();
			int result=rst.getInt(1);
			if(result>0)
			{
				flag=1;
			}
			else
			{
				flag=0;
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public int update_password(String email, String pwd) throws HMException {
		int rst=0;
		conn=DBUtil.getConnection();
		try {
			PreparedStatement pst=conn.prepareStatement(UPDATE_PASSWORD);
			pst.setString(1, pwd);
			pst.setString(2, email);
			rst=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rst;
	}


}
