package com.oa.IBiz;

import java.util.List;

import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Workreport_Day;
import com.oa.Entity.Financial_Statements;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Day;
import com.oa.Entity.Manager_Workreport_Month;

public interface IFinanceBiz{

	public void submitFinancialWorkreport_All(List<Financial_Workreport> fwa); //�ύȫ�������㱨
	public void submitFinancialWorkreport_Unaudited(Financial_Workreport fwu); //�ύδ��˵Ĺ����㱨
	public boolean checkFinancialWorkreport_State(Financial_Workreport fw); //�鿴���״̬
	public void opFinancialStatements(Financial_Statements fs); //�Բ��񱨱���в���
	
	
}
