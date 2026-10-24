package com.baar.openshiftdemo.service;

import com.baar.openshiftdemo.model.Person;
import com.baar.openshiftdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public void savePerson(Person person) {
        personRepository.save(person);

    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElseThrow();
    }
}
