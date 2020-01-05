package com.baris;

public class Circle
{
    private int r;
    private final double PI =3.14;
    private double area=0;
    private  double perimeter=0;


    public  Circle(int r)
    {
        this.r=r;


    }
    public double findArea()
    {
    return PI*r*r;
    }
    public double findPerimeter()
    {
        return 2*PI*r;

    }
}
