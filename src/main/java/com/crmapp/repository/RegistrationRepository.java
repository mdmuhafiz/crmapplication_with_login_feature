package com.crmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmapp.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

	Registration findByEmail(String email);

}
