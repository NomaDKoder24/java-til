package com.company;

import java.util.Scanner;

/**
 * 입력받아 처리하기
 *
 * 3개의 정수를 입력받아, 그 중 최대값을 출력하고자 한다.
 * 이를 수행하는 프로그램을 작성하시오.
 *
 */


public class InputOutput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 natural numbers.");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.nextLine();

        int higher = x>y? x:y;
        int highest = higher>z? higher:z; // int 에서도 x>y? x:y가 되는줄 몰라서 좀 멘붕왔었습니다.

        System.out.printf("The Highest natural number is %d.", highest);

    }
}