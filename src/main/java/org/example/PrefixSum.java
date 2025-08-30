package org.example;

import java.util.Arrays;
import java.util.Scanner;

// input = [1, 2, 3, 4, 5, 6]
// output = [1, 3, 6, 10, 15, 21]
public class PrefixSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for(int i=0; i<=arrLength-1; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=1; i<=arrLength-1; i++){
            arr[i]+=arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
