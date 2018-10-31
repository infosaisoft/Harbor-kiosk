package com.harbor.command;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.springframework.web.multipart.MultipartFile;

import com.harbor.validation.IUniqueCoupon;


public class HospitalCommand {
	
	private long id;
	@NotNull(message="name must be requried")
	@NotEmpty(message="name is requried")
	private String name;
	
	@NotEmpty(message="address must be requried")
	private String address;
	
	@NotEmpty(message="city must be requried")
	private String city;
	
	@NotEmpty(message="state must be requried")
	private String state;
	
	@NotEmpty(message="pincode must be requried")
	private String pincode;

	
	@Pattern(regexp="(^$|[0-9]{10})",message="phone number not valid")
	private String contact;
	

	private String reg_number;
	
	private String logo;
	private Date  creation_date;
	private MultipartFile logo_photo;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getReg_number() {
		return reg_number;
	}
	public void setReg_number(String reg_number) {
		this.reg_number = reg_number;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Date getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
	public MultipartFile getLogo_photo() {
		return logo_photo;
	}
	public void setLogo_photo(MultipartFile logo_photo) {
		this.logo_photo = logo_photo;
	}
	
}
