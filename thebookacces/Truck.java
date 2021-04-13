package thebookacces;  // 40. super와 부모 생성자

public class Truck extends Car {
    public Truck() {
        super("트럭"); // 부모 생성자 호출
        System.out.println("Truck의 기본 생성자입니다.");
    }
}
