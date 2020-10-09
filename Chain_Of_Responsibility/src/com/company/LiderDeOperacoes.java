package com.company;

public class LiderDeOperacoes extends AbstractRole{
    public LiderDeOperacoes(AbstractRole next) {
        super("LIDER DE OPERACOES", 5000, next);
    }
}
