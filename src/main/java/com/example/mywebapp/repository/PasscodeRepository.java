package com.example.mywebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mywebapp.model.Passcode;

public interface PasscodeRepository extends JpaRepository<Passcode, Integer> {
    // JpaRepository gives you all CRUD methods automatically
}
