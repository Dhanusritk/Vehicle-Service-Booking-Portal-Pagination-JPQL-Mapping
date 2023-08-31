package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.SignUp;

import jakarta.transaction.Transactional;

public interface UserDetailsRepo extends JpaRepository<SignUp, Long> {
	//select
	@Query(value="select * from signupdetails where mobileno=:s or name=:sn",nativeQuery=true)
	public List<SignUp>getStudentInfo(@Param("s")long id,@Param("sn")String name);
	//delete
	@Modifying
	@Transactional
	
//	@Query(value="delete from signupdetails where name=:s",nativeQuery=true)
//	public int deleteStudentInfo(@Param("s")String d);
	@Query(value="delete from Servicedetails where registrationnumber=:s",nativeQuery=true)
	public int deleteStudentInfo(@Param("s")String d);
	//update
	@Modifying
	@Transactional
	
	@Query(value="update signupdetails set password=?1 where password=?2",nativeQuery=true)
	public int updateStudentInfo(String newid,String oldid);
}