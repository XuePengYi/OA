package com.oa.IBiz;

import java.util.List;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IManagerBiz{
	
	public List<Employee_Message> getPersonalInfo(List<Employee_Message> employees); //��ѯ����Ա����Ϣ
	public List<Attendance_Management> getAttenanceInfo(List<Employee_Message> employees); //�鿴���ſ�����Ϣ
	public void submitWorkreportDay(Manager_Workreport_Day ewd); //�ύ�չ����㱨
	public void submitWorkreportMonth(Manager_Workreport_Month ewm); //�ύ�¹����㱨
	public List<Employee_Workreport_Day> checkWorkreportDay_Employee(List<Employee_Message> employees); //�鿴������Ա���Ĺ����㱨
	public List<Manager_Workreport_Day> checkWorkreportDay_Manager(Employee_Message manager); //�鿴���˵��չ����㱨
	public List<Manager_Workreport_Month> checkWorkreportMonth(Employee_Message manager); //�鿴���˵��¹����㱨
	
}
