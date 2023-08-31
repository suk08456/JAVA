package day2;
// 두수 num1과 num2가 주어집니다.
// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.
public class Exam3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        int res = 0;
        if(num1 > num2)
        {
            res = num1 - num2;
        }
        else {
            res = num2 -num1;
        }

        System.out.println(res);
    }
}
