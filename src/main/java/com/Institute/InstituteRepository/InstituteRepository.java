package com.Institute.InstituteRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Institute.InstituteEntity.InstituteEntity;



public interface InstituteRepository extends JpaRepository<InstituteEntity, Integer> {
	
	

	@Query ("select i from InstituteEntity i where i.name =:name")
	
	List<InstituteEntity> getName(@Param("name")  String name);
	

	@Query ("select i from InstituteEntity i where i.fees =:fees")
	
	List<InstituteEntity> getName1(@Param("fees")  int fees);

	
    @Query ("select i from InstituteEntity i where i.id =:id")
 	List<InstituteEntity> getid(@Param("id")  int id);


	List<InstituteEntity> getid(int a, int b);
	

}
