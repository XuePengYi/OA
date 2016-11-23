package com.oa.IBiz;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IManagerBiz{
	
	public List<Employee_Message> getPersonalInfo(List<Employee_Message> employees); //查询部门员工信息
	public List<Attendance_Management> getAttenanceInfo(List<Employee_Message> employees); //查看部门考勤信息
	public void submitWorkreportDay(Manager_Workreport_Day ewd); //提交日工作汇报
	public void submitWorkreportMonth(Manager_Workreport_Month ewm); //提交月工作汇报
	public List<Employee_Workreport_Day> checkWorkreportDay_Employee(List<Employee_Message> employees); //查看本部门员工的工作汇报
	public List<Manager_Workreport_Day> checkWorkreportDay_Manager(Employee_Message manager); //查看本人的日工作汇报
	public List<Manager_Workreport_Month> checkWorkreportMonth(Employee_Message manager); //查看本人的月工作汇报
	
}
