package com.harbor.command;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.harbor.validation.IUniqueCoupon;
import com.harbor.validation.IValidPassword;

public class AdminCommand {

	@NotBlank(message = "Admin name required")
	private String admin_name;

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email address")
	private String admin_email;

	@Pattern(regexp = "(^$|[0-9]{10})", message = "phone number not valid")
	private String admin_moNumber;

	private long admin_id;

	@NotBlank(message = "Password is required")
	// @IValidPassword(message="password must be valid")
	private String admin_password;
	private long hid;
	private int gender;
	private String address;
	private String photo;
	private long user_id;

	@NotBlank(message = "username is requried")
	private String username;

	private String role;
	private String name;

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public String getAdmin_moNumber() {
		return admin_moNumber;
	}

	public void setAdmin_moNumber(String admin_moNumber) {
		this.admin_moNumber = admin_moNumber;
	}

	public long getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(long admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public long getHid() {
		return hid;
	}

	public void setHid(long hid) {
		this.hid = hid;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
