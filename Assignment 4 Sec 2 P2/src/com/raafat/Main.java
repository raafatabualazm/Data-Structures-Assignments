package com.raafat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TwoStacksOneArray ds = new TwoStacksOneArray(5);
        ds.Push1(1);
        System.out.println(ds.Pop1());
        ds.Push2(2);
       /* ds.Push1(3);
        ds.Push2(4);
        ds.Push1(5);
        ds.Push2(6);
        ds.Push1(7);
        ds.Push2(8);
        ds.Push1(9);
        ds.Push2(10);
        ds.Push1(11);
        ds.Push2(12); */
    }
}
