package com.prog.fleetmsv2.parameters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prog.fleetmsv2.parameters.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
