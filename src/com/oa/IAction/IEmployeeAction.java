package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;

public interface IEmployeeAction{

	public String submitWorkreportDay(Employee_Workreport_Day ewd); //�ύ�չ����㱨
	public String checkWorkreportDay(Employee_Message employee); //�鿴�Լ��Ĺ����㱨
	
}
