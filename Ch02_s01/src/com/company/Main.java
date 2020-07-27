package com.company;

/**
 * 주석을 연달아
 * 쓰려면 /**를 사용
 * 하면됨
 *
 * 변수 (Variable)
 * 변하는 수. 수학의 변수와 유사.
 * 변수의 타입, 변수명, 값을 할당 할 수 있음.
 * 변수의 선언
 * 변수에 값 할당 (리터럴)
 * 변수명 규
 */

// 한줄짜리 주석인 이거

public class Main {

    public static void main(String[] args) {
        int x ; // x라는 변수
        x = 10; // x에다 10이라는 값을 할당에. 여기서 10은 리터럴(Literal)
        System.out.println(x);

        // 다중변수를 선언가능함.
        int w, y, z ; // 표현예시

        int valueOne = 10 ; // 표현예시
        int valueTwo = 20 ; // 표현예시

        int valueThree = 100, valuseFour = 1000; // 표현예시

        // 변수에서 특수문자 사용불가. 단 $는 가능하나 쓰지말것. Low level 단위에서 구현될때 주로 쓰기에 왠만하면 쓰지 말 것.

        // Code Convention
        int valueOne // 첫시작은 소문자로 사용할 것.
        int camelCase; // 띄어쓰기 부분을 없애는 대신에 다음에 오는 단어를 대문자로 씀
        int lowerCamelCase;
        int UpperCamelCase; // = PascalCamelCase

        // int PascalCase; <- class 이름이나 다른 곳에 사용하고 변수에 사용하지 않음.

        /**
         * 변하지 않는 수
         * static int STATIC_VARIABLE = 10;
         *
         * public static void main (~)
         */
    }
}
