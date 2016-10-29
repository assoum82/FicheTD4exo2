package com.company;

/**
 * Created by HAMALI on 24/10/16.
 */

import java.util.Scanner;

public class PointNom {


    public static void main(String args[]) {
        Scanner lire = new Scanner(System.in);
        System.out.print("Crée un Point" +
                "\n nom:");
        String nom = lire.nextLine();

        System.out.print("Abcisse  =");

        double abcs = lire.nextDouble();

        System.out.print("Ordonnee =");

        double ord = lire.nextDouble();

        Point p = new Point(nom, abcs, ord);

        p.afficheCoord();

        System.out.print("\n deplacer moins");

        System.out.print("\n dx=");

        abcs = lire.nextDouble();

        System.out.print("\n dy=");

        ord = lire.nextDouble();
        p.setNom(nom + "'");
        p.deplace(abcs, ord);

        p.afficheCoord();


    }
}
//
