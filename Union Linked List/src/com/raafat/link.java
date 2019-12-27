package com.raafat;

public class link {
    public int date ;
    public double ddate;
    link next ;
    public link(int d){
        date =d;

    }
    public void displaylink(){

        System.out.println("int v is"+date+"double d is "+ddate );
    }
}
