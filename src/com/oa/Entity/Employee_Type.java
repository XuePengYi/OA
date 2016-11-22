package com.oa.Entity;

import java.io.Serializable;

public class Employee_Type implements Serializable{
		private Integer employee_Type_Id;
		private String employee_Type_Name;
		
		public Integer getEmployee_Type_Id() {
			return employee_Type_Id;
		}
		public void setEmployee_Type_Id(Integer employee_Type_Id) {
			employee_Type_Id = employee_Type_Id;
		}
		public String getEmployee_Type_Name() {
			return employee_Type_Name;
		}
		public void setEmployee_Type_Name(String employee_Type_Name) {
			employee_Type_Name = employee_Type_Name;
		}
		public Employee_Type() {
			super();
		}
		
}
