package com.example.spring_security.student;

import org.springframework.security.access.prepost.PreAuthorize;
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

    /*
     * @PreAuthorize takes
     *
     * hasRole()
     * hasAnyRole()
     * hasAuthority()
     * hasAnyAuthority()
     *
     * */

    @GetMapping()
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMIN_TRAINEE')")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping()
    @PreAuthorize("hasAuthority('student:write')")
    public void registerStudent(@RequestBody Student student) {
        System.out.println("Register student " + student);
    }

    @DeleteMapping("/{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudent(@PathVariable int studentId, @RequestBody Student student) {
        System.out.println("Delete student id: " + studentId + " " + student);
    }

    @PutMapping("/{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(@PathVariable int studentId, @RequestBody Student student) {
        System.out.println("Update student id: " + studentId + " " + student);
    }
}
