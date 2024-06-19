package com.gabriel.ferreira.tdd_com_java.application.service;

import com.gabriel.ferreira.tdd_com_java.application.interfaces.IPersonService;
import com.gabriel.ferreira.tdd_com_java.domain.model.Person;

public class PersonService implements IPersonService {

    @Override
    public Person criarPerson(Person person) {

        return person;
    }
}
