package com.harbor.domain;

public class PatientDiseasesBo {
	
	private String pid;	
	private String disease_type;
	private String diet_chart;
	private String exercises;
	private String do_and_donts;
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getDisease_type() {
		return disease_type;
	}
	public void setDisease_type(String disease_type) {
		this.disease_type = disease_type;
	}
	public String getDiet_chart() {
		return diet_chart;
	}
	public void setDiet_chart(String diet_chart) {
		this.diet_chart = diet_chart;
	}
	public String getExercises() {
		return exercises;
	}
	public void setExercises(String exercises) {
		this.exercises = exercises;
	}
	public String getDo_and_donts() {
		return do_and_donts;
	}
	public void setDo_and_donts(String do_and_donts) {
		this.do_and_donts = do_and_donts;
	}
}
