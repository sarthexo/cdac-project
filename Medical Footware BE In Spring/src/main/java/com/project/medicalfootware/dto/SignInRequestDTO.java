package com.project.medicalfootware.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class SignInRequestDTO {
    private String userName;
    private String password;
    private String role;
}
