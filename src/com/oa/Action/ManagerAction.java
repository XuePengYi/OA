package com.oa.Action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.oa.Biz.ManagerBiz;
import com.oa.Biz.UserBiz;
import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;
import com.oa.Entity.Workreport_State;
import com.oa.IAction.IManagerAction;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ManagerAction extends ActionSupport implements IManagerAction,SessionAware,ModelDriven<Employee_Workreport_Day>{
	ManagerBiz managerBiz;
	UserBiz userBiz;
	Map<String,Object> session;
	Employee_Workreport_Day employee_Workreport_Day=new Employee_Workreport_Day();
	String date;
	Manager_Workreport_Month manager_Workreport_Month;
	/**
	 * ��ѯ����Ա����Ϣ
	 * @Override
	 */
	public String getPersonalInfo() {
		Employee_Message user=(Employee_Message) session.get("loginUser");
		List<Employee_Message> emps=managerBiz.getPersonalInfo(user);
		session.put("managerEmps", emps);
		return SUCCESS;
	}

	/**
	 * �鿴���ſ�����Ϣ
	 * @Override
	 */
	public String getAttenanceInfo() {
		Employee_Message user=(Employee_Message) session.get("loginUser");
		List<Attendance_Management> atms=managerBiz.getAttenanceInfo(user);
		session.put("managerAtms", atms);
		return SUCCESS;
	}

	/**
	 *���Ա�����չ�������
	 */
	public String getEmployeeWorkportDayInfo(){
		Employee_Message user=(Employee_Message) session.get("loginUser");
		String todayDate=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		List<Employee_Workreport_Day> empws=managerBiz.getEmployeeWorkportDay(todayDate, user);
		//System.out.println("managerAction="+empws.size());
		session.put("managerEmpws", empws);
		return SUCCESS;
	}
	/**
	 *���Ա����ĳһ���չ�������
	 */
	public String getEmployeeWorkportSomedayInfo(){
		Employee_Message user=(Employee_Message) session.get("loginUser");
		List<Employee_Workreport_Day> empws=managerBiz.getEmployeeWorkportDay(date, user);
		//System.out.println("managerAction="+empws.size());
		session.put("managerEmpws", empws);
		return SUCCESS;
	}
	
	/**
	 * ���һ���չ�������,�鿴������
	 */
	public String getOneEmployeeWorkportDayInfo(){
		Employee_Workreport_Day e=managerBiz.getOneEmployeeWorkportDay(employee_Workreport_Day);
		session.put("managerOneEmpw", e);
		return SUCCESS;
	}
	
	/**
	 * ��������Ա���չ���������޸�����״̬�Լ�����Ļظ�����
	 */
	public String updateOneEmployeeWorkportDayInfo(){
		Workreport_State state=new Workreport_State(1,"�����");
		Employee_Workreport_Day e=(Employee_Workreport_Day) session.get("managerOneEmpw");
		e.setEmployee_Workreport_Day_Reply(employee_Workreport_Day.getEmployee_Workreport_Day_Reply());
		e.setState(state);
		managerBiz.updateOneEmployeeWorkportDay(e);
		employee_Workreport_Day=new Employee_Workreport_Day();
		return SUCCESS;
	}
	
	@Override
	public String submitWorkreportDay() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * �����ύ�¿��ڱ���
	 */
	@Override
	public String submitWorkreportMonth() {
		Employee_Message user=(Employee_Message) session.get("loginUser");
		Workreport_State state=new Workreport_State(1,"�����");
		//System.out.println(user.getEmployee_Name());
		//System.out.println(manager_Workreport_Month.getManager_Workreport_Month_Content());
		Manager_Workreport_Month m=manager_Workreport_Month;
		m.setManager(user);
		System.out.println(m.getManager().getEmployee_Name());
		m.setState(state);
		managerBiz.submitWorkreportMonth(m);
		return SUCCESS;
	}

	@Override
	public String checkWorkreportDay_Employee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkWorkreportDay_Manager() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * �鿴�Լ����±���
	 * @Override
	 */
	public String checkWorkreportMonth() {
		Employee_Message user=(Employee_Message) session.get("loginUser");
		List<Manager_Workreport_Month> empws=managerBiz.checkWorkreportMonth(user);
		//System.out.println("managerAction="+empws.size());
		session.put("managerwms", empws);
		return SUCCESS;
	}

	public ManagerBiz getManagerBiz() {
		return managerBiz;
	}

	public void setManagerBiz(ManagerBiz managerBiz) {
		this.managerBiz = managerBiz;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}

	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public Employee_Workreport_Day getModel() {
		// TODO Auto-generated method stub
		return employee_Workreport_Day;
	}

	public Employee_Workreport_Day getEmployee_Workreport_Day() {
		return employee_Workreport_Day;
	}

	public void setEmployee_Workreport_Day(Employee_Workreport_Day employee_Workreport_Day) {
		this.employee_Workreport_Day = employee_Workreport_Day;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Manager_Workreport_Month getManager_Workreport_Month() {
		return manager_Workreport_Month;
	}

	public void setManager_Workreport_Month(Manager_Workreport_Month manager_Workreport_Month) {
		this.manager_Workreport_Month = manager_Workreport_Month;
	}

	


	
}
