package com.company;

/**
 * Created by HAMALI on 24/10/16.
 */
public class PointA {
    private double x, y;

    public PointA(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointA(double x) {
        this.x = this.y = x;
    }

    public PointA() {
        this.x = this.y = 0;

    }

    public double getY() {
        return y;
    }

    public double getX() {

        return x;
    }

    public void deplace(double dx, double dy) {
        x += dx;
        y += dy;
    }
}
