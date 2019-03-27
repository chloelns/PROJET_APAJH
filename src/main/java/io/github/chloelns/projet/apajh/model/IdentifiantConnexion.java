package io.github.chloelns.projet.apajh.model;

import java.util.ArrayList;
import java.util.List;

public class IdentifiantConnexion {
    //Attributs
    private String login;
    private String password;
    private List<String> roles = new ArrayList<>();

    //Constructeur
    public IdentifiantConnexion(String login, String password, List<String> roles) {
        this.login = login;
        this.password = password;
        this.roles = roles;
    }

    //Getters et Setters
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

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    //toString
    @Override
    public String toString() {
        return "IdentifiantConnexion{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
