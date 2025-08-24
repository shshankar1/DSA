package org.example;


import java.util.List;

public class MaxExpression {
    public static void main(String[] args) {
        final List<Integer> arr = List.of(-5, -2, 0, 4, -1, 3);
        final int p = -2;
        final int q = 7;
        final int r = -1;

        // -5 * -2 + 7 * 4 + -1 * -1 = 39

        int max_p = Integer.MIN_VALUE;
        int max_pq = Integer.MIN_VALUE;
        int max_pqr = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            if (p * arr.get(i) > max_p) {
                max_p = p * arr.get(i);
            }
            if (i >= 1) {
                int exp_pq = q * arr.get(i) + max_p;
                if (exp_pq > max_pq) {
                    max_pq = exp_pq;
                }
            }

            if (i >= 2) {
                int exp_pqr = r * arr.get(i) + max_pq;
                if (exp_pqr > max_pqr) {
                    max_pqr = exp_pqr;
                }
            }
        }
        System.out.println(max_p + ", " + max_pq + ", " + +max_pqr);
    }
}