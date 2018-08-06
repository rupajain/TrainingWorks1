package com.training.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired(required=false)
	private Camera camera;
	//@Autowired
	private Screen screen;
	//@Autowired
	private Speaker speaker;

	public Mobile() {
		// TODO Auto-generated constructor stub

		System.out.println("creating mobile.." + this);
	}

	public Camera getCamera() {
		return camera;
	}

	//@Autowired
	// @Value("#{employeeinfo.properties.}")
	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Screen getScreen() {
		return screen;
	}

	// @Autowired
	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	// @Autowired
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

}
