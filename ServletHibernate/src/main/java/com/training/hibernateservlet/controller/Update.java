package com.training.hibernateservlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.hibernateservlet.bean.AadharDetails;
import com.training.hibernateservlet.model.HibernateManager;

@WebServlet("/update")
public class Update extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	long aadhar_id=Integer.parseInt(req.getParameter("aadhar_id"));
	String name=req.getParameter("name");
	
	AadharDetails ad=new AadharDetails();
	ad.setAadhar_ID(aadhar_id);
	ad.setName(name);
	
	HibernateManager hbm= new HibernateManager();
	if(hbm.update(aadhar_id,name)==true) {
		
		resp.sendRedirect("/ServletHibernate/UpdateSuccess.html");
	}
	else {
		resp.sendRedirect("/ServletHibernate/UpdateFailed.html");
		
	}
	//hbm.readAll();
	
	

}
}
