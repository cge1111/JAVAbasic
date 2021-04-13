package thebookclass;  // 28. 메서드 사용

public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.method1();
        myclass.method2(10);
        myclass.method3();
        // int value = myclass.method3();
        // System.out.println("m3가 리턴한 값: "+ value);
        System.out.println("m3가 리턴한 값: "+ myclass.method3());

        myclass.method4(5,10);

        System.out.println("m5가 리천한 값: "+ myclass.method5(55));
        // int value2 = myclass.method5(55);
        // System.out.println("m5가 리턴한 값: "+ value2);
    }
}

// 실습예제
// https://thebook.io/006889/ch05/28/01/