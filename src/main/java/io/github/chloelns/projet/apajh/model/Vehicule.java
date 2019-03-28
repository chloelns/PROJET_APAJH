package io.github.chloelns.projet.apajh.model;

import io.github.chloelns.projet.apajh.model.comparators.ReservationComparator;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class Vehicule {
    //Attributs de l'Entity
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Version
    private int version;

    //Attributs
    private String immatriculation;
    private String marque;
    @OneToMany(mappedBy = "vehicule")
    private Set<Reservation> reservations = new TreeSet<>(new ReservationComparator());

    //Constructeur
    public Vehicule() {
    }

    public Vehicule(String immatriculation, String marque) {
        this.immatriculation = immatriculation;
        this.marque = marque;
    }

    //Getters et Setters de l'Entity
    public Long getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    //Getters et Setters

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

}
