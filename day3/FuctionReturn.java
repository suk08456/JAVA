package day3;

public class FuctionReturn {

    public static double circleArea(int radius){
        double result = radius *  radius * 3.14;
        System.out.println(result);

        return result;
    }

//    public static void pie2(int pie2){
//        System.out.println(pie2 * pie2 * 3.14 / 2);
//    }
//    public static void pie3(int pie3){
//        System.out.println(pie3 * pie3 * 3.14 * 2);
//    }
    public static void main(String[] args) {

//        1. 반지름으로 원의 넓이를 구하는 함수 만들기.(정의)
//        반지름 * 반지름 * 3.14

//        2. 반지름이 5인 원의 넓이를 구해서 출력

        double num = circleArea(5 );
        System.out.println(num * 2);

//        모든값 -> 자료형
//        1 -> int
//        3.14 -> double
//        "hello" -> String
//        ture -> boolean

//        3. 반지름이 5인 원의 넓이를 2로 나눈 값.

        System.out.println(num / 2);

//        circleArea(5);
//
////        4. 반지름이 5인 원의 넓이를 2 곱한 값

        System.out.println(num * 2);

//        리턴 -> 함수가 작업한 결과를 직접 받을 수 있음.
//        함수의 결과를 2차 가공할 수 있음.
//
    }
}
