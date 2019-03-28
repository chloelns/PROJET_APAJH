package io.github.chloelns.projet.apajh.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    //Attributs de l'Entity
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Version
    private int version;
    //Attributs
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Vehicule vehicule;
    private LocalDateTime dateDebutReservation;
    private LocalDateTime dateFinReservation;
    private boolean vehiculeRendu;

    //Constructeur


    public Reservation() {
    }

    public Reservation(Utilisateur utilisateur,
                       Vehicule vehicule,
                       LocalDateTime dateDebutReservation,
                       LocalDateTime dateFinReservation,
                       boolean vehiculeRendu) {

        this.utilisateur = utilisateur;
        this.vehicule = vehicule;
        this.dateDebutReservation = dateDebutReservation;
        this.dateFinReservation = dateFinReservation;
        this.vehiculeRendu = vehiculeRendu;
    }

    //Getters et Setters de l'Entity
    public Long getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    //Getters et Setters
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public LocalDateTime getDateDebutReservation() {
        return dateDebutReservation;
    }

    public void setDateDebutReservation(LocalDateTime dateDebutReservation) {
        this.dateDebutReservation = dateDebutReservation;
    }

    public LocalDateTime getDateFinReservation() {
        return dateFinReservation;
    }

    public void setDateFinReservation(LocalDateTime dateFinReservation) {
        this.dateFinReservation = dateFinReservation;
    }

    public boolean isVehiculeRendu() {
        return vehiculeRendu;
    }

    public void setVehiculeRendu(boolean vehiculeRendu) {
        this.vehiculeRendu = vehiculeRendu;
    }
}
