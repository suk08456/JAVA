package day7.DataTypeExam6;
// 3개의 자료형을 저장하기 위해 3개의 class를 만들었습니다. 그러나 저장소의 기능이 다 동일하므로 하나의 class만 만들어 3 자료형을 모두 저장하고 싶습니다. 가능하게 구현해주세요.

// 힌트 : 제너릭
public class DataTypeExam6 {
    public static void main(String[] args) {
        Int저장소 a저장소1 = new Int저장소();

        a저장소1.setData(30);
        int idata = (int)a저장소1.getData();  // 상위타입 > 하위타입
        System.out.println(idata);

        a저장소1.setData(5.5);
        double ddata = (double)a저장소1.getData();

        a저장소1.setData(new 사과());
        사과 a사과 = (사과)a저장소1.getData();

//        a저장소1.setData(5.5);
//
//        a저장소1.setData(new 사과());
//        int a = a저장소1.getData();



//        System.out.println(a);
//
//        Double저장소 a저장소2 = new Double저장소();
//
//        a저장소2.setData(5.5);
//        double b = a저장소2.getData();
//
//        System.out.println(b);
//
//
//        사과저장소 a저장소3 = new 사과저장소();
//
//        a저장소3.setData(new 사과());
//        사과 c = a저장소3.getData();
//
//        System.out.println(c);
    }
}
class 저장소{
    private Object data;

    public void setData(Object data){
        this.data = data;
    }
    private Object getData(){
        return this.data;
    }
}
//class Int저장소 {
//    Object data;
//
//    int getData() {
//        return (int)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//class Double저장소 {
//    Object data;
//
//    double getData() {
//        return (double)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}

class 사과 {
}
//
//class 사과저장소 {
//    Object data;
//
//    사과 getData() {
//        return (사과)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}