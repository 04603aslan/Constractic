package com.baris;

public class Cylindir
{
    private int r;
    private int h;
    private final double PI=3.14;

    private double area=0;
    private double volume=0;
    public  Cylindir(int r)
    {
        this.r=r;
    }
    public Cylindir(int r,int h)
    {
        this.r=r;
        this.h=h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double findArea()
    {
        return 2*PI*r*(h+r);
    }
    public double findVolume()
    {
        return PI*r*r*h;
    }
}
