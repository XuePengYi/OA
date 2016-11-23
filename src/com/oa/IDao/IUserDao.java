package com.oa.IDao;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;

public interface IUserDao {
	
	public List login(Integer userName,String userPwd); //用户登录
	public String punchCard_First(Employee_Punchcard_Message epmf); //打卡(上班)
	public String punchCard_Last(Employee_Punchcard_Message epml); //打卡(下班)
	public List<Employee_Message> getPersonalInfo(Employee_Message user); //查询个人信息
	public List<Attendance_Management> getAttenanceInfo(Employee_Message user); //查询个人考勤信息
	public List<Employee_Punchcard_Message> getAllEmployee_Punchcard_Message(Employee_Message user);//查询个人打卡信息
}
