package com.oa.Entity;

import java.io.Serializable;

public class Workreport_State implements Serializable{
		private Integer workreport_State_Id;
		private String workreport_State_Name;
		public Integer getWorkreport_State_Id() {
			return workreport_State_Id;
		}
		public void setWorkreport_State_Id(Integer workreport_State_Id) {
			this.workreport_State_Id = workreport_State_Id;
		}
		public String getWorkreport_State_Name() {
			return workreport_State_Name;
		}
		public void setWorkreport_State_Name(String workreport_State_Name) {
			this.workreport_State_Name = workreport_State_Name;
		}
		public Workreport_State() {
		}
		public Workreport_State(Integer workreport_State_Id, String workreport_State_Name) {
			super();
			this.workreport_State_Id = workreport_State_Id;
			this.workreport_State_Name = workreport_State_Name;
		}
		
}
