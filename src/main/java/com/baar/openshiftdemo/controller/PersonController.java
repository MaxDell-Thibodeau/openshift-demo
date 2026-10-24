package com.baar.openshiftdemo.controller;

import com.baar.openshiftdemo.model.Person;
import com.baar.openshiftdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/save")
    public void savePerson(@RequestBody Person person) {
        personService.savePerson(person);

    }

    @GetMapping(value = "/")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }
}
