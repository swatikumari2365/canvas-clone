package com.swati.canvas_clone.dto;



public class ImageDto {
	
	private Long id;
	private String ImageUrl;
	public ImageDto(Long id, String imageUrl) {
		super();
		this.id = id;
		ImageUrl = imageUrl;
	}
	public ImageDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	
	

}
