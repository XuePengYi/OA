package com.oa.IDao;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Statements;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IBossDao extends IUserDao{

	public List<Employee_Message> getPersonalInfo(); //查询个人信息
	public List<Attendance_Management> getAttenanceInfo(); //查询个人考勤信息
	public void opFinancialWorkreport_State(Financial_Workreport fw); //审核
	public List<Employee_Workreport_Day> checkWorkreportDay_Employee_All(); //查看所有员工的工作汇报
	public List<Manager_Workreport_Day> checkWorkreportDay_Manager_All(); //查看全部经理的日工作汇报
	public List<Manager_Workreport_Month> checkWorkreportMonth_All(); //查看本全部经理的月工作汇报
	
}
