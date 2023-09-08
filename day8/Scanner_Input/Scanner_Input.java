package day8.Scanner_Input;

import java.io.IOException;
import java.util.Scanner;

public class Scanner_Input {
    public static void main(String[] args) {
//        System.out.println("hihi");  // 표준 출력

//        int a = 10;
//        System.out.println(a);  // 표준 출력


//            int input = System.in.read();  // 표준 입력
//            System.out.println(input);  // 97 - a


        Scanner scan = new Scanner(System.in);

        // 입력이 필요한 경우
        int num = scan.nextInt(); // 입력된 숫자를 하나 읽어옴

        System.out.println("입력한 값: " + num);


    }
}
