package com.harbor.dto;


public class PatientDto {
	private int PatientID;
	private String PatientName;
	private String PatientAadhar;
	private String PatientContact;
	
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getPatientAadhar() {
		return PatientAadhar;
	}
	public void setPatientAadhar(String patientAadhar) {
		PatientAadhar = patientAadhar;
	}
	public String getPatientContact() {
		return PatientContact;
	}
	public void setPatientContact(String patientContact) {
		PatientContact = patientContact;
	}
	@Override
	public String toString() {
		return "PatientDto [PatientID=" + PatientID + ", PatientName=" + PatientName + ", PatientAadhar="
				+ PatientAadhar + ", PatientContact=" + PatientContact + "]";
	}
	
	
	
	
}	
