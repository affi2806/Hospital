package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HospitalModel;
import com.example.demo.service.HospitalService;


@RestController
public class HospitalController {
	
	@Autowired
	HospitalService serv;
	
	
	@PostMapping(value="/adduser")
	public HospitalModel AddUser(@RequestBody HospitalModel hos)
	{
		return serv.addUser(hos);
	}
	
	public List<HospitalModel> listAll()
	{
		return serv.getUser();
	}

	   @GetMapping(value="/fetchUsers")

	   public List<HospitalModel> getAllUsers()

	   {

		   List<HospitalModel>hosList=serv.getAllUsers();

		   return hosList;

	   }


	   @GetMapping(value="/sortUsers/{field}")

	   public List<HospitalModel>sortUsers(@PathVariable String field) 

	   { 

		   return serv.SortUsers(field);

	   }

	   //pagination

	   // http://localhost:8080/pageStudents/0/1

	   @GetMapping(value="/pagingUsers/{offset}/{pageSize}")
	   public List<HospitalModel> pagingUsers(@PathVariable int offset,@PathVariable int pageSize)

	   {

		   return serv.pagingUsers(offset, pageSize);

	   }
	   
	   
	   //http://localhost:8080?fetchhStudentsByNamePrefix?prefix=a
	    
	   @GetMapping(value="/pagingAndSorting/{offset}/{pagesize}/{field}")
	   public List<HospitalModel> PagingAndSorting(@PathVariable int offset, @PathVariable int pagesize, @PathVariable String field)
	   {
		   return serv.PagingAndSorting(offset, pagesize, field);
	   }

}
