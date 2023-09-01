package day3;

public class Array {
    public static void main(String[] args) {


//        배열
//        데이터가 많아지면 변수만으로 관리하기가 힘듬

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

//        배열은 하나의 변수로 여러개의 값을 관리
//        1. 선언과 동시에 저장
        int[] arr= {1, 2, 3, 4, 5};   // int 5개 짜리 배열


//        순서(순변) - index 로 배열 요소에 접근
        System.out.println(arr[2]);
        System.out.println(arr[0]);


//        2. 선언하고 나중에 저장
//        new 자료형[개수}
        int[] arr2 = new int[100];  // 0  100개 만들어짐
        int[] arr3 = new int[5]; //0   5개 만들어짐

//       arr3 5개의 숫자 저장

        arr3[0] = 4;
        arr3[1] = 2;
        arr3[2] = 100;
        arr3[3] = 6;
        arr3[4] = 3;
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);

//        반복문 사용 가능
        for(int i = 0; i < 5; i++){
            System.out.println(arr3[i]);
        }

//        배열은 같은 자료형만 저장 가능하다.

//        arr4 = {1, "hello", true, 1.4}; -> X불가능하다


        String[] arr5 = new String[3];  //  null 3개가 채워짐. null은 값이 비어있다는 표현
//        "null" -> 문자열 , null -> 값없음

        System.out.println(arr5[2]);

        arr5[0] = "hello";
        arr5[1] = "bye";
        arr5[2] = "good";

        for(int i = 0; i < 3; i++){
            System.out.println(arr5[i]);
        }


    }
}

