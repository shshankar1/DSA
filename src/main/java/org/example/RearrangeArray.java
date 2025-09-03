package org.example;

import java.util.Arrays;
import java.util.Scanner;

// rearrange array such that a[i]=j becomes a[j]=i
//test case: [2, 0, 1, 4, 5, 3] => output: [1, 2, 0, 5, 3, 4]
public class RearrangeArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] elements = new int[arrLength];
        for (int i = 0; i <= arrLength - 1; i++) {
            elements[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(elements));

        for(int i=0; i<=arrLength-1; i++){
            int temp = elements[i];
            while(temp > 0){
                elements[temp] = -i;
                temp = elements[temp];
            }
        }

        System.out.println(Arrays.toString(elements));

    }
}
