package org.example;

import org.example.controller.JogoDamaController;
import org.example.helper.EntradasHelper;
import org.example.interfaces.DamaHandable;
import org.example.models.Entradas;
import org.example.responsibility.MesmaCasaHandler;
import org.example.responsibility.MesmaLinhaColunaHandler;
import org.example.responsibility.OutrosLugaresHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner xValues = new Scanner(System.in)) {
            DamaHandable[] handlers = {
                    new MesmaCasaHandler(),
                    new MesmaLinhaColunaHandler(),
                    new OutrosLugaresHandler()
            };

            EntradasHelper entradasHelper = new EntradasHelper();
            entradasHelper.addScanner(xValues);

            JogoDamaController jogoDamaController = new JogoDamaController(handlers);
            while (entradasHelper.hasMoreInputs()) {
                Entradas entradas = entradasHelper.readEntradas();
                jogoDamaController.jogar(entradas);
            }
        }

    }

}