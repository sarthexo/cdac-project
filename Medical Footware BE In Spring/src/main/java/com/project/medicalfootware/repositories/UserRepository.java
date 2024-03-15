package com.project.medicalfootware.repositories;

import com.project.medicalfootware.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
    //User findByUserID(Long userId);
}
