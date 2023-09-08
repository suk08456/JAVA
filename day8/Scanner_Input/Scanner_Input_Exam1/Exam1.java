package day8.Scanner_Input.Scanner_Input_Exam1;
//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
//입출력 예시
//첫번째 숫자를 입력해주세요: 12
//두번째 숫자를 입력해주세요: 33
//12 + 33 = 45

import java.util.Scanner;

import static java.lang.System.in;

public class Exam1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(in);

        int num1 = scan.nextInt();
        System.out.println("첫번째 숫자를 입력해 주세요 : " + num1);

        int num2 = scan.nextInt();
        System.out.println("첫번째 숫자를 입력해 주세요 : " + num2);

        int result = num1 + num2;
        System.out.println("정답은 : \n" + num1 + "+" + num2 + "=" + result);



    }
}
