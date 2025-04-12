package br.com.pattern.service;

import br.com.pattern.strategy.Contrato;

public class FolhaPagamento {

    private final CalculoFolhaPagamento calculoFolhaPagamento = new CalculoFolhaPagamento();

    public double gerar(Contrato contrato){
        return calculoFolhaPagamento.calcular(contrato);
    }
}
