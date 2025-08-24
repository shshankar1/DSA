package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int arrSize = sc.nextInt();
        final int[] arr = new int[arrSize];
        for (int i = 0; i <= arrSize - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        final int targetSum = sc.nextInt();
        System.out.println(targetSum);
        int j = arrSize - 1;
        int i =0;
        while(i < j) {
            int calcSum = arr[i] + arr[j];
            if(calcSum < targetSum){
                i+=1;
            } else if(calcSum > targetSum){
                j-=1;
            } else if(calcSum == targetSum){
                System.out.printf("Index Pair: (%d, %d)%n", i, j);
                System.out.printf("Value Pair: (%d, %d)%n", arr[i], arr[j]);
                i+=1; j-=1;
            }
        }
    }
}
