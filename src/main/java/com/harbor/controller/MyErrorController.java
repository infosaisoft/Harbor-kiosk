package com.harbor.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartException;

import com.harbor.common.ExceptionResponse;
import com.harbor.common.ResourceNotFoundException;


@ControllerAdvice
public class MyErrorController  {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionResponse handleResourceNotFound(final ResourceNotFoundException exception,
			final HttpServletRequest request) {
		  exception.printStackTrace();
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.callerURL(request.getRequestURI());

		return error;
	}
	
	@ExceptionHandler(value= {SQLException.class,DataIntegrityViolationException.class})
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse sqlhandleException(final Exception exception,
			final HttpServletRequest request) {
                  exception.printStackTrace();
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.callerURL(request.getRequestURI());

		return error;
	}

	@ExceptionHandler(value= {MultipartException.class,Exception.class})
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleException(final Exception exception,
			final HttpServletRequest request) {
		  exception.printStackTrace();
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.callerURL(request.getRequestURI());

		return error;
	}
	
	
}
