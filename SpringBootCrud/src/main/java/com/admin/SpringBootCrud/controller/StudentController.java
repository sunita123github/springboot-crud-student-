package com.admin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.admin.SpringBootCrud.bean.Student;
import com.admin.SpringBootCrud.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		return studentservice.getAllStudents();
	}
    
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student)
	{
		studentservice.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{id},{name},{city},{contry}")
	public void updateStudent(@RequestBody Student student)
	{
		studentservice.updateStudent("id","name","city","contry", student);
	}
	
	public void DeleteSubject(@PathVariable String id) 
	{
		studentservice.deleteStudent(id);
	}
}
