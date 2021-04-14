package TBsuper;  // 41. 오버라이딩

public class Van extends Car {
    public void run() {
        super.run();   // 부모와 자식 둘 다 실행
        System.out.println("Van의 run메서드");
    }
}
