package assignment1;

import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 10/19/17.
 */
public class MinAvgDigit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int x, min = input % 10, sum = 0;
        while (input > 0) {
            x = input % 10;
            input /= 10;
            if (x < min)
                min = x;
            sum += x;
        }
        System.out.println("min digit: " + min);
        System.out.printf("Average: %5.2f", (sum / 3.0)); //to get two digit after decimal point
    }
}
