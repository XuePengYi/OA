package com.oa.Entity;

import java.io.Serializable;

public class Manager_Workreport_Month implements Serializable{
		private Integer manager_Workreport_Month_Id;
		private Employee_Message manager;
		private String manager_Workreport_Month_Date;
		private String manager_Workreport_Month_Title;
		private String manager_Workreport_Month_Summary;
		private String manager_Workreport_Month_Content;
		private String manager_Workreport_Month_Reply;
		private Workreport_State state;
		public Integer getManager_Workreport_Month_Id() {
			return manager_Workreport_Month_Id;
		}
		public void setManager_Workreport_Month_Id(Integer manager_Workreport_Month_Id) {
			this.manager_Workreport_Month_Id = manager_Workreport_Month_Id;
		}
		public Employee_Message getManager() {
			return manager;
		}
		public void setManager(Employee_Message manager) {
			this.manager = manager;
		}
		public String getManager_Workreport_Month_Date() {
			return manager_Workreport_Month_Date;
		}
		public void setManager_Workreport_Month_Date(String manager_Workreport_Month_Date) {
			this.manager_Workreport_Month_Date = manager_Workreport_Month_Date;
		}
		public String getManager_Workreport_Month_Title() {
			return manager_Workreport_Month_Title;
		}
		public void setManager_Workreport_Month_Title(String manager_Workreport_Month_Title) {
			this.manager_Workreport_Month_Title = manager_Workreport_Month_Title;
		}
		public String getManager_Workreport_Month_Summary() {
			return manager_Workreport_Month_Summary;
		}
		public void setManager_Workreport_Month_Summary(String manager_Workreport_Month_Summary) {
			this.manager_Workreport_Month_Summary = manager_Workreport_Month_Summary;
		}
		public String getManager_Workreport_Month_Content() {
			return manager_Workreport_Month_Content;
		}
		public void setManager_Workreport_Month_Content(String manager_Workreport_Month_Content) {
			this.manager_Workreport_Month_Content = manager_Workreport_Month_Content;
		}
		public String getManager_Workreport_Month_Reply() {
			return manager_Workreport_Month_Reply;
		}
		public void setManager_Workreport_Month_Reply(String manager_Workreport_Month_Reply) {
			this.manager_Workreport_Month_Reply = manager_Workreport_Month_Reply;
		}
		public Workreport_State getState() {
			return state;
		}
		public void setState(Workreport_State state) {
			this.state = state;
		}
		public Manager_Workreport_Month() {
		}
		
}
