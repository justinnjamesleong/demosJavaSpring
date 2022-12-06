package com.example.demo2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo2.model.Person;

@Service
public class PersonService{
    private List<Person> persons = new ArrayList<Person>();
    
    public PersonService(){
        persons.add(new Person("Mark","Kwan"));
        persons.add(new Person("Eddie","Kwan"));
    }

    public List<Person> getPersons(){

    return this.persons;
    }

    public void addPerson(Person newPerson){
        persons.add(new Person(newPerson.getFirstName(),newPerson.getLastName()));
    }

    public void removePerson(Person personToDelete)
    {Person foundPerson=persons.stream().filter(p->p.getId().equals(personToDelete.getId())).findAny().orElse(null);
    persons.remove(foundPerson);
    }

    public void updatePerson(Person personToUpdate)
    {Person foundPerson=persons.stream().filter(p->p.getId().equals(personToUpdate.getId())).findAny().orElse(null);
    Person updatePerson= new Person();
    updatePerson.setId(foundPerson.getId());
    updatePerson.setFirstName(personToUpdate.getFirstName());
    updatePerson.setFirstName(personToUpdate.getLastName());
    persons.remove(foundPerson);
    persons.add(updatePerson);
    }
    }
