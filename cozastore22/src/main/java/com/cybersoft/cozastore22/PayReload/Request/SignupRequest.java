package com.cybersoft.cozastore22.PayReload.Request;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

public class SignupRequest {
    @Length(min = 4, message = "độ dài của user name >= 4 kí tự")
    private String username;

    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,20}$")
    private String pass;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
