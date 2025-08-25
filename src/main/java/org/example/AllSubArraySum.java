package org.example;

import java.util.Arrays;
import java.util.Scanner;

//try below inputs:
//    [1,2,3] => sum=20
//    [0,1,2] => sum=11
//    [0,0,0] => sum=0
//    [-1,-2,-3] => sum=-20
//    [2,-1,3] => sum=14
//    [5] => sum=5
//    [1,2,3,4,5] => sum=105
//    [5,4,3,2,1] => sum=105
//    [1,-1,1,-1] => sum=0
public class AllSubArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int arrSize = in.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i <= arrSize - 1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //naiveApproach(arr);
        linearTimeApproach(arr);
    }

    public static void naiveApproach(int[] arr) {
        int final_sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int intr_sum = 0;
            for (int j = i; j <= arr.length - 1; j++) {
                intr_sum += arr[j];
                final_sum += intr_sum;
            }
        }
        System.out.println(final_sum);
    }

    public static void linearTimeApproach(int[] arr) {
        int final_sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            final_sum+=(arr[i]*(arr.length-i)*(arr.length-i));
        }
        System.out.println(final_sum);
    }
}
