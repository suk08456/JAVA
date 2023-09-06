package day6.Overloading.Exam2;

public class Contructorloading {
    public static void main(String[] args) {
        Person p1 = new Person(20, "홍길동");
        p1.introduce();

        Person p2 = new Person(20, "이순신");
        p2.age = 20;
        p2.name = "이순신";
        p2.introduce();

        Person p3 = new Person(20, "유관순");
        p3.name = "유관순";
        p3.introduce();
    }
}

class Person{
    int age;
    String name;

    Person(){

    }
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    Person(int age){
        this.age = age;
    }
    void introduce(){
        System.out.printf("%d살 %s 입니다\n", age, name);
    }
}
