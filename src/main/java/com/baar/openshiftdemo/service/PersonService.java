package com.baar.openshiftdemo.service;

import com.baar.openshiftdemo.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    public void savePerson(Person person);
    public List<Person> getAllPersons();
    public Person getPersonById(Long id);

}
