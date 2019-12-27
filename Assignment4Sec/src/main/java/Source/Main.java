package Source;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        String num = DecimalToBase(1, 2);
        System.out.println(num);
    }

    public static String DecimalToBase(int num, int base ) {
        Stack<Character> output = new Stack();
        String out = new String();
        int rem;
        char srem = '0';
        while (num != 0) {
            rem = (num % base);
            num = num / base;
            switch (rem) {
                case 10:
                    srem = 'A';
                    break;
                case 11:
                    srem = 'B';
                    break;
                case 12:
                    srem = 'C';
                    break;
                case 13:
                    srem = 'D';
                    break;
                case 14:
                    srem = 'E';
                    break;
                case 15:
                    srem = 'F';
                    break;
                default:
                    srem = (char) rem;

            }
            output.push(srem);
        }
        output.push(srem);
        while(!output.empty()) {
            out += output.pop();
        }
        return out;


    }
}
