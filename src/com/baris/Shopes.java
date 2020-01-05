package com.baris;

import javax.swing.*;

public class Shopes {

    public static void main(String[] args)
    {
	Circle firstObject =new Circle(5);
	Cylindir secondObject =new Cylindir(4,5);
	String Output="Circle area :" + firstObject.findArea() +"\n"
            + "Cylindir area : " + secondObject.findArea();


        JOptionPane.showMessageDialog(null,Output);

     String output="Circle Perimeter : " + firstObject.findPerimeter()
            +" \n  "+ "Cylindir volume :" + secondObject.findVolume();
     JOptionPane.showMessageDialog(null, output);
     double result=firstObject.findPerimeter();
     //double indexOf(result);
     JOptionPane.showMessageDialog(null,result);
    }
}
