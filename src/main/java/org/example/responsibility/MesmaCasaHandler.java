package org.example.responsibility;

import org.example.interfaces.DamaHandable;
import org.example.models.Entradas;

public class MesmaCasaHandler implements DamaHandable {

    private DamaHandable next;

    @Override
    public boolean handle(Entradas entradas) {
        if (entradas.validateEqualValues()) {
            return true;
        } else if (next != null) {
            return next.handle(entradas);
        }
        return false;
    }

    @Override
    public int getMove() {
        return 0;
    }

    @Override
    public DamaHandable setNext(DamaHandable next) {
        this.next = next;
        return next;
    }
}
