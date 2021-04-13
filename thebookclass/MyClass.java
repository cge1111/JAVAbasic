package thebookclass;  // 27. 메서드 선언

public class MyClass {
    // public 리턴형 메서드명 (매개변수들) {실행될 코드}
    //  리턴형이 없을 때는 void라는 예약어를 적어, void라는 예약어는 리턴형이 없다는 뜻
    public void method1() {
         System.out.println("m1이 실행됨...");
    }

    // public 리턴형 메서드명 (매개변수들) { 필요한 기능 구현 }
    // 정수를 입력받아 뭔가를 수행하고 리턴은 하지 않는 메서드
    public void method2(int x) {
        System.out.println(x+"을 이용한 m2 실행");
    }

    // 아무것도 입력되지 않았지만, 뭔가를 수행해서 값을 돌려주는 메서드
    public int method3() {
        System.out.println("m3 실행");
        return 10;
    }

    // 정숫값을 두 개 입력받고, 리턴은 하지 않는 메서드
    public void method4(int x, int y) {
        System.out.println(x + " "+ y + " "+ "m4 실행");
    }

    // 값을 받아서 값을 출력하는 형태
    public int method5(int y) {
        System.out.println(y + "이용한 m5 실행");
        return y*2;
    }
}

// 예제(실습)
// https://thebook.io/006889/ch05/27/01/
