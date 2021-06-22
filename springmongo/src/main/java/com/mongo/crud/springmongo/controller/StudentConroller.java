package com.mongo.crud.springmongo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.crud.springmongo.entity.Address;
import com.mongo.crud.springmongo.entity.Student;
import com.mongo.crud.springmongo.repo.StudentRepo;

@RestController
public class StudentConroller {

	@Autowired
	StudentRepo repo;

	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	public @ResponseBody List<Student> ogetStudentList() {
		List<Student> ostudent = repo.findAll();
		return ostudent;
	}

	@RequestMapping(value = "/insertuser", consumes = "application/json", method = RequestMethod.POST)
	public boolean insertUser(@RequestBody Student ostudent) {
            
		System.out.println(ostudent.toString());
		repo.insert(ostudent);
		return true;

	}

	@RequestMapping(value = "/deleteuser", consumes = "application/json", method = RequestMethod.DELETE)
	public @ResponseBody String updatessUser(@RequestBody Student ostudent) {
		repo.delete(ostudent);
		return "Updated user";

	}

	@RequestMapping(value = "/updateuser", consumes = "application/json", method = RequestMethod.PUT)
	public @ResponseBody String deleteUser(@RequestBody Student ostudent) {
		repo.save(ostudent);
		return "updated user";

	}
	
	@RequestMapping(value = "/temptest", method = RequestMethod.GET)
	public @ResponseBody String testTemp() {
		
		Student oStudent=new Student();
		oStudent.setFirstName("OneMakes");
		oStudent.setLastName("checks");
		oStudent.setRooleNumber(34);
		
		List<Address> oaddress=new ArrayList<Address>();
		
		Address oAdress=new Address();
		oAdress.setAreCode("OneArea");
		oAdress.setPinCode("OnePinCode");
		oAdress.setPostalAddress("OnePostalCode");
		oaddress.add(oAdress);
		
		Address oAdresstwo=new Address();
		oAdresstwo.setAreCode("twoArea");
		oAdresstwo.setPinCode("TwoPincode");
		oAdresstwo.setPostalAddress("TwoPincode");
		oaddress.add(oAdresstwo);
		
		oStudent.setOaddress(oaddress);
		
		repo.save(oStudent);
		return "updated user";

	}
}
