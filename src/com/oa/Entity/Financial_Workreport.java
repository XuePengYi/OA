package com.oa.Entity;

import java.io.Serializable;

public class Financial_Workreport implements Serializable{
		private Integer financial_Workreport_Id;
		private Employee_Message accountant;
		private String financial_Workreport_Date;
		private Financial_Workreport_Event Event_Id;
		private Float financial_Workreport_Amount;
		private Workreport_State state;
		
		public Integer getFinancial_Workreport_Id() {
			return financial_Workreport_Id;
		}
		public void setFinancial_Workreport_Id(Integer financial_Workreport_Id) {
			this.financial_Workreport_Id = financial_Workreport_Id;
		}
		public Employee_Message getAccountant() {
			return accountant;
		}
		public void setAccountant(Employee_Message accountant) {
			this.accountant = accountant;
		}
		public String getFinancial_Workreport_Date() {
			return financial_Workreport_Date;
		}
		public void setFinancial_Workreport_Date(String financial_Workreport_Date) {
			this.financial_Workreport_Date = financial_Workreport_Date;
		}
		
		public Financial_Workreport_Event getEvent_Id() {
			return Event_Id;
		}
		public void setEvent_Id(Financial_Workreport_Event event_Id) {
			Event_Id = event_Id;
		}
		public Float getFinancial_Workreport_Amount() {
			return financial_Workreport_Amount;
		}
		public void setFinancial_Workreport_Amount(Float financial_Workreport_Amount) {
			this.financial_Workreport_Amount = financial_Workreport_Amount;
		}
		public Workreport_State getState() {
			return state;
		}
		public void setState(Workreport_State state) {
			this.state = state;
		}
		public Financial_Workreport() {
		}
		
		
}
