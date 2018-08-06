package com.training.autowire;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
private String type;
private int volLevels;

public Speaker() {
	// TODO Auto-generated constructor stub
	
	System.out.println("creating speakers..."+this);
	
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getVolLevels() {
	return volLevels;
}

public void setVolLevels(int volLevels) {
	this.volLevels = volLevels;
}

}
