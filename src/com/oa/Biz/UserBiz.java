package com.oa.Biz;

import java.util.List;

import com.oa.Dao.UserDao;
import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;
import com.oa.IBiz.IUserBiz;

public class UserBiz implements IUserBiz{
	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List login(Integer userName, String userPwd) {
		// TODO Auto-generated method stub
		return userDao.login(userName, userPwd);
	}

	@Override
	public String punchCard_First(Employee_Punchcard_Message epmf) {
		// TODO Auto-generated method stub
		return userDao.punchCard_First(epmf);
	}

	@Override
	public String punchCard_Last(Employee_Punchcard_Message epml) {
		// TODO Auto-generated method stub
		return userDao.punchCard_Last(epml);
	}

	@Override
	public List<Employee_Message> getPersonalInfo(Employee_Message user) {
		// TODO Auto-generated method stub
		return userDao.getPersonalInfo(user);
	}
	
	public List<Employee_Punchcard_Message> getOneEmployee_Punchcard_Message(Employee_Message user){
		return userDao.getOneEmployee_Punchcard_Message(user);
	}
	
	@Override
	public List<Attendance_Management> getAttenanceInfo(Employee_Message user) {
		// TODO Auto-generated method stub
		return userDao.getAttenanceInfo(user);
	}

}
