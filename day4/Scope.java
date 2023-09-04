package day4;

public class Scope {
    public static void main(String[] args) {
        System.out.println(Person7.avgAge);
//        System.out.println(Person.age); // 객체를 만들지 않았기 때문

        Person7 p1 = new Person7();
        System.out.println(p1.age);
        Person7.hi();
    }
}


class Person7 {
    static int avgAge = 100; // 클래스 변수
    int age = 30; // 인스턴스 변수

    public static void hi() {
        System.out.println("안녕");

    }
}