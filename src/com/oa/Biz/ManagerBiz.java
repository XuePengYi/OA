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
	 * ��ѯ����Ա����Ϣ
	 * @Override
	 */
	public List<Employee_Message> getPersonalInfo(Employee_Message employees) {
		return managerDao.getPersonalInfo(employees);
	}

	/**
	 * �鿴���ſ�����Ϣ
	 * @Override
	 */
	public List<Attendance_Management> getAttenanceInfo(Employee_Message employees) {
		return managerDao.getAttenanceInfo(employees);
	}

	/**
	 *���Ա�����չ�������
	 */
	public List<Employee_Workreport_Day> getEmployeeWorkportDay(String todayDate,Employee_Message employees){
		return managerDao.getEmployeeWorkportDay(todayDate,employees);
	}
	
	/**
	 * ���һ���չ�������,�鿴������
	 */
	public Employee_Workreport_Day getOneEmployeeWorkportDay(Employee_Workreport_Day empw){
		return managerDao.getOneEmployeeWorkportDay(empw);
	}
	
	/**
	 * ��������Ա���չ���������޸�����״̬�Լ�����Ļظ�����
	 */
	public void updateOneEmployeeWorkportDay(Employee_Workreport_Day empw){
		managerDao.updateOneEmployeeWorkportDay(empw);
	}
	
	
	@Override
	public void submitWorkreportDay(Manager_Workreport_Day ewd) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * �����ύ�¿��ڱ���
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
	 * �鿴�Լ����±���
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
