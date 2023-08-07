package com.training.hibernateservlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.hibernateservlet.bean.AadharDetails;
import com.training.hibernateservlet.model.HibernateManager;

@WebServlet("/Register")
public class Register extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long aadhar_id=Integer.parseInt(req.getParameter("aadhar_id"));
		String name=req.getParameter("name");
		String father_name=req.getParameter("father_name");
		int age=Integer.parseInt(req.getParameter("age"));
		long phone=Integer.parseInt(req.getParameter("ph_no"));
		
				
		String address=req.getParameter("address");
		String city=req.getParameter("city");

		String state=req.getParameter("state");
		long pin=Integer.parseInt(req.getParameter("pin"));
		String email=req.getParameter("email_id");
		
		
		AadharDetails ad=new AadharDetails();
		ad.setAadhar_ID(aadhar_id);
		ad.setName(father_name);
		ad.setAddress(address);
		ad.setAge(age);
		ad.setCity(city);
		ad.setEmail_ID(email);
		ad.setFather_name(father_name);
		ad.setPhone_no(phone);
		ad.setPin(pin);
		ad.setState(state);
		
		
		HibernateManager hbm= new HibernateManager();
		if(hbm.saveObj(ad)==true) {
			
			resp.sendRedirect("/ServletHibernate/RegisterSuccess.html");
		}
		else {
			resp.sendRedirect("/ServletHibernate/RegisterFailed.html");
			
		}
		//hbm.readAll();
		
		
	}

}
