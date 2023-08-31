package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.demo.model.SignUp;

import com.example.demo.repository.UserDetailsRepo;

@Service
public class UserService {
	@Autowired
UserDetailsRepo ur;
public SignUp saveInfo(SignUp ud) {
	return ur.save(ud);
}
public List<SignUp> showInfo(){
	return ur.findAll();
}
//save a list of info
public List<SignUp> savenInfo(List<SignUp> ss){
	return (List<SignUp>)ur.saveAll(ss);
}

//delete by id using requestparam
public void deleteparamid(long phoneNumber) {
	ur.deleteById(phoneNumber);
}

//update by id
public String updateinfobyid(long phoneNumber,SignUp ss) {
	ur.saveAndFlush(ss);
	if(ur.existsById(phoneNumber))
		return "updated successfully";
		else
			return "enter valid phoneNumber";
}
//sorting
public List<SignUp> sortInfo(String s){
	return ur.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
}
//paging
public List<SignUp>getbypage(int pgno, int pgsize){
Page<SignUp> p= ur.findAll(PageRequest.of(pgno, pgsize));
return p.getContent();
}

public List<SignUp>getstu(long i,String s){
	return ur.getStudentInfo(i, s);
}
public int delstu(String name) {
	return ur.deleteStudentInfo(name);
}
public int updatestu(String pwd1 ,String pwd2) {
	return ur.updateStudentInfo(pwd1, pwd2);
}

}