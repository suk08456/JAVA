package day2;

public class LoopEx {
    public static void main(String[] args) {


//        2중 반복문

//        1. 1~5까지 10번 출력
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }

        for(int j = 0; j < 3; j++) {
            System.out.printf("===%d회차===\n", j + 1);
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        }


//        2. 직사각형 만들기

        /*
         *****
         *****
         *****
         */

        // v1 - 반복문을 사용하지 않은 버전. 크기가 작은 사각형은 그리기 쉽지만 커지면 힘들다. 사각형의 모양을 바꾸기 쉽지 않다.
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");



//        // v2 - 세로 방향은 쉽게 조작이 가능하고 크게 그리기 가능하지만 가로방향은 힘들다.
//        for(int i = 0; i < 100; i++) {
//            System.out.println("*****");
//        }


//        v3 - 세로, 가로 모두 반복문으로 크기 조절이 가능하므로 그리기 쉽고 변경이 용이하다.
        for(int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }


    }
}

