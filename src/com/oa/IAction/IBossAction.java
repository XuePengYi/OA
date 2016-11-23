package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Statements;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IBossAction{

	public String getPersonalInfo(); //��ѯ������Ϣ
	public String getAttenanceInfo(); //��ѯ���˿�����Ϣ
	public String opFinancialWorkreport_State(Financial_Workreport fw); //���
	public String checkWorkreportDay_Employee_All(); //�鿴����Ա���Ĺ����㱨
	public String checkWorkreportDay_Manager_All(); //�鿴ȫ��������չ����㱨
	public String checkWorkreportMonth_All(); //�鿴��ȫ��������¹����㱨
	
}
