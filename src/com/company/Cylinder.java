package com.company;

public class Cylinder {
    private Circle c1;
    private double height;

    public Cylinder(double h, double r)
    {
        c1 = new Circle(r);
        height = h;

    }
    public double vol()
    {
        return c1.Area()*height;
    }
    public double sa()
    {
        double t = c1.Area() * 2;
        double s = c1.circum() * height;
        return s + t;
    }
}