package io.github.chloelns.projet.apajh.model;

import javax.persistence.*;

@Entity
public class IdentifiantConnexion {
    //Attributs de l'Entity
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Version
    private int version;

    //Attributs
    private String login;
    private String password;
    private boolean admin;
    @OneToOne
    private Utilisateur utilisateur;

    //Constructeur
    public IdentifiantConnexion() {
    }

    public IdentifiantConnexion(String login, String password, boolean admin) {
        this.login = login;
        this.password = password;
        this.admin = admin;
    }

    //Getters et Setters de l'Entity
    public Long getId() {
        return id;
    }

    public int getVersion() {
        return version;
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
