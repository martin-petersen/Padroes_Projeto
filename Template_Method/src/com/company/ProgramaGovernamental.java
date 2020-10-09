package com.company;

import java.util.Scanner;

public class ProgramaGovernamental extends User{

    @Override
    void chooseLogin() {
        System.out.println("Informe o seu CPF (somente números):");
        Scanner sc = new Scanner(System.in);
        String cpf = sc.nextLine();
        int validador;
        while(cpf.length()!=11) {
            System.out.println("CPF informado é inválido");
            cpf = sc.nextLine();
        }
        do {
            validador = 0;
            for (int i = 0; i < cpf.length(); ++i) {
                if(cpf.charAt(i)==cpf.charAt(0))
                    validador++;
            }
            if(validador==11) {
                System.out.println("CPF informado é inválido");
                cpf = sc.nextLine();
            }
        } while(validador == 11);
        validador = 0;
        while(validador==0) {
            int auxiliar = 0;
            int vPrimeiroDigito = 10;
            int vSegundoDigito = 11;
            String temp;
            for(int i=0; i<=8; ++i) {
                temp=String.valueOf(cpf.charAt(i));
                auxiliar += Integer.parseInt(temp)*vPrimeiroDigito;
                vPrimeiroDigito--;
            }
            temp=String.valueOf(cpf.charAt(9));
            if(auxiliar*10%11==Integer.parseInt(temp)) {
                auxiliar=0;
                for(int i=0; i<=9; ++i) {
                    temp=String.valueOf(cpf.charAt(i));
                    auxiliar += Integer.parseInt(temp)*vSegundoDigito;
                    vSegundoDigito--;
                }
                temp=String.valueOf(cpf.charAt(10));
                if(auxiliar*10%11==Integer.parseInt(temp)) {
                    validador=1;
                } else {
                    System.out.println("CPF informado é inválido");
                    cpf = sc.nextLine();
                }
            } else {
                System.out.println("CPF informado é inválido");
                cpf = sc.nextLine();
            }
        }
        setLogin(cpf);
    }

    @Override
    void choosePassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua senha:");
        setPassword(sc.nextLine());
        System.out.println("Usuário criado com sucesso!\n\n");
    }
}
