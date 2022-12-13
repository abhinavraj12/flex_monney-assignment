package com.yoga.admission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoga.admission.entity.Students;
import com.yoga.admission.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
    private StudentRepository repo;
	
	public Iterable<Students> listAll() {
        return this.repo.findAll();
    }
	
	public void saveOrUpdate(Students students){  
		repo.save(students);  
	}
	public Students getStudentById(long id){  
		return repo.findById(id).get();  
	}
	
}
