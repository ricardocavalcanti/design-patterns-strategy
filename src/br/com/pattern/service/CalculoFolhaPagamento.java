package br.com.pattern.service;

import br.com.pattern.strategy.Contrato;

public class CalculoFolhaPagamento {

    public double calcular(Contrato contrato) {
        return contrato.getRemuneracao();
    }

}
