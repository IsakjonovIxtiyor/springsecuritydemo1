package com.example.springsecuritydemo1.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqSignUp {
    private String password;
    private String username;
    private String phoneNumber;

    public ReqSignUp(String password, String phoneNumber) {
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
