package com.employee.empDao;

import java.util.List;
import java.util.Optional;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;

import com.employee.empRepository.EmployeeRepository;
import com.employee.empEntity.Employee;


@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository er;
	

	
	
	
    public Employee postSingleObject(@PathVariable int e) {
    	
    	return er.findById(e).get();
    	
         
    }
    
   public List<Employee> postSingleObject() {
    	
    	return er.findAll();
   }
    	
    public String deleteSingleObject(@PathVariable int s){
 	    	
 	    	 er.deleteById(s);
 	    	 
 	    	 return "Deleted Successfull";

    }
    
    public String deleteFullObject(){
    	
    	
         er.deleteAll();
    	
    	return "Deleted Successfull";
    	
	}
    
  public String updateObject( int n , Employee e) {
    	
	  Employee x =er.findById(n).get();
	  
         x.setName(e.getName());
         x.setSalary(e.getSalary());
         x.setGender(e.getGender());
         x.setExperience(e.getExperience());
         x.setRole(e.getRole());
    	 er.save(x);
    	 
     return "Update Successfull";
    }
  
  public String updateSinglefield( int n,  Employee name) {
	    Employee x =er.findById(n).get();
	    x.setName(name.getName());;
	    er.save(x);
	    
	    return "Name Update Successfull";
	}


}

