package org.example.responsibility;

import org.example.interfaces.DamaHandable;
import org.example.models.Entradas;

public class OutrosLugaresHandler implements DamaHandable {
    @Override
    public boolean handle(Entradas entradas) {
        return true;
    }

    @Override
    public int getMove() {
        return 2;
    }

    @Override
    public DamaHandable setNext(DamaHandable next) {
        return this;
    }
}
