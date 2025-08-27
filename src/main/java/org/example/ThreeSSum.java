package org.example;

import java.util.Arrays;
import java.util.Scanner;

// test cases:
// [-4, -1, -1, 0, 1, 2], target_sum=0, soln: [-1,-1,2], [-1,0,1]
// [-10, -3, -2, -2, -1, 0, 1, 4, 5, 8], target_sum=0, soln: [-3,-2,5], [-2,-2,4]
// [0, 0, 0, 0, 0], target_sum=0, soln: [0,0,0]
// [-2, -1, 0, 2, 3, 4, 6], target_sum=5, soln:[-2,3,4], [-1,2,4], [0,2,3]
// [1, 2, 3, 4, 5, 6, 7], target_sum=10, soln: [1,2,7], [1,3,6], [1,4,5], [2,3,5]
public class ThreeSSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrSize = in.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target_sum = in.nextInt();
        System.out.println("target_sum=" + target_sum);
        calc(arr, target_sum);
    }


    public static void calc(int[] arr, int target_sum) {
        for (int k = 0; k <= arr.length - 3; k++) {
            int intr_sum = target_sum - arr[k];
            int i = k + 1;
            int j = arr.length - 1;
            while (i < j) {
                int curr_sum = arr[i] + arr[j];
                if (curr_sum == intr_sum) {
                    System.out.println("[" + arr[k] + ", " + arr[i] + ", " + arr[j] + "]");
                    i += 1;
                    j -= 1;
                } else if (curr_sum < intr_sum) {
                    i += 1;
                } else if (curr_sum > intr_sum) {
                    j -= 1;
                }
            }
        }
    }
}
