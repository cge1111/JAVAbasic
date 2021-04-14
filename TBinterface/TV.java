package TBinterface;     // 43. 인터페이스 만들기 -> 명세표 

public interface TV {

    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();   //  매개변수는 괄호 필수
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}

