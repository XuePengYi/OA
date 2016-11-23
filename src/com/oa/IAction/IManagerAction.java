package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IManagerAction{
	
	public String getPersonalInfo(); //查询部门员工信息
	public String getAttenanceInfo(); //查看部门考勤信息
	public String submitWorkreportDay(); //提交日工作汇报
	public String submitWorkreportMonth(); //提交月工作汇报
	public String checkWorkreportDay_Employee(); //查看本部门员工的工作汇报
	public String checkWorkreportDay_Manager(); //查看本人的日工作汇报
	public String checkWorkreportMonth(); //查看本人的月工作汇报
	
}
