package TBinterface;  // 44. 인터페이스 사용하기 예제2

public class Taxi2 implements Meter2 {
    public int BASE_FARE = 3000;
    // BASE_FARE를 정의한 부분을 Meter 인터페이스가 아닌 Taxi 클래스로 옮기면 됩니다
    
    public void start() {
        System.out.println("운행을 시작합니다.");
    }
    
    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원입니다.");
        return fare;
    }
}

    
    
