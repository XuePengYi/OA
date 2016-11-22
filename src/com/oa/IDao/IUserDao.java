package com.oa.IDao;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;

public interface IUserDao {
	
	public Employee_Message login(Employee_Message user); //�û���¼
	public String punchCard(Employee_Message user); //��
	public List<Employee_Message> getPersonalInfo(Employee_Message user); //��ѯ������Ϣ
	public List<Attendance_Management> getAttenanceInfo(Employee_Message user); //��ѯ���˿�����Ϣ
		
}
