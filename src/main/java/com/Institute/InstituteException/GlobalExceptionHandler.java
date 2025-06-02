package com.Institute.InstituteException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler (InstituteException.class)
	public ResponseEntity<Object> InstituteExc(InstituteException ie){
		
		return new ResponseEntity<>(ie.getMessage(),HttpStatus.NOT_FOUND);
	}
		
		
	@ExceptionHandler (feesnotfoundException.class)
		public ResponseEntity<Object> feesNotExc(feesnotfoundException ie){
			
			return new ResponseEntity<>(ie.getMessage(),HttpStatus.NOT_FOUND);
				
    
		
	}
	
	@ExceptionHandler (IdnotfoundException.class)
	public ResponseEntity<Object> IdNotExc(IdnotfoundException ie){
		
		return new ResponseEntity<>(ie.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler (ArithmeticException.class)
		public ResponseEntity<Object> ArithmaticExc(ArithmeticException ie){
			
			return new ResponseEntity<>(ie.getMessage(),HttpStatus.NOT_FOUND);
			  
   
  
	
}

	
	

}
