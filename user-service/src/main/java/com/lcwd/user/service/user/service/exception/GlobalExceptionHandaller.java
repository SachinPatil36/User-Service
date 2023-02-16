package com.lcwd.user.service.user.service.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.lcwd.user.service.user.service.exception.apiresponse.ApiResponse;



@RestControllerAdvice
public class GlobalExceptionHandaller {
	
	@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity<ApiResponse> handalerResourseNotFoundException(ResourseNotFoundException ex){
		
		
		String message=ex.getMessage();
		
		
		ApiResponse response=ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		

	    return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
		
	}
	
	

}
