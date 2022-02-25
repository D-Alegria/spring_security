package com.example.spring_security.security;


import com.google.common.collect.Sets;
import lombok.Getter;

import java.util.Set;

import static com.example.spring_security.security.ApplicationUserPermission.*;

/**
 * Created by Demilade Oladugba on 2/25/2022
 **/

@Getter
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
