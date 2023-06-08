package com.hbsmoura.springdatarestlearning.repository;

import com.hbsmoura.springdatarestlearning.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "collaborators")
public interface PersonRepository extends JpaRepository<Person, Long> {
}
