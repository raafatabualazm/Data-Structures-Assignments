package com.raafat;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        String num = DecimalToBase(0, 2);
        System.out.println(num);
    }

    public static String DecimalToBase(int num, int base ) {
        Stack<String> output = new Stack<String>();
        String out = new String();
        Integer rem;
        String srem = new String();
        while (num != 0) {
            rem = (num % base);
            num = num / base;
            switch (rem) {
                case 10:
                    srem = "A";
                    break;
                case 11:
                    srem = "B";
                    break;
                case 12:
                    srem = "C";
                    break;
                case 13:
                    srem = "D";
                    break;
                case 14:
                    srem = "E";
                    break;
                case 15:
                    srem = "F";
                    break;
                default:
                    srem = rem.toString();

            }
            output.push(srem);
        }
        while(!output.empty()) {
            out += output.pop();
        }
        return out;


    }
}
