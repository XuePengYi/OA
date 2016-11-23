package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IManagerAction{
	
	public String getPersonalInfo(); //��ѯ����Ա����Ϣ
	public String getAttenanceInfo(); //�鿴���ſ�����Ϣ
	public String submitWorkreportDay(); //�ύ�չ����㱨
	public String submitWorkreportMonth(); //�ύ�¹����㱨
	public String checkWorkreportDay_Employee(); //�鿴������Ա���Ĺ����㱨
	public String checkWorkreportDay_Manager(); //�鿴���˵��չ����㱨
	public String checkWorkreportMonth(); //�鿴���˵��¹����㱨
	
}
