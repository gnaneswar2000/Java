package com.example.student.service;

import org.springframework.stereotype.Service;

import com.example.student.entity.Course;
import com.example.student.entity.Student;
import com.example.student.repository.CourseRepository;
import com.example.student.repository.StudentRepository;

import java.util.Set;

@Service
public class StudentService {
    private final StudentRepository studentRepo;
    private final CourseRepository courseRepo;

    public StudentService(StudentRepository studentRepo, CourseRepository courseRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    public void enrollStudent(Long studentId, Long courseId) {
        Student student = studentRepo.findById(studentId).orElseThrow();
        Course course = courseRepo.findById(courseId).orElseThrow();
        student.getCourses().add(course);
        studentRepo.save(student);
    }

    public Set<Course> getStudentCourses(Long studentId) {
        return studentRepo.findById(studentId).orElseThrow().getCourses();
    }
}
