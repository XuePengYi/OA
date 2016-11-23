package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IManagerAction{
	
	public String getPersonalInfo(List<Employee_Message> employees); //查询部门员工信息
	public String getAttenanceInfo(List<Employee_Message> employees); //查看部门考勤信息
	public String submitWorkreportDay(Manager_Workreport_Day ewd); //提交日工作汇报
	public String submitWorkreportMonth(Manager_Workreport_Month ewm); //提交月工作汇报
	public String checkWorkreportDay_Employee(List<Employee_Message> employees); //查看本部门员工的工作汇报
	public String checkWorkreportDay_Manager(Employee_Message manager); //查看本人的日工作汇报
	public String checkWorkreportMonth(Employee_Message manager); //查看本人的月工作汇报
	
}
