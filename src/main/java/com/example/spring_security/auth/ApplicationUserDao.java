package com.example.spring_security.auth;

import java.util.Optional;

/**
 * Created by Demilade Oladugba on 3/21/2022
 **/

public interface ApplicationUserDao {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
