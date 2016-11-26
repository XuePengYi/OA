package com.oa.Biz;

import java.util.List;

import com.oa.Dao.FinancialDao;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Financial_Workreport;

public class FinancialBiz {
	FinancialDao financialDao;
	
	public void submitFinancialWorkreport_Unaudited(Financial_Workreport fwu) {
		//申请新的的工作汇报
		financialDao.submitFinancialWorkreport_Unaudited(fwu);
		
	}
	
	//查看本会计师的已通过审核的
			public List<Financial_Workreport> showGo(Employee_Message user){
				return financialDao.showGo(user);
			}
	
	//查看本会计师的所有工作汇报
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
