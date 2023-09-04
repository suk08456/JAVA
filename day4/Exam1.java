package day4;
// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.

public class Exam1 {
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.

        ride v1 = new ride();

        v1.car = "자동차";

        for(int i = 0; i < 3; i++){
            v1.custom();
        }

        ride v2 = new ride();

        v2.car = "자동차";

        v2.custom();
        v2.custom();
        v2.custom();

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.



    }
}
class ride{
    String car;

    public void custom(){
        System.out.printf("%s가 달립니다\n", car);
    }
}
