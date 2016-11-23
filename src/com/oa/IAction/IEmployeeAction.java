package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;

public interface IEmployeeAction{

	public String submitWorkreportDay(); //提交日工作汇报
	public String checkWorkreportDay(); //查看自己的工作汇报
	
}
