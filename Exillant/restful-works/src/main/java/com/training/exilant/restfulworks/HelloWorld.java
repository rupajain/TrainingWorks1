package com.training.exilant.restfulworks;

public class HelloWorld {
private String message;
public HelloWorld(String message)
{
this.setMessage(message);	
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "HelloWorld [message=" + message + "]";
}


}
