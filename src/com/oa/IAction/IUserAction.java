package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;

public interface IUserAction {
	
	public String login(); //用户登录
	public String punchCard_First(); //打卡(上班)
	public String punchCard_Last(); //打卡(下班)
	public String getPersonalInfo(); //查询个人信息
	public String getAttenanceInfo(); //查询个人考勤信息
	
}
