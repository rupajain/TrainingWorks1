package com.training.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	

	@Value("#{camera.type}")
	 String type;

	public Camera() {
		// TODO Auto-generated constructor stub
		System.out.println("creating camera..." + this);
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Camera [type=" + type + "]";
	}

	public void setType(String type) {
		this.type = type;
	}

}
