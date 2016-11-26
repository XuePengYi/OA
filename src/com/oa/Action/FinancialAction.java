package com.oa.Action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.oa.Biz.FinancialBiz;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Financial_Workreport;
import com.oa.IAction.IFinanceAction;
import com.opensymphony.xwork2.ActionSupport;

public class FinancialAction extends ActionSupport implements IFinanceAction ,SessionAware{
	FinancialBiz financialBiz;
	Financial_Workreport fw;
	Map<String, Object> session;
	
	public Map<String, Object> getSession() {
		return session;
	}
	
	//查看本会计师的所有审批通过工作汇报
			public String showGo(){
				Employee_Message user=(Employee_Message) session.get("loginUser");
				List<Financial_Workreport> fwsgo=financialBiz.showGo(user);
				session.put("fwsgo", fwsgo);
				return SUCCESS;
			}

	//查看本会计师的所有工作汇报
		public String show(){
			Employee_Message user=(Employee_Message) session.get("loginUser");
			List<Financial_Workreport> fws=financialBiz.show(user);
			session.put("fws", fws);
			return SUCCESS;
		}
		
	@Override
	public String submitFinancialWorkreport_All() {
		//提交全部工作汇报
		return null;
	}

	@Override
	public String submitFinancialWorkreport_Unaudited() {
		//提交新的的工作汇报
		Employee_Message user=(Employee_Message) session.get("loginUser");
		
		fw.setAccountant(user);
		System.out.println(user.getEmployee_Name()+"\t"+user.getEmployee_Id());
		financialBiz.submitFinancialWorkreport_Unaudited(fw);
		return SUCCESS;
	}

	@Override
	public String checkFinancialWorkreport_State() {
		//查看审核状态
		return null;
	}

	@Override
	public String opFinancialStatements() {
		//对财务报表进行操作
		return null;
	}

	public FinancialBiz getFinancialBiz() {
		return financialBiz;
	}

	public void setFinancialBiz(FinancialBiz financialBiz) {
		this.financialBiz = financialBiz;
	}

	public Financial_Workreport getFw() {
		return fw;
	}

	public void setFw(Financial_Workreport fw) {
		this.fw = fw;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
	}
	

}
