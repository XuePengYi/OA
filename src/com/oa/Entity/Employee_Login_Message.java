package com.oa.Entity;

import java.io.Serializable;

public class Employee_Login_Message implements Serializable {
		private Integer employee_Login_Id;
		private Employee_Message employee;
		private String employee_Login_Password;
		
		public Integer getEmployee_Login_Id() {
			return employee_Login_Id;
		}
		public void setEmployee_Login_Id(Integer employee_Login_Id) {
			this.employee_Login_Id = employee_Login_Id;
		}
		public Employee_Message getEmployee() {
			return employee;
		}
		public void setEmployee(Employee_Message employee) {
			this.employee = employee;
		}
		public String getEmployee_Login_Password() {
			return employee_Login_Password;
		}
		public void setEmployee_Login_Password(String employee_Login_Password) {
			this.employee_Login_Password = employee_Login_Password;
		}
		public Employee_Login_Message() {
		}
		
		
		
}
