package com.project.medicalfootware.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ProductUserRequestDTO {
    private Long productID;
    private Long userID;
}
