package com.example.demo2.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
public class Person {

    private String id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.id = UUID.randomUUID().toString().substring(0,8);
        
        this.lastName=lastName;
    }

    public Person(String id, String firstName,String lastName)
    {this.id=id;
    this.firstName=firstName;
this.lastName=lastName;}

    
}
