package com.imran.SpringBoot.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception exception, WebRequest request) throws Exception
	{
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), exception.getMessage(),
				request.getDescription(false));
		
		System.out.println("exception.fillInStackTrace() : " + exception.fillInStackTrace());
		System.out.println("exception.getCause() : " + exception.getCause());
		System.out.println("exception.getStackTrace() : " + exception.getStackTrace().toString());
		System.out.println("request.getContextPath() : " + request.getContextPath());
		System.out.println("request.getDescription(true) : " + request.getDescription(true));
		//System.out.println("request.getRemoteUser() : " + request.getRemoteUser().toString());
		System.out.println("request.isSecure() : " + request.isSecure());
		System.out.println("request.getLocale() : " + request.getLocale().toString());
		
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
	}
}
