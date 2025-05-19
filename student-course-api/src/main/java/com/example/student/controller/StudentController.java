package com.example.student.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.student.entity.Course;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.addStudent(student));
    }

    @PostMapping("/courses")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        return ResponseEntity.ok(studentService.addCourse(course));
    }

    @PostMapping("/students/{studentId}/enroll/{courseId}")
    public ResponseEntity<String> enroll(@PathVariable Long studentId, @PathVariable Long courseId) {
        studentService.enrollStudent(studentId, courseId);
        return ResponseEntity.ok("Enrollment successful");
    }

    @GetMapping("/students/{studentId}/courses")
    public ResponseEntity<Set<Course>> getCourses(@PathVariable Long studentId) {
        return ResponseEntity.ok(studentService.getStudentCourses(studentId));
    }
}
