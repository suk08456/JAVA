package day3;

import java.sql.SQLOutput;

public class Function {


//    함수 정의
//    void - 리턴타입
//    test - 함수명
//    () - 매개변수
    public static void test() {

        System.out.println("코드1");
        System.out.println("코드2");
        System.out.println("코드3");
    }

    public static void plus(int num1, int num2) {
        int result = num1 * num2;

        System.out.println(result);
    }
    //    return
//    함수가 끝나면 호출한 부분으로 리턴(돌아간다)한다.
//    main 함수
    public static void main(String[] args) {  //main함수의 시작
//        함수
//        코드 저장소
//        입력 -> (<처리> -> 출력)

//       변수

//        int a = 2;

//        int a;  //선언
//        a = 2;   //할당
//        함수
//        System.out.println(a);
//        System.out.println(a);
//        System.out.println(a);


//        함수
//        1. 함수는 코드 저장소
//        2. 함수 규칙
//        - 함수는 정의해야 한다. -> 함수 정의 문법 사용
//        - 구칙1. 함수는 클래스 안에서 정의해야 한다.(함수안에 함수 정의 X)
//        - 규칙2. 리턴타입, 함수명, 매개변수를 지정해야 한다.
//        - 규칙3. 같은 이름의 함수를 2개 이상 만들지 않는다.
//        - 규칙4. 함수는 호출(사용) 해야만 실행된다.
//        - 규칙5. 함수의 개수는 제한이 없음.

        //정의된 함수를 호출 (사용)
//        1. 함수의 가장 큰 사용 목적 -> 코드의 재사용
//        test();
//        System.out.println("코드4");

        plus(10, 20); // 30
        plus(100, 200); //300
//
//        test();
//
//        System.out.println("코드5");
//        test();
//
//        System.out.println("코드5");

        //함수의 확장 -> 매개변수
    }   //main함수의 끝
}
