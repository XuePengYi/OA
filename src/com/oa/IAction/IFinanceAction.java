package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Statements;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IFinanceAction{

	public String submitFinancialWorkreport_All(); //提交全部工作汇报
	public String submitFinancialWorkreport_Unaudited(); //提交未审核的工作汇报
	public String checkFinancialWorkreport_State(); //查看审核状态
	public String opFinancialStatements(); //对财务报表进行操作
	
	
}
