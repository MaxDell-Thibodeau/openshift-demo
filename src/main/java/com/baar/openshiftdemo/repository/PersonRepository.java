package com.baar.openshiftdemo.repository;

import com.baar.openshiftdemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person,Long> {
}
