package com.joy.springbootplayground.api;

import com.joy.springbootplayground.model.Person;
import com.joy.springbootplayground.service.PersonService;

public class PersonController {
    
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        this.personService.addPerson(person);
    }
}
