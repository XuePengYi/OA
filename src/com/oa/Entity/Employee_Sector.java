package com.oa.Entity;

import java.io.Serializable;

public class Employee_Sector implements Serializable{
		private Integer employee_Sector_Id;
		private String employee_Sector_Name;
		
		public Integer getEmployee_Sector_Id() {
			return employee_Sector_Id;
		}
		public void setEmployee_Sector_Id(Integer employee_Sector_Id) {
			employee_Sector_Id = employee_Sector_Id;
		}
		public String getEmployee_Sector_Name() {
			return employee_Sector_Name;
		}
		public void setEmployee_Sector_Name(String employee_Sector_Name) {
			employee_Sector_Name = employee_Sector_Name;
		}
		public Employee_Sector() {
			super();
		}
		
}
