package day2;

public class Condition {
    public static void main(String[] args) {

//        조건문
//        실행이 될 수도 있고 안될 수도 있는

        System.out.println("창문닫기");

//        비가 올 때만 창문을 닫기 ->
        boolean isRain = true;

        if(isRain){
        System.out.println("창문 닫기2");
        }

//        야식

//        소지금이 20000원 이상일 때

        int money = 0;

        if(money >= 20000){
            System.out.println("치킨");
        }

//        소지금이  20000원 미만, 2000원 이상일 때
        if(money >= 2000) {
            if(money < 20000){
            System.out.println("포카칩");
            }
        }
//        할인대상 -> 19세 이하, 60세 이상
        int age = 10;

        if(age <= 19 || age >= 60){
            System.out.println("할인대상");
        }



    }
}
