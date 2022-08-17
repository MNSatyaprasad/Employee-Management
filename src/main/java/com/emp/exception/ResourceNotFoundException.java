package com.emp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fileName;
	private Object fieldValue;
	
	public String getResourceName() {
		return resourceName;
	}
	public String getFileName() {
		return fileName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}
	public ResourceNotFoundException(String resourceName, String fileName, Object fieldValue) {
		super(String.format("%s not found with the %s : %s ",resourceName,fileName,fieldValue ));
		this.resourceName = resourceName;
		this.fileName = fileName;
		this.fieldValue = fieldValue;
	}
	
	
	
}
