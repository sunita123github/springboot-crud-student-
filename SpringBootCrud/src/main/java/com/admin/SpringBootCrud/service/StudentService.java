package com.admin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.SpringBootCrud.bean.Student;
import com.admin.SpringBootCrud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository StudentRepo;

	public List<Student> getAllStudents()
	{
		List<Student>students = new ArrayList<>();
		StudentRepo.findAll().forEach(students::add);
		return students;
		
	}
	
	public void addStudent(Student student) {
		
		StudentRepo.save(student);
	}

	public void updateStudent(String string, Student student) {
		
		StudentRepo.save(student);
	}

	public void deleteStudent(String id) {
		
		StudentRepo.deleteById(id);
	}

	public void updateStudent(String string, String string2, String string3, String string4, Student student) {
		StudentRepo.save(student);
		
		
	}
	
	
}
