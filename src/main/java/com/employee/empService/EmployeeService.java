package com.employee.empService;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;

import com.employee.empDao.EmployeeDao;
import com.employee.empEntity.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao ed;
	
	
	
	 public List<Employee> postSingleObject() {
	    	
	        return ed.postSingleObject();
	    }
	 
	 
	 public String deleteSingleObject(@PathVariable int s){
	    	
	    	return ed.deleteSingleObject(s);
	 }
	    	
	 public String deleteFullObject(){
	       	
	        	return ed.deleteFullObject();
	        	
	 }
	 
	 public String updateObject( int n ,  Employee e)
	 {
	        	    	
	        	 return ed.updateObject(n,e);
	  }
	    	
	 
	 public String updateSinglefield( int n,  Employee e) {
		    return ed.updateSinglefield(n,e);
		}
 

	 
	 

}


