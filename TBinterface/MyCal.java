package TBinterface;   // 45. 인터페이스의 default 메서드

public class MyCal implements Calculator {
    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int multiple(int i, int j) {
        return i * j;
    }
}
