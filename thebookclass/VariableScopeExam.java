package thebookclass;  // 30. 변수의 스코프와 static

public class VariableScopeExam {
    int globalScope = 10;  // 1
    static int staticVal = 7;  // 3에서 static한 int형 변수 staticVal을 실행

    // value 변수는 scopeTest() 메서드 안에서만 사용 가능합니다.
    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
        // System.out.println(localScope); // 컴파일 오류가 발생합니다.
        // System.out.println(value);
        System.out.println(value2);      // 컴파일 오류가 발생합니다.
    }

    public static void main(String[] args) {
        System.out.println(staticVal);  // 3

        // 참조 변수 v1은 VariableScopeExam이라는 인스턴스가 생성될 때 globalScope 값을 저장하는 공간을 별개로 하나 가집니다.
        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);  // 4 = 1을 보면 globalScope에 원래 10이 들어있었기 때문에 10을 출력
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope); // v1의 globalScope에 10이란 값을 넣었기 때문에 10을 출력
        System.out.println(v2.globalScope); // v2의 globalScope에 20이란 값을 넣었기 때문에 20을 출력

        // 객체를 생성하지도 않았는데 객체의 속성을 사용하겠다고 하는 것이므로 당연히 안 됩니다.
        // System.out.println(globalScope); // 컴파일 오류가 발생합니다. -> 클래스를 인스턴스화하지 않았다.
        // System.out.println(localScope);  // 컴파일 오류가 발생합니다.
        // System.out.println(value);       // 컴파일 오류가 발생합니다.
    }
    
}
/*
public static void main(String[] args) { }
지금까지 정의한 모든 메서드는 메서드를 실행하기 위해,
1. 클래스의 인스턴스를 생성하고
2. 인스턴스를 통해 클래스를 호출했습니다.
main도 메서드인데, main 메서드는 이런 과정을 거치지 않았습니다.

class CodeRunner{
    // 직접 정의한 메서드 myPrint
    public void myPrint() {
        System.out.println("안녕!");
    }
    public static void main(String[] args) {
        myPrint 메서드를 호출하기 위해서는
        CodeRunner 클래스에 인스턴스를 생성하고,
        인스턴스에 점을 찍어 myPrint에 접근합니다 
        CodeRunner codeRunner = new CodeRunner(); // 인스턴스 생성
        codeRunner.myPrint(); // 메서드 호출

        그런데 메인 메서드는 메인 메서드를 위해 따로 인스턴스를 생성한 적이 없고,
        또 codeRunner.main()과 같이 메서드를 호출한 적도 없습니다
    }
}
즉, 클래스를 인스턴스화하지 않고 사용해왔습니다. 객체를 찍지 않고 사용 = static
*/



// 변수의 스코프와 static 실습
// https://thebook.io/006889/ch05/30/01/