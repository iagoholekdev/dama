package org.example.controller;

import org.example.helper.EntradasHelper;
import org.example.interfaces.DamaHandable;
import org.example.models.Entradas;
import org.example.responsibility.MesmaCasaHandler;
import org.example.responsibility.MesmaLinhaColunaHandler;
import org.example.responsibility.OutrosLugaresHandler;

import java.util.Scanner;

public class JogoDamaController {

    private final DamaHandable[] handlers;

    public JogoDamaController(DamaHandable[] handlers) {
        this.handlers = handlers;
    }

    public void jogar(Entradas entradas) {
        while (!entradas.isAllZeros()) {
            entradas.addJogadas(0);

            for (DamaHandable handler : handlers) {
                if (handler.handle(entradas)) {
                    entradas.addJogadas(handler.getMove());
                    break;
                }
            }
            System.out.println(entradas.printQuantidadeJogadas());
        }


    }

}
