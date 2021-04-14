package TBinterface;  // 44. 인터페이스 사용하기 예제2

public interface Meter2 {
    // public int BASE_FARE = 3000; 
    // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없습니다.)
    public abstract void start();
    public abstract int stop(int distance);
}
