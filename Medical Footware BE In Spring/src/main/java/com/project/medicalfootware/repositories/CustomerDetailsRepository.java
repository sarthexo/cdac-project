package com.project.medicalfootware.repositories;

import com.project.medicalfootware.models.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {
    Optional<CustomerDetails> getCustomerDetailsByUserID(Long userId);

    CustomerDetails getSingleCustomerDetailsByUserID(Long userId);
}
