package com.company;

public class Operador extends AbstractRole{
    public Operador(AbstractRole next) {
        super("OPERADOR", 2000, next);
    }
}
