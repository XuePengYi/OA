package com.oa.IDao;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Statements;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IBossDao extends IUserDao{

	public List<Employee_Message> getPersonalInfo(); //��ѯ������Ϣ
	public List<Attendance_Management> getAttenanceInfo(); //��ѯ���˿�����Ϣ
	public void opFinancialWorkreport_State(Financial_Workreport fw); //���
	public List<Employee_Workreport_Day> checkWorkreportDay_Employee_All(); //�鿴����Ա���Ĺ����㱨
	public List<Manager_Workreport_Day> checkWorkreportDay_Manager_All(); //�鿴ȫ��������չ����㱨
	public List<Manager_Workreport_Month> checkWorkreportMonth_All(); //�鿴��ȫ��������¹����㱨
	
}
