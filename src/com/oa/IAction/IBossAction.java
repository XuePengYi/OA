package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Statements;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IBossAction{

	public String getPersonalInfo(); //查询个人信息
	public String getAttenanceInfo(); //查询个人考勤信息
	public String opFinancialWorkreport_State(Financial_Workreport fw); //审核
	public String checkWorkreportDay_Employee_All(); //查看所有员工的工作汇报
	public String checkWorkreportDay_Manager_All(); //查看全部经理的日工作汇报
	public String checkWorkreportMonth_All(); //查看本全部经理的月工作汇报
	
}
