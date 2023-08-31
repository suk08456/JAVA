package day2;

public class ConditionEx {
    public static void main(String[] args) {

//        조건문 -> 택일구조

//        양자택일(이지선다)
//        남녀, 할인대상, 홀짝
        boolean isMale = true;

        if(isMale){
            System.out.println("남자");
        }
        if(!isMale){
            System.out.println("여자");
        }

//        삼자택일(삼지선다)
//        초중고, 직좌우
        int age2 = 12;
        if(age2 >= 8 && age2 <= 13){
            System.out.println("초등학교"); //8 ~ 13
        }
        else
        if(age2 >= 14 && age2 <= 16){
            System.out.println("중학교"); // 14 ~ 16
        }
        else
        if(age2 >= 17 && age2 <= 19){
            System.out.println("고등학교"); // 17 ~ 19
        }

//        오자택일(사지선다)
//        대학성적(A, B, C, D, F)
//        점수가 90 ~ 100 -> A
//        80 ~ 89 -> B
//        70 ~ 79 -> C
//        60 ~ 69 -> D
//        50 ~ 59 -> F
        int point = 83;
        if(point <= 100 && point >= 90){
            System.out.println("A");
        }
        else if(point <= 89 && point >= 80){
            System.out.println("B");
        }
        else if(point <= 70 && point >= 79){
            System.out.println("c");
        }
        else if(point <= 60 && point >= 69){
            System.out.println("d");
        }
        else if(point <= 50 && point >= 59){
            System.out.println("F");
        }



    }
}
