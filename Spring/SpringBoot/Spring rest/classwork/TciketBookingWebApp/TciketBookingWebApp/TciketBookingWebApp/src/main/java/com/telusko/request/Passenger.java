package com.telusko.request;



public class Passenger 
{
		
		private Integer pid;
		private String name;
		
		private String depature;
		private String arrival;
		
		private String dateOfJourney;
		
		
		
		public Passenger() {
			super();
		}
		public Integer getPid() {
			return pid;
		}
		public void setPid(Integer pid) {
			this.pid = pid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepature() {
			return depature;
		}
		public void setDepature(String depature) {
			this.depature = depature;
		}
		public String getArrival() {
			return arrival;
		}
		public void setArrival(String arrival) {
			this.arrival = arrival;
		}
		public String getDateOfJourney() {
			return dateOfJourney;
		}
		public void setDateOfJourney(String dateOfJourney) {
			this.dateOfJourney = dateOfJourney;
		}
	
		@Override
		public String toString() {
			return "Passenger [pid=" + pid + ", name=" + name + ", depature=" + depature + ", arrival=" + arrival
					+ ", dateOfJourney=" + dateOfJourney +"]";
		}
		
		
}

