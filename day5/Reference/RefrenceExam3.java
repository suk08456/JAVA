package day5.Reference;
// 문제 : 레퍼런스변수에 값 할당과정 설명

// 과정설명
// ...
public class RefrenceExam3 {
    // 메인 함수
    public static void main(String[] args) {
        // 설명
        자동차 a자동차;

        // 설명
        a자동차 = new 자동차();

        // 설명
        a자동차.달리다();
    }
}

// class => 설계도, 틀(객체를 만들기 위한)
class 자동차 {
    // 달리다 함수/메서드
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}
