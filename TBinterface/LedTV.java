package TBinterface;   // 44. 인터페이스 사용하기

public class LedTV implements TV{   // LedTV가 TV 인터페이스를 구현, TV가 가진 기능들을 LedTV도 모두 갖게 하겠다
    
    @Override
    public void turnOn() {
        System.out.println("TV를 켜다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끄다.");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨 조절: "+ volume);
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널 변경: "+ channel);
    }
}
