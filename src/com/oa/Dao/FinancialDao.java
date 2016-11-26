package com.oa.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oa.Entity.Employee_Message;
import com.oa.Entity.Financial_Statements;
import com.oa.Entity.Financial_Workreport;
import com.oa.IDao.IFinanceDao;

public class FinancialDao extends BaseDao implements IFinanceDao{
	
	//查看本会计师的所有工作汇报
	public List<Financial_Workreport> show(Employee_Message user){
		Session session=getSession();
		Query query=session.createQuery("from Financial_Workreport fw where fw.accountant.employee_Id=:kuaiji_Id");
		query.setInteger("kuaiji_Id", user.getEmployee_Id());
		List<Financial_Workreport> list=query.list();
		return list;
		
	}
	
	//查看本会计师的已通过审核的
		public List<Financial_Workreport> showGo(Employee_Message user){
			Session session=getSession();
			Query query=session.createQuery("from Financial_Workreport fw where fw.accountant.employee_Id=:kuaiji_Id and fw.state.workreport_State_Id=2");
			query.setInteger("kuaiji_Id", user.getEmployee_Id());
			List<Financial_Workreport> list=query.list();
			return list;
			
		}

	@Override
	public void submitFinancialWorkreport_All(List<Financial_Workreport> fwa) {
		//提交全部工作汇报
		
	}

	@Override
	public void submitFinancialWorkreport_Unaudited(Financial_Workreport fwu) {
		//申请新的的工作汇报
		Session session=getSession();
		System.out.println("daouser="+fwu.getEvent_Id().getFinancial_Workreport_Event_Id());
		Transaction ts=session.beginTransaction();
		session.save(fwu);
		ts.commit();
		
		
	}

	@Override
	public boolean checkFinancialWorkreport_State(Financial_Workreport fw) {
		//查看审核状态
		return false;
	}

	@Override
	public void opFinancialStatements(Financial_Statements fs) {
		//对财务报表进行操作，实际操作（工资，薪资等）
		
	}

}
