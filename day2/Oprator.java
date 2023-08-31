package day2;

public class Oprator {
    public static void main(String[] args) {


//        산술연산자
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);

//        나누기 할 때 -> 정수 / 정수 = 정수
//        컴퓨터는 정수끼리, 실수끼리 계산 가능(1, 1.0은 완전 다른 수)
//        정수 - int, 실수 - double
        System.out.println(10 / 20);
        System.out.println(1 / 2);

        int a = 10;
        double b = 10.1;
        String c = "홍길동";

//        나머지 구하기
//        배수, 짝수 구할 때 사용, 주기 표현
        System.out.println(10 % 3);

//        비교 연산자
        System.out.println(10 > 5);  //네
        System.out.println(10 < 5);  //아니요
        System.out.println(10 >= 5); //네
        System.out.println(10 <= 5); //아니요
        System.out.println(10 == 5); //아니요
        System.out.println(10 != 5); //네

//        비교연산자의 결과는 논리값(맞다/틀리다)
//        논리값 -> boolean

        System.out.println(10);
        System.out.println("10");

        boolean d = true;
        boolean e = false;

//        증감연산자
        System.out.println("=====증감연산자=====");
        int num = 10;
        System.out.println(num + 10);

//        num은 몇인가 ? 20 = false, 변수는 대입하지 않으면 안바뀜
        System.out.println(num);  //num은 10


//        num의 값을 10 증가
        num = num + 10;
        System.out.println(num);

//        num의 값을 5감소
        num -= 5;
        System.out.println(num);  //15

//        num의 값을 2배 증가
        num *= 2;
        System.out.println(num);

//        num의 값을 절반으로 감소
        num /= 2;
        System.out.println(num);

//        1증가
//        num = num + 1;
//        num += 1;
//        num++;

//        1감소
//        num = num - 1;
//        num -= 1;
//        num--;



        //        논리연산자

//        곱연산(and) - &&
////        모두 참이면 참, 그 외 거짓
//        System.out.println(true && false);
//        System.out.println(false && false);
//        System.out.println(false && true);
//        System.out.println(true && true);
//
////        합연산(or) - ||
////        모두 거짓이면 거짓, 그 외 참
//        System.out.println(true || false);
//        System.out.println(false || false);
//        System.out.println(false || true);
//        System.out.println(true || true);




    }
}
