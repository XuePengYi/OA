package com.oa.Entity;

import java.io.Serializable;

public class Employee_Message implements Serializable{
		private Integer employee_Id;
		private String employee_Name;
		private String employee_Age;
		private String employee_Phone;
		private String employee_Sex;
		private String employee_Address;
		private Employee_Sector employee_Sector;
		private Employee_Type employee_Type;
		
		public Integer getEmployee_Id() {
			return employee_Id;
		}
		public void setEmployee_Id(Integer employee_Id) {
			this.employee_Id = employee_Id;
		}
		public String getEmployee_Name() {
			return employee_Name;
		}
		public void setEmployee_Name(String employee_Name) {
			this.employee_Name = employee_Name;
		}
		public String getEmployee_Age() {
			return employee_Age;
		}
		public void setEmployee_Age(String employee_Age) {
			this.employee_Age = employee_Age;
		}
		public String getEmployee_Phone() {
			return employee_Phone;
		}
		public void setEmployee_Phone(String employee_Phone) {
			this.employee_Phone = employee_Phone;
		}
		public String getEmployee_Sex() {
			return employee_Sex;
		}
		public void setEmployee_Sex(String employee_Sex) {
			this.employee_Sex = employee_Sex;
		}
		public String getEmployee_Address() {
			return employee_Address;
		}
		public void setEmployee_Address(String employee_Address) {
			this.employee_Address = employee_Address;
		}
		public Employee_Sector getEmployee_Sector() {
			return employee_Sector;
		}
		public void setEmployee_Sector(Employee_Sector employee_Sector) {
			this.employee_Sector = employee_Sector;
		}
		public Employee_Type getEmployee_Type() {
			return employee_Type;
		}
		public void setEmployee_Type(Employee_Type employee_Type) {
			this.employee_Type = employee_Type;
		}
		public Employee_Message() {
		}
		
}
