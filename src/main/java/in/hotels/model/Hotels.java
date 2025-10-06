package in.hotels.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotels {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String name;
	 private String location;
	 private String imageUrl;
	 private double price;
	 private Double oldPrice;
	 private double rating;
	 private int reviews;
	 private String tags;

	 @Column(length = 1000)
	 private String offers;

	 public Long getId() {
		 return id;
	 }

	 public void setId(Long id) {
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getLocation() {
		 return location;
	 }

	 public void setLocation(String location) {
		 this.location = location;
	 }

	 public String getImageUrl() {
		 return imageUrl;
	 }

	 public void setImageUrl(String imageUrl) {
		 this.imageUrl = imageUrl;
	 }

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double price) {
		 this.price = price;
	 }

	 public Double getOldPrice() {
		 return oldPrice;
	 }

	 public void setOldPrice(Double oldPrice) {
		 this.oldPrice = oldPrice;
	 }

	 public double getRating() {
		 return rating;
	 }

	 public void setRating(double rating) {
		 this.rating = rating;
	 }

	 public int getReviews() {
		 return reviews;
	 }

	 public void setReviews(int reviews) {
		 this.reviews = reviews;
	 }

	 public String getTags() {
		 return tags;
	 }

	 public void setTags(String tags) {
		 this.tags = tags;
	 }

	 public String getOffers() {
		 return offers;
	 }

	 public void setOffers(String offers) {
		 this.offers = offers;
	 }

	 public Hotels(Long id, String name, String location, String imageUrl, double price, Double oldPrice, double rating,
			int reviews, String tags, String offers) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.imageUrl = imageUrl;
		this.price = price;
		this.oldPrice = oldPrice;
		this.rating = rating;
		this.reviews = reviews;
		this.tags = tags;
		this.offers = offers;
	 }

	 public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	 }
	
	 
	 
}
