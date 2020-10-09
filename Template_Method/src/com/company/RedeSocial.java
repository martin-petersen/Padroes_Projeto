package com.company;

import java.util.Scanner;

public class RedeSocial extends User{

    @Override
    void chooseLogin() {
        System.out.println("Informe um email válido:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        while(!username.contains("@")) {
            System.out.println("Email inválido, por favor informe um email válido");
            username= sc.nextLine();
        }
        setLogin(username);
    }

    @Override
    void choosePassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua senha:");
        setPassword(sc.nextLine());
        System.out.println("Usuário criado com sucesso!\n\n");
    }
}
