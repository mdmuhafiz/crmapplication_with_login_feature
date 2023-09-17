package com.crmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmapp.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
