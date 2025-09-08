package org.example;

import java.util.Arrays;
import java.util.Scanner;

//input: 1, [6 2 3 3 ], output: Won
public class FactorProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        int[][] tests = new int[testCases][4];
        for (int i = 0; i <= testCases - 1; i++) {
            for (int j = 0; j <= 3; j++) {
                tests[i][j] = in.nextInt();
            }
        }
        //System.out.println(Arrays.deepToString(tests));
        for (int i = 0; i <= tests.length - 1; i++) {
            int n = tests[i][0];
            int a = tests[i][1];
            int b = tests[i][2];
            int k = tests[i][3];
            int totalSolutions = 0;
            for (int j = 1; j <= n; j++) {
                if (j % a == 0 && j % b == 0) continue;
                if (j >= a && j % a == 0) totalSolutions += 1;
                if (j >= b && j % b == 0) totalSolutions += 1;
            }
            if (totalSolutions >= k) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
            }
        }
    }
}
