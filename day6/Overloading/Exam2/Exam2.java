package day6.Overloading.Exam2;

public class Exam2 {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5
    }
}
class 계산기{
    int 더하기(int num1, int num2){
        return num1 + num2;
    }
    int 더하기(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    double 더하기(double num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}
