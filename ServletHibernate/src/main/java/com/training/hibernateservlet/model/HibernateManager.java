package com.training.hibernateservlet.model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.training.hibernateservlet.bean.AadharDetails;



public class HibernateManager {

	public Session Session;

	public HibernateManager() {
		Configuration configuration= new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder builder= new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory= configuration.buildSessionFactory(builder.buildServiceRegistry());
		Session=sessionFactory.openSession();
		System.out.println("Connected to pf...");


	}

	public boolean saveObj(AadharDetails ad) {
		Transaction tran=Session.beginTransaction();
		Session.save(ad);

		tran.commit();

		System.out.println("Object saved");
		return true;

	}
	//update

	public boolean update(long Aadhar_ID, String name) {

		Transaction transaction= Session.beginTransaction();
		AadharDetails ad=(AadharDetails)Session.get(AadharDetails.class,Aadhar_ID);
		ad.setName(name);
		Session.update(ad);
		System.out.println("Update Success");
		transaction.commit();
		return true;



	}

	public boolean delete(long Aadhar_ID) {
		Transaction transaction= Session.beginTransaction();
		AadharDetails ad=(AadharDetails)Session.get(AadharDetails.class,Aadhar_ID);

		Session.delete(ad);
		System.out.println("Delete Success");
		transaction.commit();
		return true;


	}

	//	public boolean readAll() {
	//		Transaction tran=Session.beginTransaction();
	//		
	//		Query q=Session.createQuery("From AadharDetails");
	//		List li=q.list();
	//		Iterator itr=li.iterator();
	//		while(itr.hasNext()) {
	//			AadharDetails ad= (AadharDetails)itr.next();
	//			System.out.println(ad.getName());
	//		}
	//		tran.commit();
	//		return true;
	//		
	//	}
	
	public AadharDetails readSpecific(long aadhar_id) {

        Transaction tran=Session.beginTransaction();

        AadharDetails ad=(AadharDetails) Session.get(AadharDetails.class, aadhar_id);

        return ad;

    }
}
