package thebookclass.thebookExam;  // 34. 메서드 오버로딩 실습
 
public class CarExam2 {
    public static void main(String[] args) {
        // Person 클래스에서 String과 int를 매개변수로 받는 생성자를 호출합니다.
        Car2 car = new Car2();

        car.run();
        // int형 매개변수를 받는 run을 호출합니다.
        car.run(100);
    }
}
