package com.abhi.microservice.galleryService.GalleryService.entity;

public class Gallery {

	private int id;
	private Object image;
	public Gallery(int id, Image image) {
		super();
		this.id = id;
		this.image = image;
	}
	public Gallery()
	{}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Object getImage() {
		return image;
	}
	public void setImage(Object image) {
		this.image = image;
	}
	
}
