package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WaterTrap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        final List<MaxPair> maxPairs = new ArrayList<>(arr.length);
        for(int i=0; i<arr.length; i++){
            maxPairs.add(new MaxPair());
        }
        int prefixMax = -1;
        for(int i=0; i < arr.length; i++){
            if (arr[i] > prefixMax){
                prefixMax = arr[i];
            }
            maxPairs.get(i).setPrefix(prefixMax);
        }

        int suffixMax = -1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > suffixMax){
                suffixMax = arr[i];
            }
            maxPairs.get(i).setSuffix(suffixMax);
        }

        //System.out.println(maxPairs);
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            final MaxPair maxPair = maxPairs.get(i);
            int max = Math.min(maxPair.getPrefix(), maxPair.getSuffix());
            sum += (max-arr[i]);
        }
        System.out.println(sum);
    }

    static class MaxPair {
        private int prefix;
        private int suffix;

        public void setPrefix(int prefixMax){
            this.prefix = prefixMax;
        }

        public void setSuffix(int suffixMax){
            this.suffix = suffixMax;
        }

        public int getPrefix(){
            return this.prefix;
        }

        public int getSuffix(){
            return this.suffix;
        }

        @Override
        public String toString() {
            return "MaxPair{" +
                    "prefix=" + prefix +
                    ", suffix=" + suffix +
                    '}';
        }
    }
}
