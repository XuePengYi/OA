package com.oa.IBiz;

import java.util.List;

import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;

public interface IEmployeeBiz{

	public void submitWorkreportDay(Employee_Workreport_Day ewd); //�ύ�չ����㱨
	public List<Employee_Workreport_Day> checkWorkreportDay(Employee_Message employee); //�鿴�Լ��Ĺ����㱨
	
}
