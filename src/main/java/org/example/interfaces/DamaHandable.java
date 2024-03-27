package org.example.interfaces;

import org.example.models.Entradas;

public interface DamaHandable {
    boolean handle(Entradas entradas);
    int getMove();
    DamaHandable setNext(DamaHandable next);
}
