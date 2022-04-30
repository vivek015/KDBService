package com.kedb.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignUpDto {
    private String username;
    private String email;
    private String mobile;
    private String password;
    private String role;
}
