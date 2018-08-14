package com.harbor.dto;

import org.springframework.web.multipart.MultipartFile;

public class HosptialDto {

	private String name;
	private String address;
	private String phNumber;
	private MultipartFile hospitalLogo;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public MultipartFile getHospitalLogo() {
		return hospitalLogo;
	}
	public void setHospitalLogo(MultipartFile hospitalLogo) {
		this.hospitalLogo = hospitalLogo;
	}
	
	
}
