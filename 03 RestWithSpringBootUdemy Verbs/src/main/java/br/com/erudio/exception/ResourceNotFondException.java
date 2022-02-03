package br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFondException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFondException(String exception) {
		super(exception);
	}
	
}
