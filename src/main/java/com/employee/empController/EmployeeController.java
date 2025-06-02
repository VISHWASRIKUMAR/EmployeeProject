package com.employee.empController;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empEntity.Employee;
import com.employee.empService.EmployeeService;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeService es;

    @GetMapping(value = "/postSingleObject2")
    public List<Employee> postSingleObject() {
    	
        return es.postSingleObject();
    }
    
    
    @GetMapping(value ="/GetSingleObject/{s}")
    public Employee getObject(@PathVariable int s) {
    	
    	return es.getObject(s);
    }
    
    
    @DeleteMapping(value ="/deleteSingleObject/{s}")
    
    public String deleteSingleObject(@PathVariable int s){
    	
    	return es.deleteSingleObject(s);
    }
    	
    	
    @DeleteMapping(value ="/deleteFullObject")
        
        public String deleteFullObject(){
        	
        	return es.deleteFullObject();
    	
    }
    
    
    @PutMapping(value ="/updateObject/{n}")
        	public String updateObject(@PathVariable int n, @RequestBody Employee e) {
        	    return es.updateObject(n,e);
        	}
    
    
    @PatchMapping(value ="/updateSinglefield/{n}")
	public String updateSinglefield(@PathVariable int n, @RequestBody Employee e) {
	    return es.updateSinglefield(n,e);
	}

    
    	
    
  }
