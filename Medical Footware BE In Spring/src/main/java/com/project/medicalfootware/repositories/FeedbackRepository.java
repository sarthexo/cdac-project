package com.project.medicalfootware.repositories;

import com.project.medicalfootware.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
