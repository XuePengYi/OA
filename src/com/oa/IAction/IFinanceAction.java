package com.oa.IAction;

import java.util.List;

import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Statements;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IFinanceAction{

	public String submitFinancialWorkreport_All(); //�ύȫ�������㱨
	public String submitFinancialWorkreport_Unaudited(); //�ύδ��˵Ĺ����㱨
	public String checkFinancialWorkreport_State(); //�鿴���״̬
	public String opFinancialStatements(); //�Բ��񱨱���в���
	
	
}
