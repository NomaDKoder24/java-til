package ch03.homeworkNo5;

/**
 * 도메인 뒤집기
 *
 * 주어진 홈페이지 주소를 .을 기준으로 각각 뒤집어 출력하시오.
 *
 * ex) www.google.com -> www.elgoog.moc
 *
 * 인자
 * string: 홈페이지 주소
 */


public class DomainReverse {
    public static void main(String[] args) {

            String s = "www.google.com";

            String[] set = s.split("\\."); // 여기서 split을 왜 써야하는지 정확한 이유를 모르겠어요..

            for (int i = 0; i < set.length; i++) { // 전체 문자열의 인덱스 수에 따른 배열
                for (int j = set[i].length() - 1; j >= 0; j--) { //  집합당 원소의 수에 따른 역순 배열
                    System.out.print(set[i].charAt(j));
                }
                if (i < set.length - 1) {
                    System.out.print(".");

                    }
                }
            }


        }

