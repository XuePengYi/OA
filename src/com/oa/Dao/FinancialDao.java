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
	
	//�鿴�����ʦ�����й����㱨
	public List<Financial_Workreport> show(Employee_Message user){
		Session session=getSession();
		Query query=session.createQuery("from Financial_Workreport fw where fw.accountant.employee_Id=:kuaiji_Id");
		query.setInteger("kuaiji_Id", user.getEmployee_Id());
		List<Financial_Workreport> list=query.list();
		return list;
		
	}
	
	//�鿴�����ʦ����ͨ����˵�
		public List<Financial_Workreport> showGo(Employee_Message user){
			Session session=getSession();
			Query query=session.createQuery("from Financial_Workreport fw where fw.accountant.employee_Id=:kuaiji_Id and fw.state.workreport_State_Id=2");
			query.setInteger("kuaiji_Id", user.getEmployee_Id());
			List<Financial_Workreport> list=query.list();
			return list;
			
		}

	@Override
	public void submitFinancialWorkreport_All(List<Financial_Workreport> fwa) {
		//�ύȫ�������㱨
		
	}

	@Override
	public void submitFinancialWorkreport_Unaudited(Financial_Workreport fwu) {
		//�����µĵĹ����㱨
		Session session=getSession();
		System.out.println("daouser="+fwu.getEvent_Id().getFinancial_Workreport_Event_Id());
		Transaction ts=session.beginTransaction();
		session.save(fwu);
		ts.commit();
		
		
	}

	@Override
	public boolean checkFinancialWorkreport_State(Financial_Workreport fw) {
		//�鿴���״̬
		return false;
	}

	@Override
	public void opFinancialStatements(Financial_Statements fs) {
		//�Բ��񱨱���в�����ʵ�ʲ��������ʣ�н�ʵȣ�
		
	}

}
