package com.training.hibernateservlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.hibernateservlet.bean.AadharDetails;
import com.training.hibernateservlet.model.HibernateManager;

@WebServlet("/delete")
public class Deletion extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	long aadhar_id=Integer.parseInt(req.getParameter("aadhar_id"));
	AadharDetails ad=new AadharDetails();
	ad.setAadhar_ID(aadhar_id);
	
	
	HibernateManager hbm= new HibernateManager();
	if(hbm.delete(aadhar_id)==true) {
		
		resp.sendRedirect("/ServletHibernate/DeleteSuccess.html");
	}
	else {
		resp.sendRedirect("/ServletHibernate/DeleteFailed.html");
		
	}
	//hbm.readAll();
}
}
