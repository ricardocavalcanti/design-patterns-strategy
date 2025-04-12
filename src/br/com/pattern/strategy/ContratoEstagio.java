package br.com.pattern.strategy;

public class ContratoEstagio implements Contrato {

    private double salarioEstagio() {
        return 2500;
    }

    @Override
    public double getRemuneracao() {
        return salarioEstagio();
    }

}
