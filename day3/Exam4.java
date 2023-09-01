package day3;

import javax.xml.namespace.QName;

public class Exam4 {
//    public static void ideal(){
//        System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
//    }
public static void introduce(int age) {
    String result = "안녕하세요. 저는" + age + "살 홍길동입니다.!";
    System.out.println(result);
}


    public static void main(String[] args) {

    for(int i = 0; i <= 10; i++){
        introduce(20);
    }
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!


    }
}
