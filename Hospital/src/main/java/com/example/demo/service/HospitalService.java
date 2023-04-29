package com.example.demo.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.model.HospitalModel;
import com.example.demo.repository.HospitalRepository;


@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hep;
	
	public HospitalModel addUser(HospitalModel hos)
	{
		return hep.save(hos);
	}
	public List<HospitalModel> getUser()
	{
		return hep.findAll();
	}
	
	public List<HospitalModel> getAllUsers()

	 {

		 List<HospitalModel>hosList=hep.findAll();

		 return hosList;

	 }

	 public HospitalModel saveUser(HospitalModel s)

	 {

		 HospitalModel obj=hep.save(s);

		 return obj;

	 }

	 public List<HospitalModel> SortUsers(String field) 

	 {

		   return hep.findAll(Sort.by(field));

	 } 

	 public List<HospitalModel> pagingUsers(int offset,int pageSize) 

	 {

		   Pageable paging=PageRequest.of(offset,pageSize);

		   Page<HospitalModel> hosData=hep.findAll(paging);

		   List<HospitalModel>hosList=hosData.getContent(); 

		   return hosList;

	 }
	 
	 public List<HospitalModel> PagingAndSorting(int offset,int pagesize,String field)
	 {
		 Pageable paging=PageRequest.of(pagesize, pagesize).withSort(Sort.by(field));
		 Page<HospitalModel> stud=hep.findAll(paging);
		 return stud.getContent();
	 }
	

}
