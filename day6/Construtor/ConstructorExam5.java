//package day6.Construtor;
//
//public class ConstructorExam5 {
//    public static void main(String[] args) {
//        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;
//
//        System.out.println(엄지손가락_길이 + "cm");
//        // 출력 : 5cm
//    }
//}
//class 사람{
//    팔 a왼팔;
//
//    사람(){
//        this.a왼팔 = new 팔();
//    }
//}
//
//class 팔{
//    손 a손;
//
//    팔(){
//        this.a손 = new 손();
//    }
//}
//
//class 손{
//    손가락 a엄지손가락;
//
//    손(){
//        this.a엄지손가락 = new 손가락();
//    }
//}
//class 손가락{
//    int 길이 = 5;
//}