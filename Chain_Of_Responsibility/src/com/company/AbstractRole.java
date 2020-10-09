package com.company;

abstract class AbstractRole {
    private String cargo;
    private int limite;
    private AbstractRole next = null;

    public AbstractRole(String cargo, int limite, AbstractRole next) {
        this.cargo = cargo;
        this.limite = limite;
        this.next = next;
    }

    public void processoSeletivo(int salario) throws InterruptedException {
        if (salario <= this.limite)
        {
            System.out.println("Contratação aprovada");
            System.out.println("Seu cargo será: " + this.cargo);
            System.out.println();
            Thread.sleep(3000);
        }
        else if (this.next != null)
        {
            this.next.processoSeletivo(salario);
        }
        else
        {
            System.out.println("Obrigado por ter participado do nosso processo seletivo!");
            System.out.println("Infelizmente atualmente a empresa não tem cargos que possam ofertar a quantia solicitada");
        }
    }
}
