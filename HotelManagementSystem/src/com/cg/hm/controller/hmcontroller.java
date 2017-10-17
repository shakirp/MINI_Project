package com.cg.hm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.hm.dto.Users;
import com.cg.hm.exception.HMException;
import com.cg.hm.service.IHMServ;
import com.cg.hm.service.IHMServIMPL;

@WebServlet(urlPatterns={"/register","/newpassword","/updatepwd"})
public class hmcontroller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess= request.getSession();
		IHMServ hserv = new IHMServIMPL();
		String target="";
		String message="";
		
		String url=request.getServletPath();
		switch(url)
		{
		case "/register":
			String username=request.getParameter("uname");
			String password=request.getParameter("password");
			String gender=request.getParameter("gender");
			String email=request.getParameter("email");
			String dob=request.getParameter("dob");
			String mnum=request.getParameter("mnum");
			String phone=request.getParameter("phone");
			String address=request.getParameter("address");
			String question=request.getParameter("ques");
			String answer=request.getParameter("answer");
			try {
				boolean result=hserv.validate_email(email);
				if(result==false)
				{
					message="Registration failed. Email Id already exists";
					target="Register.jsp";
					request.setAttribute("reg_failed", message);
					
				}
				else
				{
					Users user = new Users();
					user.setUser_name(username);
					user.setPassword(password);
					user.setGender(gender);
					user.setEmail(email);
					user.setDob(java.sql.Date.valueOf(dob));
					user.setMobile_no(mnum);
					user.setPhone(phone);
					user.setAddress(address);
					user.setSecurity_question(question);
					user.setSecurity_answer(answer);
					sess.setAttribute("user", user);
					try {
						
						hserv.adduserdetails(user);
					} catch (HMException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			} catch (HMException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case "/newpassword":
			email=request.getParameter("email");
			question=request.getParameter("ques");
			answer=request.getParameter("answer");
			try {
				int result1=hserv.forgotpassword(email, question, answer);
				if(result1==1)
				{
					request.setAttribute("email", email);
					target="updatepassword.jsp";
				}
			} catch (HMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		case "/updatepwd" :
			System.out.println("reached updatepwd");
			String email1=request.getParameter("email");
			String password1=request.getParameter("password");
			System.out.println(email1+password1);
			try {
				int a=hserv.update_password(email1, password1);
				if(a==1)
				{
					response.sendRedirect("success.jsp");
				}
			} catch (HMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		}
		
		RequestDispatcher disp = request.getRequestDispatcher(target);
		disp.forward(request, response);
		
	}

}
