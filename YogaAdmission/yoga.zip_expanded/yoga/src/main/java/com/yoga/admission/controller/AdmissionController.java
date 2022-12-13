package com.yoga.admission.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoga.admission.entity.Students;
import com.yoga.admission.service.StudentService;

@RestController
public class AdmissionController {
	@Autowired
	private StudentService services;
	@GetMapping("/")//getall
	public Iterable<Students>getStudents()
	{
		return services.listAll();    
	}
	 
	@PostMapping(value = "/save")
	private long saveBook(@RequestBody Students students)  
	{  
		services.saveOrUpdate(students);  
		return  students.getId();  
	}
	  
	@RequestMapping("/student/{id}")  
	private Students getBooks(@PathVariable(name = "id") int studentid) {  
		return services.getStudentById(studentid);  
	}  
	    
//	@PutMapping("/edit/{id}")
//	 
//	    private Students update(@RequestBody Students students)  
//	    {  
//		   services.saveOrUpdate(students);  
//		       return students;  
//	    }  
	 
//	@DeleteMapping("/delete/{id}")  
//	private void deleteStudent(@PathVariable("id") int id)  
//	{  
//	services.delete(id);  
//	}  
}
