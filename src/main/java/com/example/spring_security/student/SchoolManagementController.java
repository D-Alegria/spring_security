package com.example.spring_security.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Demilade Oladugba on 3/5/2022
 **/

@RestController
@RequestMapping("/management/api/v1/student")
public class SchoolManagementController {

    private static final List<Student> students = Arrays.asList(new Student(1, "Demilade Oladugba"), new Student(2, "Temilade Oladugba"), new Student(3, "Toluwalase Oladugba"));

    @GetMapping()
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping()
    public void registerStudent(@RequestBody Student student) {
        System.out.println("Register student " + student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable int studentId, @RequestBody Student student) {
        System.out.println("Delete student id: " + studentId + " " + student);
    }

    @PutMapping("/{studentId}")
    public void updateStudent(@PathVariable int studentId, @RequestBody Student student) {
        System.out.println("Update student id: " + studentId + " " + student);
    }
}
