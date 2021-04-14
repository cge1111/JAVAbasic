package TBinterface;   // 45. 인터페이스의 default 메서드

public class MyCalTest {
    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);

        int i = cal.plus(3, 4);
        System.out.println(i);

        int j = cal.exec(5, 6);
        System.out.println(j);

        int m = cal.multiple(3, 4);
        System.out.println(m);

        Calculator.exec2(3, 4);    // 클래스명을 호출하는것처럼 출력(인터페이스 명.메서드명(); 형식)
    }
}
