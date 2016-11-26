package com.oa.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;
import com.oa.IDao.IManagerDao;

public class ManagerDao extends BaseDao implements  IManagerDao{

	/**
	 * 查询部门员工信息
	 * @Override
	 */
	public List<Employee_Message> getPersonalInfo(Employee_Message employees) {
		Session session=getSession();
		String hql="from Employee_Message e where e.employee_Sector.employee_Sector_Id=:sector_id";
		Query query=session.createQuery(hql);
		query.setInteger("sector_id", employees.getEmployee_Sector().getEmployee_Sector_Id());
		List<Employee_Message> emls=query.list();
		return emls;
	}

	/**
	 * 查看部门考勤信息
	 * @Override
	 */
	public List<Attendance_Management> getAttenanceInfo(Employee_Message employees) {
		Session session=getSession();
		String hql="from Attendance_Management a where a.employee.employee_Sector.employee_Sector_Id=:sector_id";
		Query query=session.createQuery(hql);
		query.setInteger("sector_id", employees.getEmployee_Sector().getEmployee_Sector_Id());
		List<Attendance_Management> atms=query.list();
		return atms;
	}

	/**
	 *获得当天该部门员工的日工作报告
	 */
	public List<Employee_Workreport_Day> getEmployeeWorkportDay(String todayDate,Employee_Message employees){
		Session session=getSession();
		//System.out.println(todayDate);
		//System.out.println(employees.getEmployee_Sector().getEmployee_Sector_Id());
		String hql="from Employee_Workreport_Day e where e.employee_Workreport_Day_Date=:date and e.employee.employee_Sector.employee_Sector_Id=:id";
		Query query=session.createQuery(hql);
		query.setString("date", todayDate);
		query.setInteger("id", employees.getEmployee_Sector().getEmployee_Sector_Id());
		List<Employee_Workreport_Day> empw=query.list();
		//System.out.println(empw.size());
		return empw;
	}
	
	/**
	 * 获得一个日工作报告,用于查看并审批
	 */
	public Employee_Workreport_Day getOneEmployeeWorkportDay(Employee_Workreport_Day empw){
		Session session=getSession();
		String hql="from Employee_Workreport_Day e where e.employee_Workreport_Day_Id=:id";
		Query query=session.createQuery(hql);
		query.setInteger("id", empw.getEmployee_Workreport_Day_Id());
		empw=(Employee_Workreport_Day) query.list().get(0);
		return empw;
	}
	
	/**
	 * 经理审批员工日工作报告后，修改审批状态以及经理的回复内容
	 */
	public void updateOneEmployeeWorkportDay(Employee_Workreport_Day empw){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.update(empw);
		tx.commit();
		
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
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		System.out.println("111"+ewm.getManager().getEmployee_Name());
		session.save(ewm);
		tx.commit();
		session.close();
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
		Session session=getSession();
		String hql="from Manager_Workreport_Month m where m.manager.employee_Sector.employee_Sector_Id=:id";
		Query query=session.createQuery(hql);
		query.setInteger("id", manager.getEmployee_Sector().getEmployee_Sector_Id());
		List<Manager_Workreport_Month> empw=query.list();
		System.out.println(empw.size());
		return empw;
	}

}
