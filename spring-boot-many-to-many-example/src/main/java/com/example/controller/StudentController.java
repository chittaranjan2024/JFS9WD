package com.example.controller;

import com.example.entity.Student;
import com.example.entity.Course;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
    }

    @PostMapping("/{studentId}/courses")
    public Student addCourse(@PathVariable Long studentId, @RequestBody Course course) {
        return studentService.addCourse(studentId, course);
    }

    @DeleteMapping("/{studentId}/courses/{courseId}")
    public Student removeCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
        return studentService.removeCourse(studentId, courseId);
    }
}