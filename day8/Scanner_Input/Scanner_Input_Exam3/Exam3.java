package day8.Scanner_Input.Scanner_Input_Exam3;

import java.util.Scanner;

import static java.lang.System.in;

public class Exam3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);

        System.out.println("나이를 입력해주세요:");
        int age = scan.nextInt();


        scan.nextLine();

        System.out.println("이름을 입력해주세요:");
        String name = scan.nextLine();


        System.out.printf("안녕하세요 %d세 %s입니다\n", age, name);
        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.
    }
}
