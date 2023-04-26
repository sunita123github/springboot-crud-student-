package com.admin.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.admin.SpringBootCrud.bean.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

	

}
