package com.harbor.command;

public class DepartmentCommand {
	
	private String  dptName[];
	private String dptLocation[];
	private String dptid;
	private String hid;
	
	
	
	public String[] getDptName() {
		return dptName;
	}
	public void setDptName(String[] dptName) {
		this.dptName = dptName;
	}
	public String[] getDptLocation() {
		return dptLocation;
	}
	public void setDptLocation(String[] dptLocation) {
		this.dptLocation = dptLocation;
	}
	public String getDptid() {
		return dptid;
	}
	public void setDptid(String dptid) {
		this.dptid = dptid;
	}
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}

}
