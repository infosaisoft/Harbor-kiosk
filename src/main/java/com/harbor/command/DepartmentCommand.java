package com.harbor.command;

public class DepartmentCommand {
	
	private String  dptName[];
	private String dptLocation[];
	private String dptid;
	private long hid;
	
	
	
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
	public long getHid() {
		return hid;
	}
	public void setHid(long hid) {
		this.hid = hid;
	}
	
	
}
