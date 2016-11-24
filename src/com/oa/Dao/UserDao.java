package com.oa.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oa.Entity.Attendance_Management;
import com.oa.Entity.Employee_Message;
import com.oa.Entity.Employee_Punchcard_Message;
import com.oa.IDao.IUserDao;

public class UserDao extends BaseDao implements IUserDao{

	@Override
	public List login(Integer userName,String userPwd) {
		Session session=getSession();
		String hql="from Employee_Login_Message as elm where elm.employee.employee_Id=:userName and elm.employee_Login_Password=:userPwd";
		Query query=session.createQuery(hql);
		query.setInteger("userName", userName);
		query.setString("userPwd", userPwd);
		List loginUser=query.list();
		return loginUser;
	}

	@Override
	public List<Employee_Message> getPersonalInfo(Employee_Message user) {
		Session session=getSession();
		Query query=session.createQuery("from Employee_Message as em where em.employee_Id=:employee_Id");
		query.setProperties(user);
		List<Employee_Message> mployee_Messages=query.list();
		return mployee_Messages;
	}

	@Override
	public List<Attendance_Management> getAttenanceInfo(Employee_Message user) {
		Session session=getSession();
		Query query=session.createQuery("from Attendance_Management as am where em.employee_Id=:employee_Id");
		query.setProperties(user);
		List<Attendance_Management> attendance_Managements=query.list();
		return attendance_Managements;
	}

	@Override
	public String punchCard_First(Employee_Punchcard_Message epmf) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		System.out.println(epmf.getEmployee_Punchcard_Message_Firsttime());
		session.save(epmf);
		tx.commit();
		return null;
	}
	
	public List<Employee_Punchcard_Message> getOneEmployee_Punchcard_Message(Employee_Message user){
		Session session=getSession();
		String sql="select * from employee_punchcard_message as epm where epm.employee.employee_Id=? and epm.employee_Punchcard_Message_Id=(select max(employee_Punchcard_Message_Id) from employee_punchcard_message)";
		Query query=session.createSQLQuery(sql);
		query.setInteger(1, user.getEmployee_Id());
		List<Employee_Punchcard_Message> epmf=query.list();
		return epmf;
	}
	
	@Override
	public String punchCard_Last(Employee_Punchcard_Message epml) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.update(epml);
		tx.commit();
		return null;
	}

	@Override
	public List<Employee_Punchcard_Message> getAllEmployee_Punchcard_Message(Employee_Message user) {
		Session session=getSession();
		Query query=session.createQuery("from Employee_Punchcard_Message as epm where epm.employee.employee_Id=:employee_Id");
		query.setInteger("employee_Id", user.getEmployee_Id());
		List<Employee_Punchcard_Message> emps=query.list();
		System.out.println(emps.size());
		return emps;
	}

}
