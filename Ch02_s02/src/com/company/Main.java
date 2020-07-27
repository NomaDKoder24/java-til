package com.company;


/**
 * 자료형 (Data Type)
 * 자료형 - 기본형 (Primitive Type), 참조형 (Reference Type)
 * 기본형 자료형 - 정수형, 실수형, 문자형, 논리형
 * 참조형 자료형 - 문자열 (String)
 */

public class Main {

    public static void main(String[] args) {

        // 정수형 : Byte, short, int , long
        System.out.println("Byte");
        System.out.println(Byte.BYTES);
        byte byteValue = 42;
        System.out.println(byteValue);

        System.out.println(Byte.MAX_VALUE); // 2^7-1 으로 표현. 왜??
        System.out.println(Byte.MIN_VALUE); // -2^7
        // 이 말은 8비트로 표현할 수 있는 정수의 개수는 2의 7승(128개)이다.

        // shot형
        System.out.println("Short");
        System.out.println(Short.BYTES); // 2 바이트
        System.out.println(Short.MAX_VALUE); // 2^15 - 1
        System.out.println(Short.MIN_VALUE); // - 2^15
        System.out.println("");

        // int 형
        System.out.println("Int");
        System.out.println(Integer.BYTES); // 4 바이트
        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
        System.out.println(Integer.MIN_VALUE); // -2^31
        System.out.println("");

        // long 형
        System.out.println("Long");
        System.out.println(Long.BYTES); // 8 바이트
        System.out.println(Long.MAX_VALUE); // 2^63 - 1
        System.out.println(Long.MIN_VALUE); // -2^63
        System.out.println("");

        // Overflow
        // 최대값 32767(2^15-1) => 0111111111111111
        // 64000 => 1001111110000001000111
        // 길이가 두배인 정수인데, 캐스팅을 하므로써, 앞을 잘라버리게되어, 1110000001000111이 되어버린다.
        short shortValue = (short)64000; // <- 억지로 바꿔주는 문법. 캐스팅
        System.out.println(shortValue); // 최대값 32767(2^15-1) => 0111111111111111
        System.out.println("");

        // 정수형은 기본적으로 int
        // byte byteValue3 = 144 ;
        short shortA = 10;
        short shortB = 20;
        // short shortC = shortA + shortB ; <- 에러가남
        // short shortC = (short)(shortA + shortB); <- shortA가 int가 되기때문에 강제적으로 short으로 바꿔줘야한다.(??)

        int bigInt = Integer.MAX_VALUE;
        int biggerInt = bigInt + 1; // overflow 주의. integer끼리 더해도 overflow가 되며 경고문도 안뜸
        System.out.println(biggerInt);
        System.out.println("");

        long veryBigInt = 10000000000000L; // <- 크기때문에 L을 넣어주으로써 인식이 가능하게함.
        System.out.println(veryBigInt);

        // 이 수업의 내용은 각 항목별 그릇의 크기를 알려줌

        // 진수법 - Binary (2), Octal (8), Decimal (10), Hexadecinal (16)
        System.out.println(0B1101); // 2진수
        System.out.println(0423); // <- 앞에 0만 있으면 됨. 8진수. 10진수와 비슷하게 생겨서 가능하면 쓰지 말 것
        System.out.println(1324); // 10진수
        System.out.println(0x10); // 16 진수. 0~9, 10~15 : a, b,c,d,e,f
        System.out.println(0xff);


    }
}
