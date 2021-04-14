package TBinterface;  // 44. 인터페이스 사용하기

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.changeVolume(8);
        tv.changeChannel(39);
        tv.turnOff();
    }
}

