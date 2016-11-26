package com.oa.Entity;

import java.io.Serializable;

public class Employee_Punchcard_Message_State implements Serializable{
		private Integer employee_Punchcard_Message_State_Id;
		private String employee_Punchcard_Message_State_Name;
		
		public Integer getEmployee_Punchcard_Message_State_Id() {
			return employee_Punchcard_Message_State_Id;
		}
		public void setEmployee_Punchcard_Message_State_Id(Integer employee_Punchcard_Message_State_Id) {
			this.employee_Punchcard_Message_State_Id = employee_Punchcard_Message_State_Id;
		}
		public String getEmployee_Punchcard_Message_State_Name() {
			return employee_Punchcard_Message_State_Name;
		}
		public void setEmployee_Punchcard_Message_State_Name(String employee_Punchcard_Message_State_Name) {
			this.employee_Punchcard_Message_State_Name = employee_Punchcard_Message_State_Name;
		}
		public Employee_Punchcard_Message_State() {
			super();
		}
		public Employee_Punchcard_Message_State(Integer employee_Punchcard_Message_State_Id,
				String employee_Punchcard_Message_State_Name) {
			super();
			this.employee_Punchcard_Message_State_Id = employee_Punchcard_Message_State_Id;
			this.employee_Punchcard_Message_State_Name = employee_Punchcard_Message_State_Name;
		}
}
