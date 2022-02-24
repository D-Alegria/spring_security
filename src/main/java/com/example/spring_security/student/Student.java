package com.example.spring_security.student;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by Demilade Oladugba on 2/24/2022
 **/

@Data
@RequiredArgsConstructor
public class Student {
    private final int id;
    private final String name;
}
