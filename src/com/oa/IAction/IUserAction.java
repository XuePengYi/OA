package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;

public interface IUserAction {
	
	public String login(); //�û���¼
	public String punchCard_First(); //��(�ϰ�)
	public String punchCard_Last(); //��(�°�)
	public String getPersonalInfo(); //��ѯ������Ϣ
	public String getAttenanceInfo(); //��ѯ���˿�����Ϣ
	
}
