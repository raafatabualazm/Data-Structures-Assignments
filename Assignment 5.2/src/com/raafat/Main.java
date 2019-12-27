package com.raafat;

public class Main {

    public static void main(String[] args) {
	    String val = DecimalToBase(16, 16);
        System.out.println(val);
    }
    public static String DecimalToBase(int num, int base ) {
        String getS;
        String out = "";
        Integer rem;
        String srem;
        if (num == 0) {
            return "";
        }

        rem = (num % base);
        num = num / base;
        getS = DecimalToBase(num, base);
        out += getS;
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


        out += srem;
        return out;
    }
}
