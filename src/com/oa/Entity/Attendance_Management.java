package com.oa.Entity;

import java.io.Serializable;

public class Attendance_Management implements Serializable{
		private Integer attendance_Id;
		private Employee_Message employee;
		private Integer attendance_Days;
		private Integer absence_Days;
		private Integer work_Times;
		
		public Integer getAttendance_Id() {
			return attendance_Id;
		}
		public void setAttendance_Id(Integer attendance_Id) {
			this.attendance_Id = attendance_Id;
		}
		public Employee_Message getEmployee() {
			return employee;
		}
		public void setEmployee(Employee_Message employee) {
			this.employee = employee;
		}
		public Integer getAttendance_Days() {
			return attendance_Days;
		}
		public void setAttendance_Days(Integer attendance_Days) {
			this.attendance_Days = attendance_Days;
		}
		public Integer getAbsence_Days() {
			return absence_Days;
		}
		public void setAbsence_Days(Integer absence_Days) {
			this.absence_Days = absence_Days;
		}
		public Integer getWork_Times() {
			return work_Times;
		}
		public void setWork_Times(Integer work_Times) {
			this.work_Times = work_Times;
		}
		
		public Attendance_Management() {
		}
		
		
}
