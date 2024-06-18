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
    void testSub_comValoresValiods_RetornadoSub() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double result = math.sub(firstNumber, secondNumber);
        Double espera = 4.2D;
        assertEquals(result, espera, () ->
                "testSum_comValoresValidos_RetornadoSum(), não fundionou da forma esperada. " + firstNumber + "-"
                        + secondNumber + " espera: "+ espera);
    }

    @Test
    void testMult_comValoresValiods_RetornadoMult() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6D;
        Double secondNumber = 2D;
        Double result = math.mult(firstNumber, secondNumber);
        Double espera = 12D;
        assertEquals(result, espera, () ->
                "testSum_comValoresValidos_RetornadoSum(), não fundionou da forma esperada. " + firstNumber + "*"
                        + secondNumber + " espera: "+ espera);
    }

    @Test
    void testDiv_comValoresValiods_RetornadoDiv() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6D;
        Double secondNumber = 2D;
        Double result = math.div(firstNumber, secondNumber);
        Double espera = 3D;
        assertEquals(result, espera, () ->
                "testSum_comValoresValidos_RetornadoSum(), não fundionou da forma esperada. " + firstNumber + "/"
                        + secondNumber + " espera: "+ espera);
    }

    @Test
    void testMean_comValoresValiods_RetornadoMean() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6D;
        Double secondNumber = 2D;
        Double result = math.mean(firstNumber, secondNumber);
        Double espera = 4D;
        assertEquals(result, espera, () ->
                "testSum_comValoresValidos_RetornadoSum(), não fundionou da forma esperada. " + "(" + firstNumber + "+"
                        + secondNumber + ")" + "/2"+ " espera: "+ espera);
    }
}