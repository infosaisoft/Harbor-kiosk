package com.harbor.command;

import java.util.List;

public class DepartmentCommand {

	
	private long dptid;
	private long hid;
	private String  dptName;
	private String dptLocation;
   
	public long getDptid() {
		return dptid;
	}
	public void setDptid(long dptid) {
		this.dptid = dptid;
	}
	public long getHid() {
		return hid;
	}
	public void setHid(long hid) {
		this.hid = hid;
	}
	
	public String getDptName() {
		return dptName;
	}
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	public String getDptLocation() {
		return dptLocation;
	}
	public void setDptLocation(String dptLocation) {
		this.dptLocation = dptLocation;
	}
	
	

	
	
	
}
