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
    @Test
    void testCriarPerson_ComSucessoSeTodosOsAtributosForemValidos_RetornandoPerson(){
        //Given / Arrange
        IPersonService _personService = new PersonService();


        // When / Act
        Person result = _personService.criarPerson(PERSON_VALIDA);

        //Then / Assert
        assertEquals(result.getPrimeiroNome(), PERSON_VALIDA.getPrimeiroNome(), () -> "O primerio nome é diferente.");
        assertEquals(result.getSegundoNome(), PERSON_VALIDA.getSegundoNome(), () -> "O primerio segundo é diferente.");
        assertEquals(result.getEndereco(), PERSON_VALIDA.getEndereco(), () -> "O endereço é diferente.");
        assertEquals(result.getEmail(), PERSON_VALIDA.getEmail(), () -> "O email é diferente.");
        assertEquals(result.getGenero(), PERSON_VALIDA.getGenero(), () -> "O genero é diferente.");
    }

}