package com.company;

public class Cylinder {
    private Circle c1;
    private double height;

    public Cylinder(double h, double r)
    {
        Circle c1 = new Circle(r);
        height = h;

    }
    public double vol()
    {
        double v = c1.Area()*height;
        return v;
    }
    public double sa()
    {
        double t = c1.Area() * height * 2;
        double s = c1.circum() * height;
        return s + t;
    }
}