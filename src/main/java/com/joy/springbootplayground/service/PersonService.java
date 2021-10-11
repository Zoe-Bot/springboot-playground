package com.joy.springbootplayground.service;

import com.joy.springbootplayground.dao.PersonDao;
import com.joy.springbootplayground.model.Person;

public class PersonService {
    
    private final PersonDao personDao;
    
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
