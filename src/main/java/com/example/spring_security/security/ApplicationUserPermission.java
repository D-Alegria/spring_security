package com.example.spring_security.security;

import lombok.Getter;

/**
 * Created by Demilade Oladugba on 2/25/2022
 **/

@Getter
public enum ApplicationUserPermission {
    STUDENT_WRITE("student:write"),
    STUDENT_READ("student:read"),
    COURSE_WRITE("course:write"),
    COURSE_READ("course:read");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
}
