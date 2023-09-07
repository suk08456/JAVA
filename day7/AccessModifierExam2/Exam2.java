package day7.AccessModifierExam2;

public class Exam2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 구현시작#
        p1.setId(20);
        // 구현끝
        System.out.println("제 번호는 " + p1.getId() + "입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}

class Person {
    private int id;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}

