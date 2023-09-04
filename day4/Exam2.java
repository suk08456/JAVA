package day4;
// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.

public class Exam2 {
    public static void main(String[] args) {



        // 출력 : 자동차가 최대속력 220km로 달립니다.

        car arr = new car();

        arr.km = 220;

        arr.speed();

        // 출력 : 자동차가 최대속력 250km로 달립니다.

        car arr2 = new car();

        arr2.km = 250;

        arr2.speed();

    }
}

class car{
    int km;

    public void speed(){
        System.out.printf("자동차가 최대속력 %d로 달립니다.\n", km);
    }
}

