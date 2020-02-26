package com.example.security.common;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

//@Component
public class UserAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username= (String) authentication.getPrincipal();
        String password= (String) authentication.getCredentials();
        System.out.println(username+ "#"+password);
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
