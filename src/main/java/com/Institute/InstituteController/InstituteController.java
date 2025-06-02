package com.Institute.InstituteController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Institute.InstituteEntity.InstituteEntity;
import com.Institute.InstituteException.IdnotfoundException;
import com.Institute.InstituteException.InstituteException;
import com.Institute.InstituteException.feesnotfoundException;
import com.Institute.InstituteService.InstituteService;

@RestController
public class InstituteController {
	
	@Autowired
	InstituteService ic;
	
	@PostMapping(value ="/post")
	public String postvalues(@RequestBody InstituteEntity i) {
		
		return ic.postvalues(i);
	}
	
	
	@PostMapping(value ="/postValues1")
	public String postMapping1(@RequestBody List<InstituteEntity> i) {
		
		return ic.postMapping1(i);
	}
	
	@GetMapping(value ="/getName/{name}")
	public List<InstituteEntity> getName(@PathVariable String name) throws InstituteException{
		return ic.getName(name);
	}
	
	@GetMapping(value ="/getfees/{fees}")
	public List<InstituteEntity> getName1(@PathVariable int fees) throws feesnotfoundException{
		return ic.getName1(fees);
	}
	
	@GetMapping(value ="/getid/{id}")
	public List<InstituteEntity> getid(@PathVariable int id) throws IdnotfoundException{
		return ic.getid(id);
	}
	
	@GetMapping(value ="/getnum/{a}/{b}")
	
	public List<InstituteEntity> getid(@PathVariable int a,@PathVariable int b){
		return ic.getid(a,b);
	}

}
