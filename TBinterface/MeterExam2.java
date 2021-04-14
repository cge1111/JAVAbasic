package TBinterface;  // 44. 인터페이스 사용하기 예제2

public class MeterExam2 {
    public static void main(String []args) {
        Taxi2 taxi = new Taxi2();
        System.out.println("기본요금 변경 전!!");
        taxi.stop(20);
        taxi.BASE_FARE = 2500;
        System.out.println("기본요금 변경 후!!");
        taxi.stop(20); 
    }
}
