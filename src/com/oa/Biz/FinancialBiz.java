package com.oa.Biz;

import java.util.List;

import com.oa.Dao.FinancialDao;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Financial_Workreport;

public class FinancialBiz {
	FinancialDao financialDao;
	
	public void submitFinancialWorkreport_Unaudited(Financial_Workreport fwu) {
		//�����µĵĹ����㱨
		financialDao.submitFinancialWorkreport_Unaudited(fwu);
		
	}
	
	//�鿴�����ʦ����ͨ����˵�
			public List<Financial_Workreport> showGo(Employee_Message user){
				return financialDao.showGo(user);
			}
	
	//�鿴�����ʦ�����й����㱨
		public List<Financial_Workreport> show(Employee_Message user){
			return financialDao.show(user);
		}

	public FinancialDao getFinancialDao() {
		return financialDao;
	}

	public void setFinancialDao(FinancialDao financialDao) {
		this.financialDao = financialDao;
	}
	
	
	
}
