package org.example;

import java.util.Arrays;
import java.util.Scanner;

// time complexity: O(log2min(a,b))
// questions to ask, can elements be zero in input
// gcd of 2 elements having one element zero will be nonzero element
// gcd of 2 elements both zero is undefined.
// test cases:
//  1. i/p: [36, 60, 48], o/p: 12
//  2. i/p: [17, 34, 51, 85], o/p: 17
//  3. i/p: [45, 60, 75, 90, 105], o/p: 15
//  4. i/p: [0, 0, 0, 14, 21], o/p: 7
public class GcdProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i <= arrLength - 1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int result = 0;
        int i = 0;
        while (i <= arrLength - 1) {
            result = findGcd(result, arr[i]);
            i += 1;
        }
        System.out.println(result);
    }

    private static int findGcd(int a, int b) {
        if (a == 0 && b == 0) return 0;
        if (a == 0 || b == 0) return Math.abs(Math.max(a, b));
        return a > b ? gcd(a, b) : gcd(b, a);
    }

    private static int gcd(int num, int divisor) {
        if (num % divisor == 0) return divisor;
        return gcd(divisor, num % divisor);
    }


}
