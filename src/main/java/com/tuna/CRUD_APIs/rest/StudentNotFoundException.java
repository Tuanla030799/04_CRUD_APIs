package com.tuna.CRUD_APIs.rest;

public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(String message) {
		super(message);
	}
	
	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}
}
