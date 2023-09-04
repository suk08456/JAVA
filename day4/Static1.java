package day4;

public class Static1 {
    public static void main(String[] args) {

        Person2 p1 = new Person2();
        Person2 p2 = new Person2();

        p2.age = 30;
        p2.name = "홍길동";
        p2.avgAge = 90;

        p1.age = 28;
        p1.name = "장찬익";
        p1.avgAge = 80;

        p1.getLife();
        p2.getLife();
    }
}
class Person2{

    //인류 평균 나이는 모든 사람이 동일하게 공유해야 하는 값.
    //객체들이 공유해야 하는 자원에는 static을 붙인다.
    int avgAge;
    int age;
    String name;


    //static은 non - static(static이 붙지 않은 것)을 사용할 수 없다.
    //함수에는 일반적으로 static을 붙이지 않는다.
    //단 main 함수는 예외
    public void getLife(){
        System.out.printf("%s의 남은 수명은 약 : %d년 입니다.\n", name, (avgAge - age));
    }
}
