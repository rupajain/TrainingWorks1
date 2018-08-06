package com.training.exilant.restfulworks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{
public UserNotFoundException()
{
	super();
}
public UserNotFoundException(String arg0)
{
	super(arg0);
}
}
