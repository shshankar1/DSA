package org.example;

import java.util.Arrays;
import java.util.Scanner;

// test cases:
// arr = [1,2,3,4,5,6,7], k = 3, output => [5,6,7,1,2,3,4]
// arr = [1,2,3,4,5], k = 2, output => [4,5,1,2,3]
// arr = [10,20,30], k = 5, output => [20,30,10]
// arr = [11,22,33,44], k = 0, output => [11,22,33,44]
// arr = [1,2,3,4,5], k = 5, output => [1,2,3,4,5]
// arr = [99], k = 10, output => [99]
public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i <= arrLength - 1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int rotateCount = in.nextInt();
        int effectiveRotateCount = rotateCount % arrLength;
        System.out.println("effectiveRotateCount: " + effectiveRotateCount);
        reverse(arr, 0, effectiveRotateCount);
        reverse(arr, effectiveRotateCount+1, arrLength-1);
        reverse(arr, 0, arrLength-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start+=1; end-=1;
        }
    }
}
