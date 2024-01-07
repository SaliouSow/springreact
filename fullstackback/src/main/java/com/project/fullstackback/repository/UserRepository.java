package com.project.fullstackback.repository;

import com.project.fullstackback.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
