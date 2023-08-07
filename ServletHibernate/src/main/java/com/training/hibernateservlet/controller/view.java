package com.training.hibernateservlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.hibernateservlet.bean.AadharDetails;
import com.training.hibernateservlet.model.HibernateManager;

@WebServlet("/view")


public class view extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//		long aadhar_id=Integer.parseInt(req.getParameter("aadhar_id"));
		//		
		//		AadharDetails ad=new AadharDetails();
		//		ad.setAadhar_ID(aadhar_id);
		//		HibernateManager hbm= new HibernateManager();
		//		if(hbm.readSpecific(aadhar_id)==true) {
		//			
		//			resp.sendRedirect("/ServletHibernate/Success.html");
		//		}
		//		else {
		//			resp.sendRedirect("/ServletHibernate/Fail.html");
		//			
		//		}
		//	}
		long aadhar_id=Integer.parseInt(req.getParameter("aadhar_id"));

		AadharDetails ad = new AadharDetails();
		HibernateManager hbm = new HibernateManager();



		AadharDetails curAd = hbm.readSpecific(aadhar_id);
		if (curAd == null) {
			// empty - no user
			resp.sendRedirect("Fail.html");
			return;
		}
		// user exists
		HttpSession session = req.getSession();
		session.setAttribute("curUser", curAd);
		resp.sendRedirect("ViewEnrollerDetails.jsp");
		return;






	}




}