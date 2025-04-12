package br.com.pattern.strategy;

public class ContratoPj implements Contrato {

    private double salarioEstagio() {
        return 10000;
    }

    @Override
    public double getRemuneracao() {
        return salarioEstagio();
    }

}
