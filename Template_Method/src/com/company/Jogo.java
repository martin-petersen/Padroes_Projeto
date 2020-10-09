package com.company;

import java.util.Scanner;

public class Jogo extends User{

    @Override
    void chooseLogin() {
        System.out.println("Informe um nome de usuário:");
        Scanner sc = new Scanner(System.in);
        setLogin(sc.nextLine());
    }

    @Override
    void choosePassword() {
        System.out.println("Informe sua senha:");
        Scanner sc = new Scanner(System.in);
        setPassword(sc.nextLine());
        System.out.println("Usuário criado com sucesso!\n\n");
    }
}
