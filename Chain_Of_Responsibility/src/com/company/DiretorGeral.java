package com.company;

public class DiretorGeral extends AbstractRole{
    public DiretorGeral(AbstractRole next) {
        super("DIRETOR GERAL", 35000, next);
    }
}
