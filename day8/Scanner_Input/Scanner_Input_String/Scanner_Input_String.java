package day8.Scanner_Input.Scanner_Input_String;

import java.util.Scanner;

public class Scanner_Input_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println("입력한 단어는 : " + str);

        scan.nextLine();
        // 공백을 포함한 한 문장을 가져오는 방법
        String str2 = scan.nextLine(); //


        System.out.println("입련한 단어는 : " + str2);


    }
}
