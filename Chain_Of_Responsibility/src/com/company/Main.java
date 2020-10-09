package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        CEO ceo = new CEO();
        DiretorGeral diretorGeral = new DiretorGeral(ceo);
        DiretorRegional diretorRegional = new DiretorRegional(diretorGeral);
        GerenteDeFabrica gerenteDeFabrica = new GerenteDeFabrica(diretorRegional);
        LiderDeOperacoes liderDeOperacoes = new LiderDeOperacoes(gerenteDeFabrica);
        Operador operador = new Operador(liderDeOperacoes);

        Scanner sc = new Scanner(System.in);

        int salario = sc.nextInt();
        System.out.println();
        while(salario <= 128000) {
            System.out.println("Valor pedido: R$ " + salario + ",00");
            operador.processoSeletivo(salario);
            salario+=salario;
        }
    }
}