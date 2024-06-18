package com.gabriel.ferreira.automatizacao_testes_com_java.domain.model;

public class SimpleMath {
    public Double sum(Double fisrtNumber, Double secondNumber){
        return fisrtNumber + secondNumber;
    }
    public Double sub(Double fisrtNumber, Double secondNumber){
        return fisrtNumber - secondNumber;
    }
    public Double mult(Double fisrtNumber, Double secondNumber){
        return fisrtNumber * secondNumber;
    }
    public Double div(Double fisrtNumber, Double secondNumber){
        return fisrtNumber / secondNumber;
    }
    public Double mean(Double fisrtNumber, Double secondNumber){
        return (fisrtNumber + secondNumber) /2;
    }


}
