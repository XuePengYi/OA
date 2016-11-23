package com.oa.IBiz;

import java.util.List;

import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;

public interface IEmployeeBiz{

	public void submitWorkreportDay(Employee_Workreport_Day ewd); //提交日工作汇报
	public List<Employee_Workreport_Day> checkWorkreportDay(Employee_Message employee); //查看自己的工作汇报
	
}
