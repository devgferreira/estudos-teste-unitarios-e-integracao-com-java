package com.gabriel.ferreira.tdd_com_java.application.service;

import com.gabriel.ferreira.tdd_com_java.application.interfaces.IPersonService;
import com.gabriel.ferreira.tdd_com_java.domain.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    @Test
    void testCriarPerson_ComPersonValida_RetornandoPerson(){
        //Given / Arrange
        IPersonService _personService = new PersonService();
        Person person = new Person(
                "Gabriel",
                "Moon",
                "gabi@gmail.com",
                "Rua - SP",
                "M"
        );

        // When / Act
       Person result = _personService.criarPerson(person);

        //Then / Assert
        assertEquals(result, person, () -> "O criarPerson(), não retornou uma Person.");
    }

}