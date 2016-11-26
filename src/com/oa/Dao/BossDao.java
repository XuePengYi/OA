package com.oa.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;
import com.oa.Entity.Workreport_State;
import com.oa.IDao.IBossDao;

public class BossDao extends BaseDao implements IBossDao{

	@Override
	public List<Employee_Message> getPersonalInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendance_Management> getAttenanceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 老板审批财务
	 * @Override
	 */
	public void opFinancialWorkreport_State(Financial_Workreport fw) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.update(fw);
		tx.commit();
		session.close();
	}
	/**
	 * 老板获得财务的的月工作报告
	 */
	public List<Financial_Workreport> checkFinancial_Workreport() {
		Session session=getSession();
		String hql="from Financial_Workreport";
		Query query=session.createQuery(hql);
		List<Financial_Workreport> mwms=query.list(); 
		return mwms;
	}
	/**
	 * 老板获得财务的一个（月工作报告），查看和审批
	 */
	public Financial_Workreport checkOneWorkreportMonth_All1(Financial_Workreport mw) {
		Session session=getSession();
		String hql="from Financial_Workreport m where m.financial_Workreport_Id=:id";
		Query query=session.createQuery(hql);
		query.setInteger("id", mw.getFinancial_Workreport_Id());
		Financial_Workreport mwm=(Financial_Workreport) query.list().get(0); 
		return mwm;
	}
	
	
	/**
	 * 老板审批经理的月工作报告
	 * 
	 */
	public void opManagerWorkreport_State(Manager_Workreport_Month mw) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.update(mw);
		tx.commit();
		session.close();
	}
	/**
	 * 老板获得经理的月工作报告
	 */
	public List<Manager_Workreport_Month> checkWorkreportMonth_All() {
		Session session=getSession();
		String hql="from Manager_Workreport_Month";
		Query query=session.createQuery(hql);
		List<Manager_Workreport_Month> mwms=query.list(); 
		return mwms;
	}
	/**
	 * 老板获得经理的一个月工作报告，查看和审批
	 */
	public Manager_Workreport_Month checkOneWorkreportMonth_All(Manager_Workreport_Month mw) {
		Session session=getSession();
		String hql="from Manager_Workreport_Month m where m.manager_Workreport_Month_Id=:id";
		Query query=session.createQuery(hql);
		query.setInteger("id", mw.getManager_Workreport_Month_Id());
		Manager_Workreport_Month mwm=(Manager_Workreport_Month) query.list().get(0); 
		return mwm;
	}
	
	@Override
	public List<Employee_Workreport_Day> checkWorkreportDay_Employee_All() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager_Workreport_Day> checkWorkreportDay_Manager_All() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
