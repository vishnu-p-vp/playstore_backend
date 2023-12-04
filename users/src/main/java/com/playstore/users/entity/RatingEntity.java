package com.playstore.users.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RatingEntity {
	@Id
	Integer ratingId;
	Integer stars;
	String reviews;
	public Integer getRatingId() {
		return ratingId;
	}
	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	@Override
	public String toString() {
		return "RatingEntity [ratingId=" + ratingId + ", stars=" + stars + ", reviews=" + reviews + "]";
	}
	public RatingEntity() {
		super();
	}
	public RatingEntity(Integer ratingId, Integer stars, String reviews) {
		super();
		this.ratingId = ratingId;
		this.stars = stars;
		this.reviews = reviews;
	}
}
