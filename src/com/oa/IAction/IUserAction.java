package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;

public interface IUserAction {
	
	public String login(Integer userName,String userPwd); //�û���¼
	public String punchCard_First(Employee_Punchcard_Message epmf); //��(�ϰ�)
	public String punchCard_Last(Employee_Punchcard_Message epml); //��(�°�)
	public String getPersonalInfo(Employee_Message user); //��ѯ������Ϣ
	public String getAttenanceInfo(Employee_Message user); //��ѯ���˿�����Ϣ
	
}
