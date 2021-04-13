package thebookclass; // 24. (참조형)String클래스

public class StringExam {
    
    public static void main(String[] args) {
        String str1 = "hello";  
        String str2 = "hello";  // 1,2는 같은 위치

        String str3 = new String("hello"); // 새로운 위치
        String str4 = new String("hello");

        System.out.println(str1.substring(3));  // 인덱스가 3번인 것부터 잘라서 보여줌
        System.out.println(System.identityHashCode(str1));  // 주소값 출력
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        if (str1==str2)  // ==는 주소를 비교, 글자를 비교할 때는 equals를 사용한다.
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");
        else
            System.out.println("str3과 str4는 다른 레퍼런스입니다.");

        if(str3==str4)
            System.out.println("str3과 str4는 같은 레퍼런스입니다.");
        else
            System.out.println("str3과 str4는 다른 레퍼런스입니다.");
    }
}

// Quiz. str1 str2 without NEW keyword -> hello
// str3 str4 with NEW keyword          -> hello
// str1~str4 모든 주소 출력 System.out.println(System.identityHashCode(str1));




/*
논리형: boolean
문자형: char
정수형: byte, short, int, long
실수형: float, double
*/
