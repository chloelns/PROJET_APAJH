package io.github.chloelns.projet.apajh.model;

import java.sql.Date;

public class Reservation {
    //Attributs
    private Utilisateur utilisateur;
    private Vehicule vehicule;
    private Date dateDebutReservation;
    private Date dateFinReservation;
    private Boolean vehiculeRendu;

    //Constructeur
    public Reservation(Utilisateur utilisateur, Vehicule vehicule, Date dateDebutReservation, Date dateFinReservation, Boolean vehiculeRendu) {
        this.utilisateur = utilisateur;
        this.vehicule = vehicule;
        this.dateDebutReservation = dateDebutReservation;
        this.dateFinReservation = dateFinReservation;
        this.vehiculeRendu = vehiculeRendu;
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

    public Date getDateDebutReservation() {
        return dateDebutReservation;
    }

    public void setDateDebutReservation(Date dateDebutReservation) {
        this.dateDebutReservation = dateDebutReservation;
    }

    public Date getDateFinReservation() {
        return dateFinReservation;
    }

    public void setDateFinReservation(Date dateFinReservation) {
        this.dateFinReservation = dateFinReservation;
    }

    public Boolean getVehiculeRendu() {
        return vehiculeRendu;
    }

    public void setVehiculeRendu(Boolean vehiculeRendu) {
        this.vehiculeRendu = vehiculeRendu;
    }

    //toString
    @Override
    public String toString() {
        return "Reservation{" +
                "utilisateur=" + utilisateur +
                ", vehicule=" + vehicule +
                ", dateDebutReservation=" + dateDebutReservation +
                ", dateFinReservation=" + dateFinReservation +
                ", vehiculeRendu=" + vehiculeRendu +
                '}';
    }
}
