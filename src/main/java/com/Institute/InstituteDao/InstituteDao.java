package com.Institute.InstituteDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.Institute.InstituteEntity.InstituteEntity;
import com.Institute.InstituteException.IdnotfoundException;
import com.Institute.InstituteException.InstituteException;
import com.Institute.InstituteException.feesnotfoundException;
import com.Institute.InstituteRepository.InstituteRepository;

@Repository
public class InstituteDao {
	
	@Autowired
	InstituteRepository ir;
	
public String postvalues(InstituteEntity i) {
		
	     ir.save(i);
	     
		return "Post successfull";
		 
		 
	}

public String postMapping1( List<InstituteEntity> i) {
	
	ir.saveAll(i);
	
	return "List of Object Post Successfull";
}

public List<InstituteEntity> getName(@PathVariable String name) throws InstituteException{
	return ir.getName(name);
}

public List<InstituteEntity> getName1(@PathVariable int fees) throws feesnotfoundException{
	return ir.getName1(fees);
}

public List<InstituteEntity> getid(int id) throws IdnotfoundException{
	return ir.getid(id);
}

public List<InstituteEntity> getid(@PathVariable int a,@PathVariable int b){
	
	
	return ir.getid(a,b);
}



}
