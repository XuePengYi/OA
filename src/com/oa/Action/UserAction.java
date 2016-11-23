package com.oa.Action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.oa.Biz.UserBiz;
import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;
import com.oa.IAction.IUserAction;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements IUserAction,SessionAware{
	UserBiz userBiz;
	Employee_Punchcard_Message epmf;
	Employee_Punchcard_Message epml;
	Employee_Message user=new Employee_Message();
	Map<String, Object> session;
	Integer userName;
	String userPwd;
	@Override
	public String login() {
		List users=userBiz.login(userName, userPwd);
		System.out.println(users.size());
		if(users.size()==1){
			user.setEmployee_Id(userName);
			user=userBiz.getPersonalInfo(user).get(0);
			session.put("loginUser", user);
			return SUCCESS;
		}else{
			return LOGIN;
		}
	}

	@Override
	public String punchCard_First() {
		epmf.setEmployee(user);
		userBiz.punchCard_First(epmf);
		return SUCCESS;
	}

	@Override
	public String punchCard_Last() {
		epml.setEmployee(user);
		List<Employee_Punchcard_Message> epmfl=userBiz.getOneEmployee_Punchcard_Message(user);
		if(epmfl.size()==0){	
			userBiz.punchCard_First(epml);
		}else{
			epmf=epmfl.get(0);
			if(epmf.getEmployee_Punchcard_Message_Lasttime()==null){
			epml.setEmployee_Punchcard_Message_Id(epmf.getEmployee_Punchcard_Message_Id());
			epml.setEmployee_Punchcard_Message_Firsttime(epmf.getEmployee_Punchcard_Message_Firsttime());
			userBiz.punchCard_Last(epml);
			}else{
				userBiz.punchCard_First(epml);
			}
		}
		return SUCCESS;
	}

	@Override
	public String getPersonalInfo() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	@Override
	public String getAttenanceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
	}

	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public Employee_Punchcard_Message getEpmf() {
		return epmf;
	}

	public void setEpmf(Employee_Punchcard_Message epmf) {
		this.epmf = epmf;
	}

	public Employee_Punchcard_Message getEpml() {
		return epml;
	}

	public void setEpml(Employee_Punchcard_Message epml) {
		this.epml = epml;
	}

	public Employee_Message getUser() {
		return user;
	}

	public void setUser(Employee_Message user) {
		this.user = user;
	}

	public Integer getUserName() {
		return userName;
	}

	public void setUserName(Integer userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	
}
