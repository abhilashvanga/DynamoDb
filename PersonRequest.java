package com.dtcc.UWProject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersonRequest {
	private String empid;
	private String empname;
	private String empsal;
	
	
	public PersonRequest() {
		super();
	}
	
	 public String toString() {
	        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        return gson.toJson(this);
	    }
	public String getEmpId() {
		return empid;
	}
	public void setEmpId(String empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empname;
	}
	public void setEmpName(String empname) {
		this.empname = empname;
	}
	public String getEmpsal() {
		return empsal;
	}
	public void setEmpsal(String empsal) {
		this.empsal = empsal;
	}
	

}
