package com.oa.IDao;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;

public interface IUserDao {
	
	public Employee_Message login(Employee_Message user); //用户登录
	public String punchCard(Employee_Message user); //打卡
	public List<Employee_Message> getPersonalInfo(Employee_Message user); //查询个人信息
	public List<Attendance_Management> getAttenanceInfo(Employee_Message user); //查询个人考勤信息
		
}
