package com.oa.Biz;

import java.util.List;

import com.oa.Dao.ManagerDao;
import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;
import com.oa.IBiz.IManagerBiz;

public class ManagerBiz implements IManagerBiz{

	ManagerDao managerDao;
	
	/**
	 * 查询部门员工信息
	 * @Override
	 */
	public List<Employee_Message> getPersonalInfo(Employee_Message employees) {
		return managerDao.getPersonalInfo(employees);
	}

	/**
	 * 查看部门考勤信息
	 * @Override
	 */
	public List<Attendance_Management> getAttenanceInfo(Employee_Message employees) {
		return managerDao.getAttenanceInfo(employees);
	}

	/**
	 *获得员工的日工作报告
	 */
	public List<Employee_Workreport_Day> getEmployeeWorkportDay(String todayDate,Employee_Message employees){
		return managerDao.getEmployeeWorkportDay(todayDate,employees);
	}
	
	/**
	 * 获得一个日工作报告,查看并审批
	 */
	public Employee_Workreport_Day getOneEmployeeWorkportDay(Employee_Workreport_Day empw){
		return managerDao.getOneEmployeeWorkportDay(empw);
	}
	
	/**
	 * 经理审批员工日工作报告后，修改审批状态以及经理的回复内容
	 */
	public void updateOneEmployeeWorkportDay(Employee_Workreport_Day empw){
		managerDao.updateOneEmployeeWorkportDay(empw);
	}
	
	
	@Override
	public void submitWorkreportDay(Manager_Workreport_Day ewd) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 经理提交月考勤报告
	 */
	@Override
	public void submitWorkreportMonth(Manager_Workreport_Month ewm) {
		managerDao.submitWorkreportMonth(ewm);
	}

	@Override
	public List<Employee_Workreport_Day> checkWorkreportDay_Employee(List<Employee_Message> employees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager_Workreport_Day> checkWorkreportDay_Manager(Employee_Message manager) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 查看自己的月报告
	 * @Override
	 */
	public List<Manager_Workreport_Month> checkWorkreportMonth(Employee_Message manager) {
		return managerDao.checkWorkreportMonth(manager);
	}

	public ManagerDao getManagerDao() {
		return managerDao;
	}

	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}

	
}
