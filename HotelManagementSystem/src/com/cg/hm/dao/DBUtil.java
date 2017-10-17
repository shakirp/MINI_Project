package com.cg.hm.dao;
	

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.cg.hm.exception.HMException;



	public class DBUtil {
		
		private static Connection conn;
		public static Connection getConnection() throws HMException
		{	
			if(conn==null)
			{
			try {
				
				InitialContext ic=new InitialContext();
				DataSource ds=(DataSource)ic.lookup("java:/jdbc/OracleDS");
				conn=ds.getConnection();
		
			}catch(SQLException e)
			{
				throw new HMException ("problem in obtaining connection.."+e.getMessage());
				
			}catch(NamingException e)
			{
				throw new HMException("DataSource not found..");
			}
		}	
		return conn;
		}

	}


