package com.oa.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.oa.IDao.IBaseDao;

public class BaseDao implements IBaseDao{
	static SessionFactory sessionFactory;
	
	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		BaseDao.sessionFactory = sessionFactory;
	}
	
	
}
