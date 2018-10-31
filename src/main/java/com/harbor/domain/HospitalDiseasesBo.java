package com.harbor.domain;

public class HospitalDiseasesBo {
	private long id;
	private String name;
	private String videos;
	private String images;
	private String discriptions;
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
	public String getVideos() {
		return videos;
	}
	public void setVideos(String videos) {
		this.videos = videos;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getDiscriptions() {
		return discriptions;
	}
	public void setDiscriptions(String discriptions) {
		this.discriptions = discriptions;
	}
	public long getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(long hospital_id) {
		this.hospital_id = hospital_id;
	}
	
	
	
	
	
}
