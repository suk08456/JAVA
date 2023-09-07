package day7.AccessModifier;

public class AccessModifier {
    public static void main(String[] args) {

//        접근제어자의 종류
        // public -> 어디서든 누구나 접근가능 (v)
        // protecter -> 같은 패키지(폴더) + 상속관계에서만 가능
        // degault -> 같은 패키지에서만 가능
        // private -> 자기 자신만 가능 (v)


        Caculator c1 = new Caculator();
        System.out.println(c1.plus());

//        c1.num1 = 100;
//        c1.num2 = 200;

        System.out.println(c1.plus());
        System.out.println(c1.devide());


        // 숫자를 0으로 나누면 안된다.
        // 객체의 인스턴스 변수를 바꾸는 것은 부담스러운 작업이다.
        // private 접근제어자를 이용해 접근을 막는다.
        c1.setNum1(100);
        c1.setNum2(200);


        c1.setNum1(100);
        c1.setNum2(0);
        //메서드를 이용해 우회 접근하면 코드를 이용해 잘못된 데이터의 유입을 막을수있다.

//        System.out.println(c1.getNum1);
        System.out.println(c1.plus());
        System.out.println(c1.devide());

        // Calculator2는 다른 폴더에 존재하고 Calculator2의 plus() 메서드는 접근제어자가 default이기 때문에 여기서 사용 불가능
    }
}

class Caculator{
    // 그냥 웬만하면 객체 변수는 privat

    private int num1 = 10;
    private int num2 = 20;

    // 외부에서 객체 변수에 접근하기 위한 메서드 2개
    // setter - 변수의 값을 세팅
    // getter - 변수의 값을 가져감
    // setter, getter 이름 짓는법
    // set + 변수명, get + 변수명, 단 변수명 시작 알파벳은 대문자


    public void setNum1(int num){  //num1 변수에 대한 setter
        this.num1 = num;
    }

    public void setNum2(int num){ //num2변수에 대한 setter
        if(num == 0){
            System.out.println("0은 안됩니다");
            return;
        }
        this.num2 = num;
    }
    public int getNum1(){ // num1 변수에 대한 getter
        return this.num1;
    }
    public int getNum2() { // num2 변수에 대한 getter
        return this.num2;
    }
    public int plus(){
        return num1 + num2;
    }
    public double devide(){
        return (double)num1/num2;
    }
}
