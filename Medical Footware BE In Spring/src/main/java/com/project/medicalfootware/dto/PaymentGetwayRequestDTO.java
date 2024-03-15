package com.project.medicalfootware.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentGetwayRequestDTO {
    private Long CartNo;
    private String PaymentType;
    private String CardNo;
    private String UPIId;
}
