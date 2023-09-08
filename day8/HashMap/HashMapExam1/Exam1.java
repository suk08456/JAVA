package day8.HashMap.HashMapExam1;

import java.util.HashMap;

public class Exam1 {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();

        HashMap 사람1 = new HashMap();


        // import 단축키 -> alt + enter
        HashMap<String, Object> hong = new HashMap<>();

        // 사람 정보를 map으로 저장하고 출력하기
        // 사람 1 정보
        // 이름 : 홍길동
        // 나이 : 22
        // 키 : 170.5
        사람1.put("이름", "홍길동");
        사람1.put("나이", 22);
        사람1.put("키", 170.5);

        System.out.println(사람1.get("이름"));
        System.out.println(사람1.get("나이"));
        System.out.println(사람1.get("키"));

        // 사람 2 정보
        // 이름 : 홍길순
        // 나이 : 25
        // 키 : 162.4
        HashMap 사람2 = new HashMap();
        사람2.put("이름", "홍길순");
        사람2.put("나이", 25);
        사람2.put("키", 162.4);
        System.out.println(사람2.get("이름"));
        System.out.println(사람2.get("나이"));
        System.out.println(사람2.get("키"));

    }
}
