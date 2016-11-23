package com.oa.IDao;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;

public interface IUserDao {
	
	public List login(Integer userName,String userPwd); //�û���¼
	public String punchCard_First(Employee_Punchcard_Message epmf); //��(�ϰ�)
	public String punchCard_Last(Employee_Punchcard_Message epml); //��(�°�)
	public List<Employee_Message> getPersonalInfo(Employee_Message user); //��ѯ������Ϣ
	public List<Attendance_Management> getAttenanceInfo(Employee_Message user); //��ѯ���˿�����Ϣ
	public List<Employee_Punchcard_Message> getAllEmployee_Punchcard_Message(Employee_Message user);//��ѯ���˴���Ϣ
}
