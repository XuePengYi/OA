package com.oa.Biz;

import java.io.Serializable;
import java.util.List;

import com.oa.Dao.BossDao;
import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;
import com.oa.IBiz.IBossBiz;

public class BossBiz implements IBossBiz{

	BossDao bossDao;
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
	 * 老板审批财务的月工作报告
	 * @Override
	 */
	public void opFinancialWorkreport_State(Financial_Workreport fw) {
		bossDao.opFinancialWorkreport_State(fw);
		
	}
	/**
	 * 老板获得财务的的月工作报告
	 */
	public List<Financial_Workreport> checkFinancial_Workreport() {
		return bossDao.checkFinancial_Workreport();
	}
	/**
	 * 老板获得财务的一个（月工作报告），查看和审批
	 */
	public Financial_Workreport checkOneFinancial_Workreport(Financial_Workreport mw) {
		return bossDao.checkOneWorkreportMonth_All1(mw);
	}
	
	/**
	 * 老板审批经理的月工作报告
	 * 
	 */
	public void opManagerWorkreport_State(Manager_Workreport_Month mw) {
		bossDao.opManagerWorkreport_State(mw);
	}
	
	
	public List<Manager_Workreport_Day> checkWorkreportDay_Manager_All() {
		return bossDao.checkWorkreportDay_Manager_All();
	}
	
	
	public List<Employee_Workreport_Day> checkWorkreportDay_Employee_All() {
		return null;
	}

	/**
	 * 老板获得经理的月工作报告
	 * @Override
	 */
	public List<Manager_Workreport_Month> checkWorkreportMonth_All() {
		return bossDao.checkWorkreportMonth_All();
	}
	/**
	 * 老板获得经理的一个月工作报告，查看和审批
	 */
	public Manager_Workreport_Month checkOneWorkreportMonth_All(Manager_Workreport_Month mw) {
		return bossDao.checkOneWorkreportMonth_All(mw);
	}
	public BossDao getBossDao() {
		return bossDao;
	}

	public void setBossDao(BossDao bossDao) {
		this.bossDao = bossDao;
	}

}
