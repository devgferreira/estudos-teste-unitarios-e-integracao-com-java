package com.gabriel.ferreira.automatizacao_testes_com_java.objetos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SimpleMathTest {

    @Test
    void testSum_comValoresValidos_RetornadoSum() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double result = math.sum(firstNumber, secondNumber);
        Double espera = 8.2D;
        assertEquals(result, espera, () ->
                "testSum_comValoresValidos_RetornadoSum(), não fundionou da forma esperada. " + firstNumber + "+"
                        + secondNumber + " espera: "+ espera);
    }

    @Test
    void sub() {
    }

    @Test
    void mult() {
    }

    @Test
    void div() {
    }

    @Test
    void mean() {
    }
}