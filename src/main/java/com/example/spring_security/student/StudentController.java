package com.example.spring_security.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Demilade Oladugba on 2/24/2022
 **/

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private static final List<Student> students = Arrays.asList(
            new Student(1, "Demilade Oladugba"),
            new Student(2, "Temilade Oladugba"),
            new Student(3, "Toluwalase Oladugba")
    );

    @GetMapping(value = "{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student with id: " + id + " not found"));
    }
}
