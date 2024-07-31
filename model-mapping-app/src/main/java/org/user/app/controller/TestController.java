package org.user.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.user.app.entities.Teacher;
import org.user.app.repository.StudentRepository;
import org.user.app.repository.TeacherRepository;

@RestController
public class TestController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@PostMapping("/teacher")
	public Teacher addTeacherInfo(@RequestBody Teacher teacher)
	{
		return this.teacherRepository.save(teacher);
	}
}
