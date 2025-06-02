package com.Institute.InstituteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Institute.InstituteDao.InstituteDao;
import com.Institute.InstituteEntity.InstituteEntity;
import com.Institute.InstituteException.IdnotfoundException;
import com.Institute.InstituteException.InstituteException;
import com.Institute.InstituteException.feesnotfoundException;

@Service
public class InstituteService {
	
	@Autowired
	InstituteDao is;
	
    public String postvalues(InstituteEntity i) {
		
		return is.postvalues(i);
	}
    
	public String postMapping1( List<InstituteEntity> i) {
		
		return is.postMapping1(i);
	}
	
	public List<InstituteEntity> getName(@PathVariable String name) throws InstituteException{
		
		if(is.getName(name).isEmpty()) {
			
			throw new InstituteException("The name is not in DataBase");
		}
		else {
		return is.getName(name);
		}
	}
	
public List<InstituteEntity> getName1(@PathVariable int fees) throws feesnotfoundException{
		
		if(is.getName1(fees).isEmpty()) {
			
			throw new feesnotfoundException("The fees is not in DataBase");
		}
		else {
		return is.getName1(fees);
		}
	}


public List<InstituteEntity> getid(int id) throws IdnotfoundException{
	
	if(is.getid(id).isEmpty()) {
		
		throw new IdnotfoundException("The ID is not in DataBase");
	}
	else {
	return is.getid(id);
}


}

public List<InstituteEntity> getid(int a, int b){
	
	
	return is.getid(a,b);
}

}