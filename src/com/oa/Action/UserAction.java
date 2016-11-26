package com.oa.Action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.oa.Biz.UserBiz;
import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;
import com.oa.Entity.Employee_Punchcard_Message_State;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.IAction.IUserAction;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class UserAction extends ActionSupport implements IUserAction,SessionAware{
	UserBiz userBiz;
	Employee_Punchcard_Message epmf=new Employee_Punchcard_Message();
	Employee_Punchcard_Message epml=new Employee_Punchcard_Message();
	Employee_Message user=new Employee_Message();
	Employee_Message manager=new Employee_Message();
	Employee_Workreport_Day ewd=new Employee_Workreport_Day();
	Map<String, Object> session;
	Integer userName;
	String userPwd;
	
	public String getAllEmployee_Workreport_Day(){
		List<Employee_Workreport_Day> ewds=userBiz.getAllEmployee_Workreport_Day(user);
		session.put("Employee_Workreport_Days", ewds);
		return SUCCESS;
	}
	
	public String saveEWD(){
		ewd.setEmployee(user);
		ewd.setManager(manager);
		userBiz.saveEWD(ewd);
		return SUCCESS;
	}
	
	public String updateEmployee_Message(){
		userBiz.updateEmployee_Message(user);
		return SUCCESS;
	}
	
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
		Integer hour=Integer.parseInt(new SimpleDateFormat("HH").format(new Date()));
		Integer min=Integer.parseInt(new SimpleDateFormat("mm").format(new Date()));
		if(hour>9 ){
			epmf.setState(new Employee_Punchcard_Message_State(2, "�ٵ�"));
		}else if(hour==9 && min>30){
			epmf.setState(new Employee_Punchcard_Message_State(2, "�ٵ�"));
		}
		epmf.setEmployee_Punchcard_Message_Firsttime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()).concat(" "+hour+":"+min));
		userBiz.punchCard_First(epmf);
		return SUCCESS;
	}

	@Override
	public String punchCard_Last() {
		epml.setEmployee(user);
		epml.setState(epmf.getState());
		Integer hour=Integer.parseInt(new SimpleDateFormat("HH").format(new Date()));
		Integer min=Integer.parseInt(new SimpleDateFormat("mm").format(new Date()));
		if(hour<19 ){
			if(epmf.getState().getEmployee_Punchcard_Message_State_Id()==1){
				epml.setState(new Employee_Punchcard_Message_State(2, "����"));
			}else{
				epml.setState(new Employee_Punchcard_Message_State(4, "�ٵ�\\����"));
			}			
		}else if(hour==19 && min<30){
			if(epmf.getState().getEmployee_Punchcard_Message_State_Id()==1){
				epml.setState(new Employee_Punchcard_Message_State(2, "����"));
			}else{
				epml.setState(new Employee_Punchcard_Message_State(4, "�ٵ�\\����"));
			}
		}
		epml.setEmployee_Punchcard_Message_Id(epmf.getEmployee_Punchcard_Message_Id());
		epml.setEmployee_Punchcard_Message_Firsttime(epmf.getEmployee_Punchcard_Message_Firsttime());
		epml.setEmployee_Punchcard_Message_Lasttime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()).concat(" "+hour+":"+min));
		userBiz.punchCard_Last(epml);
		return SUCCESS;
	}

	@Override
	public String getPersonalInfo() {
		
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
	
	@Override
	public String getAllEmployee_Punchcard_Message() {
		List<Employee_Punchcard_Message> emps=userBiz.getAllEmployee_Punchcard_Message(user);
		if(emps.size()==0){
			Employee_Punchcard_Message empty=new Employee_Punchcard_Message("û�д���Ϣ", "û�д���Ϣ");
			emps.add(empty);
			session.put("Employee_Punchcard_Messages", emps);
		}else{
			session.put("Employee_Punchcard_Messages", emps);
		}
		return SUCCESS;
	}
	
	public String getManager(){
		List<Employee_Message> managers=userBiz.getManager(user);
		manager=managers.get(0);
		session.put("manager", manager);
		return SUCCESS;
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
	
	public void setManager(Employee_Message manager) {
		this.manager = manager;
	}
	
	public Employee_Workreport_Day getEwd() {
		return ewd;
	}

	public void setEwd(Employee_Workreport_Day ewd) {
		this.ewd = ewd;
	}

	
}
