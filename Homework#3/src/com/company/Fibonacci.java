package com.company;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
/**
 * 피보나치 수열
 *
 * 피보나치 수열을 출력하는 프로그램을 작성하시오.
 *
 * 피보나치 수열의 점화식 : f(n) = f(n-1) + f(n-2)
 *                        f(1) = 0, f(2) = 1
 *
 * 0, 1, 1, 2, 3, 5, 8, ...
 *
 *
 * 인자
 * seqLength: 출력하고자 하는 피보나치 수열의 길이
 */


                int seqLength = 100;

                double num1 = 0;
                double num2 = 1;
                double num3 = 0;

                for (int i = 0; i < seqLength; i++) {
                    if (i == 0) {
                        System.out.printf("%.0f ", num1);
                    } else if (i == 1) {
                        System.out.printf("%.0f ", num2);
                    } else {
                        num3 = num1+num2;
                        System.out.printf("%.0f ", num3);
                        num1 = num2;
                        num2 = num3;
                    }
                }
            }
        }
