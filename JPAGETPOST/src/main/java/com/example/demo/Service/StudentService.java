package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentEntity;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveinfo(StudentEntity ss)
	{
		return sr.save(ss);
	}
	public List<StudentEntity> showinfo()
	{
		return sr.findAll();
	}
	
	
	
	
}
