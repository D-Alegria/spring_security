package com.example.spring_security.jwt;

import lombok.Data;

/**
 * Created by Demilade Oladugba on 3/21/2022
 **/

@Data
public class UsernameAndPasswordAuthenticationRequest {

    private String username;
    private String password;
}
