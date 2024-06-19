package com.gabriel.ferreira.tdd_com_java.application.service;

import com.gabriel.ferreira.tdd_com_java.application.interfaces.IPersonService;
import com.gabriel.ferreira.tdd_com_java.domain.model.Person;
import static com.gabriel.ferreira.tdd_com_java.common.PersonContants.PERSON_VALIDA;
import lombok.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonServiceTest {
    @Test
    void testCriarPerson_ComPersonValida_RetornandoPerson(){
        //Given / Arrange
        IPersonService _personService = new PersonService();

        // When / Act
       Person result = _personService.criarPerson(PERSON_VALIDA);

        //Then / Assert
        assertEquals(result, PERSON_VALIDA, () -> "O criarPerson(), não retornou uma Person.");
    }
    @Test
    void testCriarPerson_ComSucessoSeConterPimerioNome_RetornandoPerson(){
        //Given / Arrange
        IPersonService _personService = new PersonService();


        // When / Act
        Person result = _personService.criarPerson(PERSON_VALIDA);

        //Then / Assert
        assertEquals(result.getPrimeiroNome(), PERSON_VALIDA.getPrimeiroNome(), () -> "O primerio nome é diferente.");
    }

}