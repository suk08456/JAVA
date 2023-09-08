package day8.Scanner_Input.Scanner_Input_Exam2;

import java.util.Scanner;

import static java.lang.System.in;

public class Exam2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);
        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        System.out.println("구구단");

        int dan = scan.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.printf("%s * %s = %s\n", dan, i, dan*i);
        }

        System.out.println("끝");
        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.

    }
}
