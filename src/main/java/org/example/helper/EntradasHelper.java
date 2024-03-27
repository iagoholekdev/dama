package org.example.helper;

import org.example.models.Entradas;

import java.util.Scanner;

public class EntradasHelper {

    private Scanner scanner;

    public EntradasHelper addScanner(Scanner scanner) {
        this.scanner = scanner;
        return this;
    }
    public Entradas readEntradas() {
        int x1 = this.scanner.nextInt();
        int y1 = this.scanner.nextInt();
        int x2 = this.scanner.nextInt();
        int y2 = this.scanner.nextInt();
        return new Entradas(x1, y1, x2, y2);
    }

    public boolean hasMoreInputs() {
        return scanner.hasNextInt();
    }

}
