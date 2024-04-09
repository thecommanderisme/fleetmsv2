package com.prog.fleetmsv2.parameters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prog.fleetmsv2.parameters.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
