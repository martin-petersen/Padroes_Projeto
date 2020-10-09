package com.company;

public class Main {

    public static void main(String[] args) {
	    Jogo jogo = new Jogo();
	    RedeSocial redeSocial = new RedeSocial();
	    ProgramaGovernamental programaGovernamental = new ProgramaGovernamental();

        System.out.println("Criar usuário de jogo\n\n");
        jogo.createUser();
        System.out.println("Username: " + jogo.getLogin());
        System.out.println("Password: " + jogo.getPassword() + "\n");
        System.out.println("Criar usuário de rede social\n\n");
        redeSocial.createUser();
        System.out.println("Username: " + redeSocial.getLogin());
        System.out.println("Password: " + redeSocial.getPassword() + "\n");
        System.out.println("Criar usuário de programa do governo\n\n");
        programaGovernamental.createUser();
        System.out.println("Username: " + programaGovernamental.getLogin());
        System.out.println("Password: " + programaGovernamental.getPassword());
    }
}
