package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;

public class jenkins1 {
	
  @GetMapping("/jenkins")
	public String name(){
		
		String a1 ="vishwa";
		
		return a1;
		
		
	}
  

 @GetMapping("/jenkins1")
   public String name1(){
	
	String a1 ="Sridhar";
	
	return a1;
	
	
}


}
