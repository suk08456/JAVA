package day8.ArraylistExam2;
// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
// ArrayList의 사이즈를 출력해주세요.
// ArrayList의 3,4번째 값을 읽어서 출력해주세요.
// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
// List의 모든 값을 출력해주세요.

import java.util.ArrayList;

public class Exam2 {
    public static void main(String[] args) {


        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        ArrayList<사람> 사람들 = new ArrayList<>();

        사람들.add(사람1);
        사람들.add(사람2);
        사람들.add(사람3);
        사람들.add(사람4);

        // 2. 네 사람에게 자기소개 시키기
        for(사람 a사람 : 사람들) {
            a사람.introduce();
        }

        // 3. 30대인 사람에게만 자기소개 시키기
        for(사람 a사람 : 사람들) {
            if (30 <= a사람.getAge() &&  a사람.getAge() < 40) {
                a사람.introduce();
            }
        }
    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
