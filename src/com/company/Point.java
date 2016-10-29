package com.company;

/**
 * Created by HAMALI on 24/10/16.
 */
public class Point extends PointA { //tu as inversé c'est class PointA extends Point 

    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Point(String nom, double x, double y) {

        super(x, y);
        this.nom = nom;
    }

    public void afficheCoord() {

        System.out.print(nom + "(" + getX() + "," + getY() + ")");

    }


}
