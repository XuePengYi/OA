package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IManagerAction{
	
	public String getPersonalInfo(List<Employee_Message> employees); //��ѯ����Ա����Ϣ
	public String getAttenanceInfo(List<Employee_Message> employees); //�鿴���ſ�����Ϣ
	public String submitWorkreportDay(Manager_Workreport_Day ewd); //�ύ�չ����㱨
	public String submitWorkreportMonth(Manager_Workreport_Month ewm); //�ύ�¹����㱨
	public String checkWorkreportDay_Employee(List<Employee_Message> employees); //�鿴������Ա���Ĺ����㱨
	public String checkWorkreportDay_Manager(Employee_Message manager); //�鿴���˵��չ����㱨
	public String checkWorkreportMonth(Employee_Message manager); //�鿴���˵��¹����㱨
	
}
