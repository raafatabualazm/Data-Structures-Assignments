package com.raafat;

public class Main {

    public static void main(String[] args) {
	    reverse(0, "Hello");
    }
    public static void reverse(int index,String str) {
        if (index == str.length()) {
            return;
        }
        reverse(++index, str);
        index--;
        System.out.print(str.charAt(index));

    }
}
