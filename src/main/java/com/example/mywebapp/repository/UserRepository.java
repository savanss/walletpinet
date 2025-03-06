package com.example.mywebapp.repository; // update package if needed

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mywebapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
