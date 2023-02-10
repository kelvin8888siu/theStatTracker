package com.theStatTracker.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

public class AuthenticationRequest {

    private String email;
    private String password;


    public AuthenticationRequest() {
    }

    public AuthenticationRequest(@NonNull String email, @NonNull String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthenticationRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
