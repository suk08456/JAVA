package day5.Casting;
// 문제 : 아래가 실행되도록 해주세요.

public class CastingExam2 {
    public static void main(String[] args) {

        전사 a전사 = new 전사();

        a전사.나이 = 20;

        a전사.a무기 = new 활1();
        a전사.a무기 = new 칼1();
    }
}
class 전사1{
    int 나이;
    무기 a무기;

}
class 칼1 extends 무기{

}
class 활1 extends 무기{

}
