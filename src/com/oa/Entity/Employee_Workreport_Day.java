package com.oa.Entity;

import java.io.Serializable;

public class Employee_Workreport_Day implements Serializable{
		private Integer employee_Workreport_Day_Id;
		private Employee_Message employee;
		private Employee_Message manager;
		private String employee_Workreport_Day_Date;
		private String employee_Workreport_Day_Title;
		private String employee_Workreport_Day_Summary;
		private String employee_Workreport_Day_Content;
		private String employee_Workreport_Day_Reply;
		private Workreport_State state=new Workreport_State(2, "Œ¥…Û∫À");
		
		public Integer getEmployee_Workreport_Day_Id() {
			return employee_Workreport_Day_Id;
		}
		public void setEmployee_Workreport_Day_Id(Integer employee_Workreport_Day_Id) {
			this.employee_Workreport_Day_Id = employee_Workreport_Day_Id;
		}
		public Employee_Message getEmployee() {
			return employee;
		}
		public void setEmployee(Employee_Message employee) {
			this.employee = employee;
		}
		public Employee_Message getManager() {
			return manager;
		}
		public void setManager(Employee_Message manager) {
			this.manager = manager;
		}
		public String getEmployee_Workreport_Day_Date() {
			return employee_Workreport_Day_Date;
		}
		public void setEmployee_Workreport_Day_Date(String employee_Workreport_Day_Date) {
			this.employee_Workreport_Day_Date = employee_Workreport_Day_Date;
		}
		public String getEmployee_Workreport_Day_Title() {
			return employee_Workreport_Day_Title;
		}
		public void setEmployee_Workreport_Day_Title(String employee_Workreport_Day_Title) {
			this.employee_Workreport_Day_Title = employee_Workreport_Day_Title;
		}
		public String getEmployee_Workreport_Day_Summary() {
			return employee_Workreport_Day_Summary;
		}
		public void setEmployee_Workreport_Day_Summary(String employee_Workreport_Day_Summary) {
			this.employee_Workreport_Day_Summary = employee_Workreport_Day_Summary;
		}
		public String getEmployee_Workreport_Day_Content() {
			return employee_Workreport_Day_Content;
		}
		public void setEmployee_Workreport_Day_Content(String employee_Workreport_Day_Content) {
			this.employee_Workreport_Day_Content = employee_Workreport_Day_Content;
		}
		public String getEmployee_Workreport_Day_Reply() {
			return employee_Workreport_Day_Reply;
		}
		public void setEmployee_Workreport_Day_Reply(String employee_Workreport_Day_Reply) {
			this.employee_Workreport_Day_Reply = employee_Workreport_Day_Reply;
		}
		public Workreport_State getState() {
			return state;
		}
		public void setState(Workreport_State state) {
			this.state = state;
		}
		public Employee_Workreport_Day() {
		}	
}
