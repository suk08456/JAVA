package day4;
// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.
public class StaticExam1 {
    public static void main(String[] args) {

        CAR2 자동차 = new CAR2();

        자동차.color = "검정색";
        자동차.model =  "벤츠";

        자동차.달리다();
    }
}
class CAR2{
    String color;
    String model;
    public void 달리다(){
        System.out.printf("%s의 %s가 도로 위를 달리고 있다.\n", color, model);
    }
}
