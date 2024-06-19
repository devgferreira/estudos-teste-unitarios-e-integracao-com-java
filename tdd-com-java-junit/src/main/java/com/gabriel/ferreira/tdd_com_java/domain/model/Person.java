package com.gabriel.ferreira.tdd_com_java.domain.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private Long id;
   private String primeiroNome;
   private String segundoNome;
   private String email;
   private String endereco;
   private String genero;

    public Person(String primeiroNome, String segundoNome, String email, String endereco, String genero) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.email = email;
        this.endereco = endereco;
        this.genero = genero;
    }

    public Person(Long id, String primeiroNome, String segundoNome, String email, String endereco, String genero) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.email = email;
        this.endereco = endereco;
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(primeiroNome, person.primeiroNome) && Objects.equals(segundoNome, person.segundoNome) && Objects.equals(email, person.email) && Objects.equals(endereco, person.endereco) && Objects.equals(genero, person.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primeiroNome, segundoNome, email, endereco, genero);
    }
}
