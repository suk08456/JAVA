package day8.Exception.Excepthion_Exam1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {

        // 올바른 나이를 입력할 때까지 계속 물어보기.
        // 나이는 0보다 커야 하며, 문자값이 들어가면 안된다.
        // 0이하의 값이 들어가면 0보다 커야합니다 출력하고 다시 입력요구
        // 숫자가 아닌 문자가 들어가면 숫자를 입력해주세요 출력하고 다시 입력요구
        // 올바른 숫자가 입력되면 입력된 숫자를 출력해주고 종료.

        Scanner scan = new Scanner(System.in);
        int age;

        while (true) {
            try {
                System.out.print("나이를 입력해주세요 : ");
                age = scan.nextInt();

                if (age < 1) {
                    System.out.println("1 이상의 정수를 입력해주세요." + age);
                }else{
                    System.out.println("입력된 나이: " + age);
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("숫자를 출력해주세요.");
                scan.nextLine();
            }
        }
    }
}
