package io.github.chloelns.projet.apajh.model;

public class Vehicule {
    //Attributs
    private String plaqueImmatriculation;
    private String marque;

    //Constructeur
    public Vehicule(String plaqueImmatriculation, String marque) {
        this.plaqueImmatriculation = plaqueImmatriculation;
        this.marque = marque;
    }

    //Getters et Setters
    public String getPlaqueImmatriculation() {
        return plaqueImmatriculation;
    }

    public void setPlaqueImmatriculation(String plaqueImmatriculation) {
        this.plaqueImmatriculation = plaqueImmatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    //toString
    @Override
    public String toString() {
        return "Vehicule{" +
                "plaqueImmatriculation='" + plaqueImmatriculation + '\'' +
                ", marque='" + marque + '\'' +
                '}';
    }
}
