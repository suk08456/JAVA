package day8.Exception;



public class Exception2 {
    public static void main(String[] args) {
        Person2 p1 = null;


        try {
            p1.hi();
        }catch(NullPointerException e){
            System.out.println("객체가 초기화가 안된거 같은데 ?");
        }

        System.out.println("프로그램 종류");
    }
}

class Person2{
    public void hi(){

    }
}