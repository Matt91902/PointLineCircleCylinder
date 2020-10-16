package com.company;

public class Circle {
    private double radius;

    public Circle() // Default Constructor
    {
        radius = 1.0;
    }
    public Circle(double r) //Constructor
    {
        radius = r;
    }
    public double Area()
    {
        double a = Math.PI * Math.pow(this.radius,2);
        return a;
    }
    public double Circum()
    {
        double c = Math.PI * this.radius * 2;
        return c;
    }
}
