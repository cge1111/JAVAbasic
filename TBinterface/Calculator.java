package TBinterface;   // 45. 인터페이스의 default 메서드

public interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j); 

    default int exec(int i, int j) {   // 인터페이스에서 메서드를 구현
        return i + j;
    }

    public static int exec2(int i, int j) {
        return i * j;
    }

}
