package com.project.medicalfootware.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingRequestDTO {
    private Long cardID;
    private Double Rating;
}
