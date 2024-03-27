package org.example.models;

import java.util.Objects;

public class Entradas {

    private Integer quantidadeJogadas = 0;
    private Integer jogadaX1;

    private Integer jogadaX2;

    private Integer jogadaY1;

    private Integer jogadaY2;

    public Entradas(Integer x1, Integer y1, Integer x2, Integer y2) {
        this.jogadaX1 = x1;
        this.jogadaY1 = y1;
        this.jogadaX2 = x2;
        this.jogadaY2 = y2;
    }

    public Entradas(Integer jogadas) {
        this.quantidadeJogadas = jogadas;
    }

    public void incrementJogadas() {
        quantidadeJogadas++;
    }

    public void addJogadas(int amount) {
        quantidadeJogadas += amount;
    }

    public boolean isAllZeros() {
        return this.jogadaX1 == 0 &&
                this.jogadaY1 == 0 &&
                this.jogadaX2 == 0 &&
                this.jogadaY2 == 0;
    }

    public boolean validateEqualValues() {
        return Objects.equals(this.jogadaX1, this.jogadaX2)
                && Objects.equals(this.jogadaY1, this.jogadaY2);
    }

    public boolean sameLine() {
        return Objects.equals(this.jogadaX1, this.jogadaX2)
                || Objects.equals(this.jogadaY1, this.jogadaY2)
                || Math.abs(this.jogadaX1 - this.jogadaX2)
                == Math.abs(this.jogadaY1 - this.jogadaY2);
    }

    public String printQuantidadeJogadas() {
        return Integer.toString(quantidadeJogadas);
    }

}
