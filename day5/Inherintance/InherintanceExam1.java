package day5.Inherintance;

public class InherintanceExam1 {

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
- D4 완료 : 클래스와 메서드를 만들어서 처리
- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
- D5 완료 : 메서드 오버라이드를 사용해서 처리
- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
- D6 완료 : 고무2오리 추가후 고무오리 상속으로 해결
- D7 요구 : 새로운 기능인 헤엄치기를 추가하고 오리처럼 날고 고무오리처럼 헤엄치는 아수라 오리를 추가해주세요.
*/


    public static void main(String[] args) {

        오리 a오리 = new 오리();

        a오리.푸드덕();
        a오리.날다();
        a오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.

        천둥오리 a천둥오리 = new 천둥오리();
        a천둥오리.덕();
        a천둥오리.헤엄치다();

        흰오리 a흰오리 = new 흰오리();
        a흰오리.히이잉();
        a흰오리.날다();
        a흰오리.헤엄치다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();

        고무오리2 a고무오리2 = new 고무오리2();
        a고무오리2.날다();
        a고무오리2.헤엄치다();

        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.헤엄();
        a아수라오리.날다();
        a아수라오리.헤엄치다();
    }
}

class 오리 extends bird{
    public void 푸드덕() {

        System.out.println("푸드덕 푸드덕");
    }
    public void 헤엄치다(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
class bird{
    public void 날다(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
class 천둥오리 extends bird{
    String color;
    public void 덕(){
        System.out.println("덕덕덕");
    }
    public void 헤엄치다(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
class 흰오리 extends bird{
    String color;
    public void  히이잉(){
        System.out.println("히이잉 ~ 히이잉 ~");
    }
    public void 헤엄치다(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}

class 고무오리 extends bird{
    String color;
    public void 날다(){
        System.out.println("고무는 날지 못해요");
    }
    public void 헤엄치다() {
        System.out.println("오리가 오리발로 춤을 춥니다.");
    }
}

class 고무오리2 extends 고무오리 {
    public void 헤엄치다() {
        System.out.println("오리가 오리발로 춤을 춥니다.");
    }
}

class 아수라오리 extends bird {
    public void 헤엄() {
        System.out.println("수영을 잘해요");
    }
    public void 헤엄치다() {
        System.out.println("오리가 오리발로 춤을 춥니다.");
    }
}

