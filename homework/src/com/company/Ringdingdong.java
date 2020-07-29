package com.company;

public class Ringdingdong {
    public static void main(String[] args) {

        int numBits = 12;
        int numCount = 19;

        // 연산자활용


        System.out.printf("b%12s\n", Integer.toBinaryString(1 << numBits % numCount));
        System.out.println(1 << numCount % numCount );
    }
}
