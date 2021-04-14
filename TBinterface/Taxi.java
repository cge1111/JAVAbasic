package TBinterface;  // 44. 인터페이스 사용하기 예제

public class Taxi implements Meter {
    // Meter 인터페이스의 start와 stop 메서드를 구현해야 합니다.

    @Override
    public void start() {
    }

    @Override
    public int stop(int distance) {
        return distance*2;
    }


}
