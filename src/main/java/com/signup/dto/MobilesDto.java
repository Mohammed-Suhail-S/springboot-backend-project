package com.signup.dto;

public class MobilesDto {
	private long id;
	private String name;
	private String offerPrice;
	private String originalPrice;
	private String rating;
	private String title;
	private int delivery;
	private String category;
	private String image;
	
	public MobilesDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobilesDto(long id, String name, String offerPrice, String originalPrice, String rating, String title,
			int delivery, String category, String image) {
		super();
		this.id = id;
		this.name = name;
		this.offerPrice = offerPrice;
		this.originalPrice = originalPrice;
		this.rating = rating;
		this.title = title;
		this.delivery = delivery;
		this.category = category;
		this.image = image;
	}

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

	public String getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDelivery() {
		return delivery;
	}

	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
