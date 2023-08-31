package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SignUp;

import com.example.demo.service.UserService;

@RestController
public class UserController {
@Autowired
UserService uss;
@PostMapping("addDetails")
public SignUp addDetail(@RequestBody SignUp ud) {
	return uss.saveInfo(ud);
}
@PostMapping("addnUser")
public List<SignUp> addn(@RequestBody List<SignUp> ud){
	return (List<SignUp>)uss.savenInfo(ud);
}
@GetMapping("showDetails")
public List<SignUp> showDetail(){
	return uss.showInfo();
}
 
//delete by id using RequestParam
@DeleteMapping("deletebyParam")
public String deleteMyIdByParam(@RequestParam long phoneNumber) {
	 uss.deleteparamid(phoneNumber);
	 return "Deleted Successfully";

}
@PutMapping("updatebyid/{phoneNumber}")
public String modifybyid(@PathVariable long phoneNumber,@RequestBody SignUp ss) {
	 return uss.updateinfobyid(phoneNumber, ss);
 }
//sorting
	@GetMapping("disp/{field}")
	public List<SignUp> getSort(@PathVariable String field){
		return uss.sortInfo(field);
	}
	//paging
	@GetMapping("paging/{pageno}/{pagesize}")
	 public List<SignUp>showpageinfo(@PathVariable int pageno,@PathVariable int pagesize){
	 return uss.getbypage(pageno,pagesize);
}
	@GetMapping ("showquery/{mobileno}/{name}") 
	public List<SignUp>showstudetails(@PathVariable long mobileno,@PathVariable String name){
		 return uss.getstu(mobileno, name);
	}
	@DeleteMapping("deletequery/{name}")
	public String delstudetails(@PathVariable String name) {
		 return uss.delstu(name)+"deleted";
	}
	@PutMapping("updatequery/{newpwd}/{oldpwd}")
	public String updatestudetails(@PathVariable String newpwd,@PathVariable String oldpwd) {
		 return uss.updatestu(newpwd, oldpwd)+"updated";
	}
}