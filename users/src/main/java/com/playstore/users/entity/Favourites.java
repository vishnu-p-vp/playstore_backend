package com.playstore.users.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Favourites {
	@Id
	String appName;

	public Favourites() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Favourites(String appName) {
		super();
		this.appName = appName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
