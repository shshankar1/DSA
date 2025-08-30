package org.example;

import java.math.BigInteger;
import java.util.Scanner;

// write both recursive and non recursive way of factorial
//long data type can handle upto 20!
public class NSquareFactorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int squaredNum = num * num;
        System.out.println(factorialUsingNonRecursion(squaredNum));
        System.out.println(factorialUsingRecusion(squaredNum, BigInteger.ONE));
    }

    private static BigInteger factorialUsingNonRecursion(int num){
        BigInteger fact = BigInteger.ONE;
        for(int i=1; i<=num; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    private static BigInteger factorialUsingRecusion(int n, BigInteger fact){
        if(n <= 1){
            return fact;
        }else{
            return factorialUsingRecusion(n-1, fact.multiply(BigInteger.valueOf(n)));
        }
    }

}
