package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService sser;
	
	@PostMapping("addstudent")
	public StudentEntity add(@RequestBody StudentEntity ss)
	{
		return sser.saveinfo(ss);
	}
	@GetMapping("showdetails")
	public List<StudentEntity> show()
	{
		return sser.showinfo();
	}
}
