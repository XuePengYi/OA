package com.oa.Entity;

import java.io.Serializable;

public class Employee_Punchcard_Message implements Serializable{
		private Integer employee_Punchcard_Message_Id;
		private Employee_Message employee;
		private String employee_Punchcard_Message_Firsttime;
		private String employee_Punchcard_Message_Lasttime;
		public Integer getEmployee_Punchcard_Message_Id() {
			return employee_Punchcard_Message_Id;
		}
		public void setEmployee_Punchcard_Message_Id(Integer employee_Punchcard_Message_Id) {
			this.employee_Punchcard_Message_Id = employee_Punchcard_Message_Id;
		}
		public Employee_Message getEmployee() {
			return employee;
		}
		public void setEmployee(Employee_Message employee) {
			this.employee = employee;
		}
		public String getEmployee_Punchcard_Message_Firsttime() {
			return employee_Punchcard_Message_Firsttime;
		}
		public void setEmployee_Punchcard_Message_Firsttime(String employee_Punchcard_Message_Firsttime) {
			this.employee_Punchcard_Message_Firsttime = employee_Punchcard_Message_Firsttime;
		}
		public String getEmployee_Punchcard_Message_Lasttime() {
			return employee_Punchcard_Message_Lasttime;
		}
		public void setEmployee_Punchcard_Message_Lasttime(String employee_Punchcard_Message_Lasttime) {
			this.employee_Punchcard_Message_Lasttime = employee_Punchcard_Message_Lasttime;
		}
		public Employee_Punchcard_Message() {
		}
		
		
		
}
