package TBinterface.TBinterfaceExam;  // 45. 인터페이스의 default 메서드 예제

public class TaxiExam {   // class
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.afterMidnight();
        taxi.stop(10);
    } 
}
