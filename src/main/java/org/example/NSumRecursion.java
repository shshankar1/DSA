package org.example;

import java.util.Scanner;

public class NSumRecursion {

    // in java, we don't get tail call optimization, so stack size will always be O(n)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("num: "+num);
        System.out.println("sum: "+ sum(num, 0));
    }

    private static int sum(int t, int final_sum) {
        if (t <= 0) {
            return final_sum;
        } else {
            final_sum += t;
            return sum(t - 1, final_sum);
        }
    }
}
