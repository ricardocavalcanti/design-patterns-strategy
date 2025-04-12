package br.com.pattern;

import br.com.pattern.service.FolhaPagamento;
import br.com.pattern.strategy.ContratoClt;
import br.com.pattern.strategy.ContratoEstagio;
import br.com.pattern.strategy.ContratoPj;

public class Main {

    public static void main(String[] args) {

        FolhaPagamento folha = new FolhaPagamento();

        ContratoClt clt = new ContratoClt();
        ContratoPj pj = new ContratoPj();
        ContratoEstagio estagio = new ContratoEstagio();

        System.out.println("Valor contrato CLT: " + folha.gerar(clt));
        System.out.println("Valor contrato PJ: " + folha.gerar(pj));
        System.out.println("Valor contrato ESTAGIO: " + folha.gerar(estagio));
    }

}