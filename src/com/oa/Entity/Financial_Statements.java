package com.oa.Entity;

import java.io.Serializable;

public class Financial_Statements implements Serializable{
		private Integer financial_Statements_Id;
		private Financial_Workreport financie_Workreport;
		private Float financial_Statements_Balance;
		
		public Integer getFinancial_Statements_Id() {
			return financial_Statements_Id;
		}
		public void setFinancial_Statements_Id(Integer financial_Statements_Id) {
			this.financial_Statements_Id = financial_Statements_Id;
		}
		public Financial_Workreport getFinancie_Workreport() {
			return financie_Workreport;
		}
		public void setFinancie_Workreport(Financial_Workreport financie_Workreport) {
			this.financie_Workreport = financie_Workreport;
		}
		public Float getFinancial_Statements_Balance() {
			return financial_Statements_Balance;
		}
		public void setFinancial_Statements_Balance(Float financial_Statements_Balance) {
			this.financial_Statements_Balance = financial_Statements_Balance;
		}
		public Financial_Statements() {
		}

		
		
}
