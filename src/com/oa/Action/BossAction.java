package com.oa.Action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import com.oa.Biz.BossBiz;
import com.oa.Dao.BossDao;
import com.oa.Entity.Financial_Workreport;
import com.oa.Entity.Manager_Workreport_Month;
import com.oa.Entity.Workreport_State;
import com.oa.IAction.IBossAction;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BossAction extends ActionSupport implements IBossAction,SessionAware,ModelDriven<Manager_Workreport_Month>{

	BossBiz bossBiz;
	Map<String,Object> session;
	Manager_Workreport_Month manager_Workreport_Month=new Manager_Workreport_Month();
	Financial_Workreport financial_Workreport;
	
	/**
	 * 老板审批财务的月工作报告
	 * @Override
	 */
	public String opFinancialWorkreport_State() {
		Workreport_State state=new Workreport_State(1,"已审核");
		Financial_Workreport m=(Financial_Workreport) session.get("bossFw");
		m.setState(state);
		bossBiz.opFinancialWorkreport_State(m);
		financial_Workreport=null;
		return SUCCESS;
	}
	/**
	 * 老板获得财务的工作报告
	 */
	public String getFinancialWorkport(){
		List<Financial_Workreport> f=bossBiz.checkFinancial_Workreport();
		session.put("bossFws", f);
		return SUCCESS;
	}
	/**
	 * 老板获得财务的一个工作报告
	 */
	public String getOneFinancialWorkport(){
		Financial_Workreport f=bossBiz.checkOneFinancial_Workreport(financial_Workreport);
		session.put("bossFw", f);
		return SUCCESS;
	}
	
	
	/**
	 * 老板审批经理的月工作报告
	 * @Override
	 */
	public String opManagerWorkreport_State() {
		Workreport_State state=new Workreport_State(1,"已审核");
		Manager_Workreport_Month m=(Manager_Workreport_Month) session.get("bossMwm");
		m.setState(state);
		m.setManager_Workreport_Month_Reply(manager_Workreport_Month.getManager_Workreport_Month_Reply());
		bossBiz.opManagerWorkreport_State(m);
		manager_Workreport_Month=new Manager_Workreport_Month();
		return SUCCESS;
	}

	/**
	 * 老板获得经理的月工作报告
	 * @Override
	 */
	public String checkWorkreportDay_Manager_All() {
		List<Manager_Workreport_Month> mwms=bossBiz.checkWorkreportMonth_All();
		session.put("bossMwms", mwms);
		return SUCCESS;
	}
	/**
	 * 老板获得经理的一个月工作报告，用户查看审批
	 * @Override
	 */
	public String checkOneWorkreportDay_Manager_All() {
		Manager_Workreport_Month mwms=bossBiz.checkOneWorkreportMonth_All(manager_Workreport_Month);
		session.put("bossMwm", mwms);
		return SUCCESS;
	}
	@Override
	public String getPersonalInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String checkWorkreportDay_Employee_All() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getAttenanceInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkWorkreportMonth_All() {
		// TODO Auto-generated method stub
		return null;
	}

	public BossBiz getBossBiz() {
		return bossBiz;
	}

	public void setBossBiz(BossBiz bossBiz) {
		this.bossBiz = bossBiz;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public Manager_Workreport_Month getModel() {
		// TODO Auto-generated method stub
		return manager_Workreport_Month;
	}

	public Manager_Workreport_Month getManager_Workreport_Month() {
		return manager_Workreport_Month;
	}

	public void setManager_Workreport_Month(Manager_Workreport_Month manager_Workreport_Month) {
		this.manager_Workreport_Month = manager_Workreport_Month;
	}
	public Financial_Workreport getFinancial_Workreport() {
		return financial_Workreport;
	}
	public void setFinancial_Workreport(Financial_Workreport financial_Workreport) {
		this.financial_Workreport = financial_Workreport;
	}

	
	
}
