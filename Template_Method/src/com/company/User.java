package com.company;

public abstract class User {
    private String login;
    private String password;

    final void createUser() {
        chooseLogin();
        choosePassword();
    }

    abstract void chooseLogin();
    abstract void choosePassword();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
