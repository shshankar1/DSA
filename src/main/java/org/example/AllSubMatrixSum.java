package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class AllSubMatrixSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                arr[i][j] = in.nextInt();
            }
            System.out.println("\n");
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(calcSum(arr, m, n));
    }

    private static int calcSum(int[][] arr, int m, int n) {
        int sum = 0;
        for (int i = 0; i <= m - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                sum += (arr[i][j] * (i + 1) * (j + 1) * (m - i) * (n - j));
            }
        }
        return sum;
    }
}
