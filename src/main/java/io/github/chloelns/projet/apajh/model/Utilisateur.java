package io.github.chloelns.projet.apajh.model;

import io.github.chloelns.projet.apajh.model.comparators.ReservationComparator;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class Utilisateur {
    //Attributs de l'Entity
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Version
    private int version;

    //Attributs
    private String nom;
    private String prenom;
    private String email;
    @OneToOne(mappedBy = "utilisateur")
    private IdentifiantConnexion identifiantConnexion;
    @OneToMany(mappedBy = "utilisateur")
    private Set<Reservation> reservations = new TreeSet<>(new ReservationComparator());

    //Constructeur
    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    //Getters et Setters Entity
    public Long getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    //Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public IdentifiantConnexion getIdentifiantConnexion() {
        return identifiantConnexion;
    }

    public void setIdentifiantConnexion(IdentifiantConnexion identifiantConnexion) {
        this.identifiantConnexion = identifiantConnexion;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}
