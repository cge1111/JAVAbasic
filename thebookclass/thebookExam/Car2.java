package thebookclass.thebookExam;  // 34. 메서드 오버로딩 실습

public class Car2 {
    public void run() {                                        // 리턴값이 없을때는 void를 사용
        System.out.println("차가 달립니다.");        
    }
    // int형 변수를 매개변수로 받는 run 메서드를 추가해보세요.
    public void run (int speed) {                             // 리턴값이 없을때는 void를 사용
        System.out.println("차가 " + speed + "km로 답립니다.");
    }
}
