package br.com.pattern.strategy;

public class ContratoClt implements Contrato {

    private double salarioClt() {
        return 5000;
    }

    @Override
    public double getRemuneracao() {
        return salarioClt();
    }

}
