package com.oa.Entity;

import java.io.Serializable;

public class Manager_Workreport_Day implements Serializable{
		private Integer manager_Workreport_Day_Id;
		private Employee_Message manager;
		private String manager_Workreport_Day_Date;
		private String manager_Workreport_Day_Title;
		private String manager_Workreport_Day_Summary;
		private String manager_Workreport_Day_Content;
		private String manager_Workreport_Day_Reply;
		private Workreport_State state;
		public Integer getManager_Workreport_Day_Id() {
			return manager_Workreport_Day_Id;
		}
		public void setManager_Workreport_Day_Id(Integer manager_Workreport_Day_Id) {
			this.manager_Workreport_Day_Id = manager_Workreport_Day_Id;
		}
		public Employee_Message getManager() {
			return manager;
		}
		public void setManager(Employee_Message manager) {
			this.manager = manager;
		}
		public String getManager_Workreport_Day_Date() {
			return manager_Workreport_Day_Date;
		}
		public void setManager_Workreport_Day_Date(String manager_Workreport_Day_Date) {
			this.manager_Workreport_Day_Date = manager_Workreport_Day_Date;
		}
		public String getManager_Workreport_Day_Title() {
			return manager_Workreport_Day_Title;
		}
		public void setManager_Workreport_Day_Title(String manager_Workreport_Day_Title) {
			this.manager_Workreport_Day_Title = manager_Workreport_Day_Title;
		}
		public String getManager_Workreport_Day_Summary() {
			return manager_Workreport_Day_Summary;
		}
		public void setManager_Workreport_Day_Summary(String manager_Workreport_Day_Summary) {
			this.manager_Workreport_Day_Summary = manager_Workreport_Day_Summary;
		}
		public String getManager_Workreport_Day_Content() {
			return manager_Workreport_Day_Content;
		}
		public void setManager_Workreport_Day_Content(String manager_Workreport_Day_Content) {
			this.manager_Workreport_Day_Content = manager_Workreport_Day_Content;
		}
		public String getManager_Workreport_Day_Reply() {
			return manager_Workreport_Day_Reply;
		}
		public void setManager_Workreport_Day_Reply(String manager_Workreport_Day_Reply) {
			this.manager_Workreport_Day_Reply = manager_Workreport_Day_Reply;
		}
		public Workreport_State getState() {
			return state;
		}
		public void setState(Workreport_State state) {
			this.state = state;
		}
		public Manager_Workreport_Day() {
		}
		
		
}
