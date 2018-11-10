package com.harbor.domain;

public class HospitalDoAndDontsBo {
	
	private long id;
	private String name;
	private String images;
	private String videos;
	private String documents;
	private String description;
	private long hospital_id;
	
	
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
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getVideos() {
		return videos;
	}
	public void setVideos(String videos) {
		this.videos = videos;
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(long hospital_id) {
		this.hospital_id = hospital_id;
	}

}
