package com.yoga.admission.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yoga.admission.entity.Students;

@Repository
public interface StudentRepository extends CrudRepository<Students, Long> {

}
