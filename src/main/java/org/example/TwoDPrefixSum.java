package org.example;

import java.util.Arrays;
import java.util.Scanner;

//input: 4x4, [[2, 3, 7, 6], [1, 4, 5, 9], [2, 3, 4, 5], [0, 2, 8, 5]]
//output:
public class TwoDPrefixSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(); //height
        int n = in.nextInt(); //width
        int[][] matrix = new int[m][n];
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        int[][] ps = prefixSum(matrix);
        System.out.println(Arrays.deepToString(ps));
    }

    private static int[][] prefixSum(int[][] matrix) {
        int[][] ps = new int[matrix.length][matrix[0].length];
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                ps[i][j] = matrix[i][j]
                        + (i > 0 ? ps[i - 1][j] : 0)
                        + (j > 0 ? ps[i][j - 1] : 0)
                        - ((i > 0 && j > 0) ? ps[i - 1][j - 1] : 0);
            }
        }
        return ps;
    }
}
