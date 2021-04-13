package thebookclass;  // 34. 메서드 오버로딩

public class MethodOverloadExam {
    public static void main(String[] args) {
        MyClass2 m = new MyClass2();

        System.out.println(m.plus(4, 5));
        System.out.println(m.plus(1, 3, 6));
        System.out.println(m.plus("hello", " world"));
    }
}


// 클래스를 만드는 방법 : 클래스형, 변수명, new, 클래스(생성자 이름, 매개변수 괄호 순)