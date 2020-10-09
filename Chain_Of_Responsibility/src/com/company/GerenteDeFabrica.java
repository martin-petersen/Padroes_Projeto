package com.company;

public class GerenteDeFabrica extends AbstractRole{
    public GerenteDeFabrica(AbstractRole next) {
        super("GERENTE DE FABRICA", 10000, next);
    }
}
